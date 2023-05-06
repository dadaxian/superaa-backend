package pro.gugg.superaa.persistent.po

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName


@TableName("user")
open class UserEntity {
    @TableId(type=IdType.AUTO)
    var id: Long? = null

    var appId: String? = null

    var openId: String? = null

    var unionId: String? = null

    var nickName: String? = null

    var avatarUrl: String? = null

    var accountType: Byte? = null

    var deleted: Short? = null

    var createTime: java.sql.Timestamp? = null

    var updateTime: java.sql.Timestamp? = null


    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "appId = $appId " +
                "openId = $openId " +
                "unionId = $unionId " +
                "nickName = $nickName " +
                "avatarUrl = $avatarUrl"+
                "accountType = $accountType " +
                "deleted = $deleted " +
                "createTime = $createTime " +
                "updateTime = $updateTime " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UserEntity

        if (id != other.id) return false
        if (appId != other.appId) return false
        if (openId != other.openId) return false
        if (unionId != other.unionId) return false
        if (nickName != other.nickName) return false
        if (avatarUrl != other.avatarUrl) return false
        if (accountType != other.accountType) return false
        if (deleted != other.deleted) return false
        if (createTime != other.createTime) return false
        if (updateTime != other.updateTime) return false

        return true
    }

}

