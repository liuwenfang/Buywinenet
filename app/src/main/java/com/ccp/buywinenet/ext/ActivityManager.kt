package com.ccp.buywinenet.ext

import android.content.Context
import android.content.Intent

/**
 *作者：刘小芳2020-04-27 16:46
 *邮箱：ccpchick@163.com
 *desc：
 */
inline fun <reified T> startGoActivity(context: Context){
    val intent = Intent(context,  T::class.java)
    context.startActivity(intent)
}

inline fun <reified T> startActivity(context: Context, func: Intent.() -> Void){
    val intent = Intent(context,  T::class.java)
    intent.func()
    context.startActivity(intent)
}