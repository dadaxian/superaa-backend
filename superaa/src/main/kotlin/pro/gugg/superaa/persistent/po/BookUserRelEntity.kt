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
 * 账本用户关系表
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@TableName("book_user_rel")
class BookUserRelEntity : Serializable {

    /**
     * 账本用户关系id
     */
    @TableId(value = "id", type = IdType.AUTO)
    var id: Long? = null

    /**
     * 用户id
     */
    @TableField("user_id")
    var userId: Long? = null

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
        return "BookUserRelEntity{" +
        "id=" + id +
        ", userId=" + userId +
        ", bookId=" + bookId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}"
    }
}
