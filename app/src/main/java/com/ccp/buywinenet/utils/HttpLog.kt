package com.ccp.buywinenet.utils

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor

/**
 * 作者：刘小芳2020-05-11 14:35
 * 邮箱：ccpchick@163.com
 * desc：蜡笔小新的烦恼
 */
class HttpLog : HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        Log.d("HttpLogInfo", message)
    }
}