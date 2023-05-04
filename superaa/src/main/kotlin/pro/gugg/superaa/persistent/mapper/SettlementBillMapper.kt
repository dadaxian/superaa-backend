package pro.gugg.superaa.persistent.mapper;

import pro.gugg.superaa.persistent.po.SettlementBillEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 结算账单表 Mapper 接口
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@Mapper
interface SettlementBillMapper : BaseMapper<SettlementBillEntity>
