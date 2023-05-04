package pro.gugg.superaa.web.controller

import org.apache.catalina.User
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pro.gugg.superaa.persistent.po.UserEntity
import pro.gugg.superaa.persistent.service.UserEntityService

@RestController
@RequestMapping("user")
class UserController(
    private val userEntityService: UserEntityService
) {
    @RequestMapping("/get/{id}")
    fun getUser(@PathVariable("id") id: Long): UserEntity? {
        return userEntityService.getById(id)
    }

    @RequestMapping("/get/nickname/{nickName}")
    fun getUserByNickName(@PathVariable("nickName") nickName: String): UserEntity? {
        return userEntityService.getByNickName(nickName)
    }

    @RequestMapping("add/{nickName}")
    fun addUser(@PathVariable("nickName") nickName: String): String {
        val userEntity = UserEntity()
        userEntity.nickName = nickName
        userEntity.accountType = 0
        return if ((userEntityService.addUser(userEntity))) {
            "success"
        } else {
            "fail"
        }
    }
}