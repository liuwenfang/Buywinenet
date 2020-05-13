package com.ccp.buywinenet.ui.splash



import android.os.Bundle
import com.ccp.buywinenet.R
import com.ccp.buywinenet.ext.startGoActivity
import com.ccp.buywinenet.ui.activity.MainActivity
import com.ccp.buywinenet.ui.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun layoutRes() = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.postDelayed({
            startGoActivity<MainActivity>(context = this)
            finish()
        }, 1500)

    }
}
