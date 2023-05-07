package pro.gugg.superaa.vo

import lombok.Data

/**
 * @Auther: guzhengzhao
 * @Date: 2023/5/7 14:47
 * @Description:
 */
@Data
class ConsumeBillVo {
    var name:String = ""
    var cost:Double = 0.0
    var payUserId:Long ?= 0
    var payUserName:String =""
    var payUserAvatar:String =""
}