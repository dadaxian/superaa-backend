package pro.gugg.superaa.web.controller;

import com.baomidou.mybatisplus.extension.kotlin.KtQueryWrapper
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.gugg.superaa.persistent.po.BookEntity
import pro.gugg.superaa.persistent.po.BookUserRelEntity
import pro.gugg.superaa.persistent.po.ConsumeBillEntity
import pro.gugg.superaa.persistent.po.UserEntity
import pro.gugg.superaa.persistent.service.BookService
import pro.gugg.superaa.persistent.service.BookUserRelService
import pro.gugg.superaa.persistent.service.ConsumeBillService
import pro.gugg.superaa.persistent.service.UserEntityService
import pro.gugg.superaa.vo.BookVo
import java.text.SimpleDateFormat
import java.util.stream.Collectors.toList

/**
 * <p>
 * 账本表 前端控制器
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 02:44:22
 */
@RestController
@RequestMapping("/book")
@CrossOrigin(origins = ["*"])
class BookController(
    private val bookService: BookService,
    private val bookUserRelService: BookUserRelService,
    private val userEntityService: UserEntityService,
    private val consumeBillService: ConsumeBillService
) {
    @RequestMapping("/get/all")
    fun getAllBook(): List<BookEntity>? {
        return bookService.list()
    }

    @RequestMapping("/getBooksByCreatePeople/{id}")
    fun getBooks(@PathVariable("id") id: Long): List<BookVo>? {
        val books: MutableList<BookEntity>? =
            bookService.list(KtQueryWrapper(BookEntity::class.java).eq(BookEntity::createUserId, id))
        val bookVos: List<BookVo>? = books?.map { bookEntity ->
            val bookVo = BookVo()
            bookVo.id = bookEntity.id
            bookVo.name = bookEntity.name
            bookVo.createTime =
                if (bookEntity.createTime == null) null else SimpleDateFormat("yyyy年MM月dd日").format(bookEntity.createTime)
            bookVo.pay = 100.30
            bookVo.avatars = bookUserRelService.list(
                KtQueryWrapper(BookUserRelEntity::class.java).eq(
                    BookUserRelEntity::bookId,
                    bookEntity.id
                )
            ).stream().map({ bu -> userEntityService.getById(bu.userId)?.avatarUrl }).collect(toList()).toTypedArray()
            bookVo
        }
        return bookVos
    }

    @RequestMapping("/getBookDetailById/{id}")
    fun getBookDetail(@PathVariable("id") id: Long): BookVo? {
        val bookEntity = bookService.getById(id);
        val bookVo = BookVo()
        bookVo.id = bookEntity.id
        bookVo.name = bookEntity.name
        bookVo.createTime =
            if (bookEntity.createTime == null) null else SimpleDateFormat("yyyy年MM月dd日").format(bookEntity.createTime)
        val consumeBillEntities =
            consumeBillService.list(KtQueryWrapper(ConsumeBillEntity::class.java).eq(ConsumeBillEntity::bookId, id))
        consumeBillEntities.forEach { bookVo.allCost = bookVo.allCost!! + it.cost!! }
        bookVo.avatars = bookUserRelService.list(
            KtQueryWrapper(BookUserRelEntity::class.java).eq(
                BookUserRelEntity::bookId,
                bookEntity.id
            )
        ).stream().map({ bu -> userEntityService.getById(bu.userId)?.avatarUrl }).collect(toList()).toTypedArray()

        return bookVo
    }

    @RequestMapping("/get/name/{name}")
    fun getUserByNickName(@PathVariable("name") name: String): BookEntity? {
        return bookService.getOne(KtQueryWrapper(BookEntity::class.java).eq(BookEntity::name, name))
    }

    @RequestMapping("add/{name}")
    fun addUser(@PathVariable("name") name: String): String {
        val bookEntity = BookEntity()
        bookEntity.name = name
        return if ((bookService.save(bookEntity))) {
            "success"
        } else {
            "fail"
        }
    }
}
