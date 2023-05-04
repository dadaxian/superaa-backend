package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.sql.Timestamp

/**
 * <p>
 * 消费账单表
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@TableName("consume_bill")
class ConsumeBillEntity : Serializable {

    /**
     * 消费账单id
     */
    @TableField("id")
    var id: Long? = null

    /**
     * 消费账单描述
     */
    @TableField("describe")
    var describe: String? = null

    /**
     * 账单付款人
     */
    @TableField("pay_user_id")
    var payUserId: Long? = null

    /**
     * 账单摊钱方式
1：比例
2：金额
3：份数
4：均分
     */
    @TableField("split_way")
    var splitWay: Short? = null

    /**
     * 账单消费类别
     */
    @TableField("bill_type_id")
    var billTypeId: Long? = null

    /**
     * 账单消费时间
     */
    @TableField("bill_time")
    var billTime: Timestamp? = null

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
    @TableField("update_time")
    var updateTime: Timestamp? = null

    override fun toString(): String {
        return "ConsumeBillEntity{" +
        "id=" + id +
        ", describe=" + describe +
        ", payUserId=" + payUserId +
        ", splitWay=" + splitWay +
        ", billTypeId=" + billTypeId +
        ", billTime=" + billTime +
        ", bookId=" + bookId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}"
    }
}
