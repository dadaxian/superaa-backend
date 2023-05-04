package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.sql.Timestamp

/**
 * <p>
 * 消费账单参与人明细
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@TableName("consume_bill_benefit_user")
class ConsumeBillBenefitUserEntity : Serializable {

    /**
     * 参与人明细id
     */
    @TableField("id")
    var id: Long? = null

    /**
     * 参与人id
     */
    @TableField("benefit_user_id")
    var benefitUserId: Long? = null

    /**
     * 账单受益（参与）过程值（单位0.01）
     */
    @TableField("bill_benefit_process_value")
    var billBenefitProcessValue: Int? = null

    /**
     * 账单受益（参与）结果值（单位0.01）
     */
    @TableField("bill_benefit_result_value")
    var billBenefitResultValue: Int? = null

    /**
     * 消费账单id
     */
    @TableField("consume_bill_id")
    var consumeBillId: Long? = null

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    var createTime: Timestamp? = null

    /**
     * 更新时间
     */
    @TableField("update_time")
    var updateTime: Timestamp? = null

    override fun toString(): String {
        return "ConsumeBillBenefitUserEntity{" +
        "id=" + id +
        ", benefitUserId=" + benefitUserId +
        ", billBenefitProcessValue=" + billBenefitProcessValue +
        ", billBenefitResultValue=" + billBenefitResultValue +
        ", consumeBillId=" + consumeBillId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}"
    }
}
