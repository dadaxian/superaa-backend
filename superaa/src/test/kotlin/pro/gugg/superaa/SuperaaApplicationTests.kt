package pro.gugg.superaa

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import pro.gugg.superaa.persistent.service.UserEntityService

@SpringBootTest
class SuperaaApplicationTests(
    private val userEntityService: UserEntityService
) {

    @Test
    fun contextLoads() {
    }

    @Test
    fun getUser(){
        println(userEntityService.getById(1))
    }

}
