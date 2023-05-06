package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.*
import java.io.Serializable
import java.sql.Timestamp

/**
 * <p>
 * 消费类型
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@TableName("consume_type")
class ConsumeTypeEntity : Serializable {

    /**
     * 消费类型id
     */
    @TableId(type= IdType.AUTO)
    var id: Long? = null

    /**
     * 消费类型名称
     */
    @TableField("name")
    var name: String? = null

    /**
     * 账本id
     */
    @TableField("book_id")
    var bookId: Long? = null

    /**
     * 类型icon
     */
    @TableField("icon")
    var icon: String? = null

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
        return "ConsumeTypeEntity{" +
        "id=" + id +
        ", name=" + name +
        ", bookId=" + bookId +
        ", icon=" + icon +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}"
    }
}
