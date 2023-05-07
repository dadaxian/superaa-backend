package pro.gugg.superaa.vo

import lombok.Data

/**
 * @Auther: guzhengzhao
 * @Date: 2023/5/7 16:41
 * @Description:
 */
@Data
class ConsumeBillPayPeopleVo {
    var avatarUrl :String ?= ""
    var payPeopleName :String ? = ""
    var cost : Double ? = 0.0
    var billList: Array<ConsumeBillVo> ?= arrayOf()
}