package pro.gugg.superaa.web.controller;

import com.baomidou.mybatisplus.extension.kotlin.KtQueryWrapper
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.gugg.superaa.persistent.po.BookEntity
import pro.gugg.superaa.persistent.po.UserEntity
import pro.gugg.superaa.persistent.service.BookService

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
class BookController(private val bookService: BookService) {
    @RequestMapping("/get/{id}")
    fun getUser(@PathVariable("id") id: Long): BookEntity? {
        return bookService.getById(id)
    }

    @RequestMapping("/get/name/{name}")
    fun getUserByNickName(@PathVariable("name") name: String): BookEntity? {
        return bookService.getOne(KtQueryWrapper(BookEntity::class.java).eq(BookEntity::name,name))
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
