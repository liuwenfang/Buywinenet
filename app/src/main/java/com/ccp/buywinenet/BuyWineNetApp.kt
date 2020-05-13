package com.ccp.buywinenet

import android.app.Application
import android.content.Context

/**
 *作者：刘小芳2020-04-27 13:04
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class BuyWineNetApp : Application() {

    companion object{
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}