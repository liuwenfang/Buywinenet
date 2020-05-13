package com.ccp.buywinenet.model.bean

/**
 *作者：刘小芳2020-05-13 15:04
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */data class HomeHotListBean(
    val Content: Any,
    val Headers: List<Any>,
    val IsSuccessStatusCode: Boolean,
    val ReasonPhrase: String,
    val RequestMessage: Any,
    val StatusCode: Int,
    val Version: Version,
    val code: Int,
    val `data`: List<Data>,
    val msg: String,
    val status: Boolean
)

data class HotVersion(
    val Build: Int,
    val Major: Int,
    val MajorRevision: Int,
    val Minor: Int,
    val MinorRevision: Int,
    val Revision: Int
)

data class HotData(
    val ActivityMoney: String,
    val BrandID: Int,
    val GiftType: Any,
    val ObjectID: Int,
    val Pic: String,
    val ProductId: Int,
    val ProductName: String,
    val PromotionRemark: Any,
    val Quantity: Int,
    val RestrictDay: Int,
    val RestrictNum: Int,
    val SeriesID: Int,
    val activityTitle: List<ActivityTitle>,
    val activityType: Any,
    val usr_LevelID: Int
)

data class ActivityTitle(
    val Ativityname: String
)