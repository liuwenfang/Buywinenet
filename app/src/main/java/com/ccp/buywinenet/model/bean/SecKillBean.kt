package com.ccp.buywinenet.model.bean

/**
 * 作者：刘小芳2020-05-13 13:51
 * 邮箱：ccpchick@163.com
 * desc：蜡笔小新的烦恼
 */

data class AppSeckill(
    val AppSeckillProList: List<AppSeckillPro>,
    val CurrTime: String,
    val EndTime: String,
    val Id: Int,
    val Remarks: String,
    val StarTime: String,
    val state: Int
)

data class AppSeckillPro(
    val Content: String,
    val CurrTime: String,
    val EndTime: String,
    val Id: Int,
    val IsRemind: Int,
    val LimitNum: Int,
    val Num: Int,
    val OdrPrice: Double,
    val Price: Double,
    val Pro_ProductId: Int,
    val ProductName: String,
    val RemindID: Int,
    val StarTime: String,
    val imgUrl: String,
    val state: Int
)