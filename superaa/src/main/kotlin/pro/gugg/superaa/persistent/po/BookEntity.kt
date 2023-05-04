package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.sql.Timestamp

/**
 * <p>
 * 账本表
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 02:44:22
 */
@TableName("book")
class BookEntity : Serializable {

    /**
     * 账本id
     */
    @TableId(value = "id", type = IdType.AUTO)
    var id: Long? = null

    /**
     * 账本名称
     */
    @TableField("name")
    var name: String? = null

    /**
     * 创建人id
     */
    @TableField("create_user_id")
    var createUserId: Long? = null

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
        return "BookEntity{" +
        "id=" + id +
        ", name=" + name +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}"
    }
}
