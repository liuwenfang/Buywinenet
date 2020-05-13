package com.ccp.buywinenet.ext

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

/**
 *作者：刘小芳2020-04-29 10:13
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */

fun Context.showToast(@StringRes message: Int){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}