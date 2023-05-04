package pro.gugg.superaa.persistent.service.impl;

import pro.gugg.superaa.persistent.po.ConsumeBillEntity;
import pro.gugg.superaa.persistent.mapper.ConsumeBillMapper;
import pro.gugg.superaa.persistent.service.ConsumeBillService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消费账单表 服务实现类
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@Service
open class ConsumeBillServiceImpl : ServiceImpl<ConsumeBillMapper, ConsumeBillEntity>(), ConsumeBillService {

}
