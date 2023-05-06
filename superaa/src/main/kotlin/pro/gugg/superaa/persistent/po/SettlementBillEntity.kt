package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.*
import java.io.Serializable
import java.sql.Timestamp

/**
 * <p>
 * 结算账单表
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@TableName("settlement_bill")
class SettlementBillEntity : Serializable {

    /**
     * 结算账单id
     */
    @TableId(type= IdType.AUTO)
    var id: Long? = null

    /**
     * 结算账单金额（单位0.01）
     */
    @TableField("bill_value")
    var billValue: Int? = null

    /**
     * 结算账单付款人id
     */
    @TableField("pay_user_id")
    var payUserId: Long? = null

    /**
     * 结算账单收款人id
     */
    @TableField("receive_user_id")
    var receiveUserId: Long? = null

    /**
     * 是否已结算（1：是；0：否）
     */
    @TableField("is_settled")
    var isSettled: Short? = null

    /**
     * 账本id
     */
    @TableField("book_id")
    var bookId: Long? = null

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    var createTime: Timestamp? = null

    /**
     * 更新时间
     */
    @TableField("uodate_time")
    var uodateTime: Timestamp? = null

    override fun toString(): String {
        return "SettlementBillEntity{" +
        "id=" + id +
        ", billValue=" + billValue +
        ", payUserId=" + payUserId +
        ", receiveUserId=" + receiveUserId +
        ", isSettled=" + isSettled +
        ", bookId=" + bookId +
        ", createTime=" + createTime +
        ", uodateTime=" + uodateTime +
        "}"
    }
}
