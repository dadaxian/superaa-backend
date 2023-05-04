package pro.gugg.superaa.persistent.service.impl;

import pro.gugg.superaa.persistent.po.BookUserRelEntity;
import pro.gugg.superaa.persistent.mapper.BookUserRelMapper;
import pro.gugg.superaa.persistent.service.BookUserRelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账本用户关系表 服务实现类
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@Service
open class BookUserRelServiceImpl : ServiceImpl<BookUserRelMapper, BookUserRelEntity>(), BookUserRelService {

}
