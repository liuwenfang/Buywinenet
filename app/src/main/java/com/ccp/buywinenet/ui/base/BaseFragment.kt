package com.ccp.buywinenet.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 *作者：刘小芳2020-04-27 13:25
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
open class BaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutRes(), container, false)
    }

    open fun layoutRes() = 0

}
