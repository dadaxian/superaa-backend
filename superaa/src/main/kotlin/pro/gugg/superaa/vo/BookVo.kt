package pro.gugg.superaa.vo

import lombok.Data

/**
 * @Auther: guzhengzhao
 * @Date: 2023/5/6 23:02
 * @Description:
 */
@Data
class BookVo {
    var id: Long? = null
    var name: String? = null
    var avatars: Array<String?>?= arrayOf()
    var createTime: String? = null
    var pay: Double? = null
}