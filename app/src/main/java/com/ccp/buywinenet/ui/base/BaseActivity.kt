package com.ccp.buywinenet.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *作者：刘小芳2020-04-27 13:21
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
    }

    open fun layoutRes() = 0


}

