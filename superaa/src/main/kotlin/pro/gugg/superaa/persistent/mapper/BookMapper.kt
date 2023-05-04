package pro.gugg.superaa.persistent.mapper;

import pro.gugg.superaa.persistent.po.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 账本表 Mapper 接口
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 02:12:49
 */
@Mapper
interface BookMapper : BaseMapper<Book>
