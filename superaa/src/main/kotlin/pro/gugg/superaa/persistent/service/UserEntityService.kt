package pro.gugg.superaa.persistent.service

import com.baomidou.mybatisplus.extension.kotlin.KtQueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.apache.catalina.User
import org.springframework.stereotype.Service
import pro.gugg.superaa.persistent.mapper.UserMapper
import pro.gugg.superaa.persistent.po.UserEntity

@Service
class UserEntityService: ServiceImpl<UserMapper, UserEntity>() {
    fun getById(id:Long): UserEntity?{
        val userEntity = getOne(KtQueryWrapper(UserEntity::class.java).eq(UserEntity::id,id))
        return userEntity
    }

    fun getByNickName(nickName:String) : UserEntity?{
        return getOne(KtQueryWrapper(UserEntity::class.java).eq(UserEntity::nickName,nickName))
    }

    fun addUser(user: UserEntity): Boolean {
        return save(user)
    }
}