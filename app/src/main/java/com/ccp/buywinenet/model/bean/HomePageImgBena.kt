package com.ccp.buywinenet.model.bean

/**
 *作者：刘小芳2020-04-29 15:41
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
data class HomePageImg(
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

data class Version(
    val Build: Int,
    val Major: Int,
    val MajorRevision: Int,
    val Minor: Int,
    val MinorRevision: Int,
    val Revision: Int
)

data class Data(
    val BackgroudColor: String,
    val BackgroundImage: String,
    val CreateTime: String,
    val EndTime: String,
    val ExtField: String,
    val ID: Int,
    val IsRepeat: Boolean,
    val Name: String,
    val Pic: String,
    val SortNo: Int,
    val StartTime: String,
    val State: Int,
    val TypeID: Int,
    val Url: String,
    val adv_BlockID: Int,
    val listAtivityName: List<AtivityName>,
    val pro_SeriesId: Int
)

data class AtivityName(
    val Ativityname: String
)