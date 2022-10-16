package pro.gugg.superaa

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
@MapperScan("pro.gugg.superaa.persistent.mapper")
class SuperaaApplication

fun main(args: Array<String>) {
    runApplication<SuperaaApplication>(*args)
}
