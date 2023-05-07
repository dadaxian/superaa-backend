package pro.gugg.superaa.web.controller;

import com.baomidou.mybatisplus.extension.kotlin.KtQueryWrapper
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.gugg.superaa.persistent.po.ConsumeBillEntity
import pro.gugg.superaa.persistent.service.ConsumeBillService
import pro.gugg.superaa.persistent.service.UserEntityService
import pro.gugg.superaa.vo.ConsumeBillPayPeopleVo
import pro.gugg.superaa.vo.ConsumeBillVo

/**
 * <p>
 * 消费账单表 前端控制器
 * </p>
 *
 * @author Mr.Xian
 * @since 2023-05-04 03:29:29
 */
@RestController
@RequestMapping("/consume-bill-entity")
@CrossOrigin(origins = ["*"])
class ConsumeBillController(
    private val consumeBillService: ConsumeBillService,
    private val userEntityService: UserEntityService
) {
    @RequestMapping("/getBillList/{id}")
    fun getBooks(@PathVariable("id") id: Long): List<ConsumeBillPayPeopleVo>? {
        val list: MutableList<ConsumeBillEntity> =
            consumeBillService.list(KtQueryWrapper(ConsumeBillEntity::class.java).eq(ConsumeBillEntity::bookId, id))
        val consumeBillVoList = list.map { consumeBillEntity ->
            val consumeBillVo = ConsumeBillVo()
            consumeBillVo.cost = consumeBillEntity.cost!!
            consumeBillVo.name = consumeBillEntity.billDesc!!
            val payUser = userEntityService.getById(consumeBillEntity.payUserId)
            consumeBillVo.payUserName = payUser.nickName!!
            consumeBillVo.payUserAvatar = payUser.avatarUrl!!
            consumeBillVo.payUserId = payUser.id
            consumeBillVo
        }.groupBy { it.payUserId }.map { pair ->
            val consumeBillPayPeopleVo = ConsumeBillPayPeopleVo()
            consumeBillPayPeopleVo.avatarUrl = pair.value.get(0).payUserAvatar
            consumeBillPayPeopleVo.cost = pair.value.fold(0.0) { acc, consumeBillVo -> acc + consumeBillVo.cost }
            consumeBillPayPeopleVo.payPeopleName=pair.value.get(0).payUserName
            consumeBillPayPeopleVo.billList=pair.value.toTypedArray()
            consumeBillPayPeopleVo
        }
        return consumeBillVoList
    }
}
