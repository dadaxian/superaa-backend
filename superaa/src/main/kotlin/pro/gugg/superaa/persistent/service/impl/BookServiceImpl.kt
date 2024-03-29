package pro.gugg.superaa.persistent.service.impl;

import pro.gugg.superaa.persistent.po.BookEntity;
import pro.gugg.superaa.persistent.mapper.BookMapper;
import pro.gugg.superaa.persistent.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账本表 服务实现类
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 02:44:22
 */
@Service
open class BookServiceImpl : ServiceImpl<BookMapper, BookEntity>(), BookService {

}
