package com.ccp.buywinenet.ui.activity

import android.os.Bundle
import com.ccp.buywinenet.R
import com.ccp.buywinenet.ext.addFragment
import com.ccp.buywinenet.ext.replaceFragment
import com.ccp.buywinenet.ext.showToast
import com.ccp.buywinenet.ui.base.BaseActivity
import com.ccp.buywinenet.ui.fragment.classify.ClassifyFragment
import com.ccp.buywinenet.ui.fragment.home.HomeFragment
import com.ccp.buywinenet.ui.fragment.mine.MineFragment
import com.ccp.buywinenet.ui.fragment.shoppingcart.ShoppingCarFragment
import com.ccp.buywinenet.ui.fragment.welfare.WelfareFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun layoutRes() = R.layout.activity_main

    lateinit var homeFragment: HomeFragment
    lateinit var classifyFragment: ClassifyFragment
    lateinit var mineFragment: MineFragment
    lateinit var welfareFragment: WelfareFragment
    lateinit var shoppingFragment: ShoppingCarFragment
    private var previousTimeMillis = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeFragment = HomeFragment()
        classifyFragment = ClassifyFragment()
        mineFragment = MineFragment()
        welfareFragment = WelfareFragment()
        shoppingFragment = ShoppingCarFragment()
        bottomNavigationView.enableAnimation(false)
        addFragment(homeFragment,R.id.container)
        bottomNavigationView.run {
            setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.home -> replaceFragment(homeFragment, R.id.container)
                    R.id.classify -> replaceFragment(classifyFragment, R.id.container)
                    R.id.welfare -> replaceFragment(mineFragment, R.id.container)
                    R.id.shopping -> replaceFragment(welfareFragment, R.id.container)
                    R.id.mine -> replaceFragment(shoppingFragment, R.id.container)
                }
                true
            }
        }

    }

    override fun onBackPressed() {
        val currentTimMillis = System.currentTimeMillis()
        if (currentTimMillis - previousTimeMillis < 2000) {
            super.onBackPressed()
        } else {
            showToast(R.string.press_again_to_exit)
            previousTimeMillis = currentTimMillis
        }
    }
}
