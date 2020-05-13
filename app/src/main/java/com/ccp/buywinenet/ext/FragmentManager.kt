package com.ccp.buywinenet.ext

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

/**
 *作者：刘小芳2020-04-27 13:38
 *邮箱：ccpchick@163.com
 *desc：
 */
inline fun FragmentManager.inTransaction
            (func : FragmentTransaction.() -> FragmentTransaction) =
                beginTransaction().func().commit()

fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int) = supportFragmentManager.inTransaction {
    add(frameId, fragment)
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) = supportFragmentManager.inTransaction{
    replace(frameId, fragment)
}

