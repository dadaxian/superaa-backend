package pro.gugg.superaa.persistent.service.impl;

import pro.gugg.superaa.persistent.po.ConsumeTypeEntity;
import pro.gugg.superaa.persistent.mapper.ConsumeTypeMapper;
import pro.gugg.superaa.persistent.service.ConsumeTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消费类型 服务实现类
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@Service
open class ConsumeTypeServiceImpl : ServiceImpl<ConsumeTypeMapper, ConsumeTypeEntity>(), ConsumeTypeService {

}
