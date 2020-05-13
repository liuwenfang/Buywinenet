package com.ccp.buywinenet.ui.base

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.lifecycle.ViewModelProvider

/**
 *作者：刘小芳2020-04-29 10:53
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
abstract class BaseMvFragment<VM : BaseViewModel> : BaseFragment() {

    protected lateinit var mViewModel: VM
    //是否懒加载
    private var lazyLoaded = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initView()
        observe()
        if(savedInstanceState == null){
            initData()
        }
    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this).get(viewModelClass())
    }
    abstract fun viewModelClass(): Class<VM>


    open fun initView() {

    }
    open fun lazyLoadData() {
    }

    open fun initData() {

    }
    fun initSystemBarHide(){
        if (Build.VERSION.SDK_INT >= 21) {
            val window: Window = activity!!.window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }


    override fun onResume() {
        super.onResume()
        // 实现懒加载
        if (!lazyLoaded) {
            lazyLoadData()
            lazyLoaded = true
        }
    }

    open fun observe() {
        // 登录失效，跳转登录页
//        mViewModel.loginStatusInvalid.observe(viewLifecycleOwner, Observer {
//            if (it) {
//                Bus.post(USER_LOGIN_STATE_CHANGED, false)
//                ActivityManager.start(LoginActivity::class.java)
//            }
//        })
    }

}