package pro.gugg.superaa.persistent.service.impl;

import pro.gugg.superaa.persistent.po.SettlementBillEntity;
import pro.gugg.superaa.persistent.mapper.SettlementBillMapper;
import pro.gugg.superaa.persistent.service.SettlementBillService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 结算账单表 服务实现类
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@Service
open class SettlementBillServiceImpl : ServiceImpl<SettlementBillMapper, SettlementBillEntity>(), SettlementBillService {

}
