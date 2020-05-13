package com.ccp.buywinenet.ui.fragment.home

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.ccp.buywinenet.R
import com.ccp.buywinenet.model.bean.Data
import com.ccp.buywinenet.ui.base.BaseMvFragment
import com.ccp.buywinenet.utils.StatusBarUtil
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.ParseException
import java.text.SimpleDateFormat


/**
 *作者：刘小芳2020-04-27 14:05
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class HomeFragment : BaseMvFragment<HomeViewModel>() {

    private lateinit var itemNavAdapter: ItemNavAdapter

    private val itemNav: MutableList<Data> = mutableListOf()

    override fun layoutRes() = R.layout.fragment_home

    override fun viewModelClass() = HomeViewModel::class.java

    override fun initView() {
        itemNavAdapter = ItemNavAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initSystemBarHide()
        StatusBarUtil.setStatusBarDarkTheme(activity, true)
        super.onCreate(savedInstanceState)
    }

    override fun observe() {
        super.observe()
        mViewModel.run {
            articleList.observe(viewLifecycleOwner, Observer {
                setupBanner(it)
                setNavItem(it)
            })
            secKill.observe(viewLifecycleOwner, Observer {
                
            })
        }
    }

    private fun setNavItem(list: MutableList<Data>?) {
        list?.let {
            it.filter { data ->
                data.adv_BlockID == 3
            }.forEach { pic ->
                itemNav.add(pic)
            }
            itemNavAdapter.setList(itemNav)
            rvNav.layoutManager = GridLayoutManager(activity, 5)
            rvNav.adapter = itemNavAdapter
        }
    }

    override fun lazyLoadData() {
        mViewModel.loadHomeImg("1", "1")
        mViewModel.loadHomeSecKill("1")
    }

    private fun setupBanner(articleList: MutableList<Data>) {
        bannerView.run {
            setBannerStyle(BannerConfig.NOT_INDICATOR)
            setImageLoader(BannerImageLoader())
            setImages(articleList)
            setBannerAnimation(Transformer.BackgroundToForeground)
            setIndicatorGravity(BannerConfig.CENTER)
            start()
            setOnBannerListener {
//                val banner = articleList[it]
//                startGoActivity()
            }
        }
    }

    private fun initCustomCountdown(
        endTime: String,
        currentTime: String
    ) {
        var endTime = endTime
        var currentTime = currentTime
        if (TextUtils.isEmpty(endTime) || TextUtils.isEmpty(currentTime)) {
            return
        }
        if (endTime.contains("/")) {
            endTime = endTime.replace("/", "-")
        }
        if (currentTime.contains("/")) {
            currentTime = currentTime.replace("/", "-")
        }
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        var millionSeconds: Long = 0
        var currentTimemillion: Long = 0
        try {
            millionSeconds = sdf.parse(endTime).time //毫秒
            currentTimemillion = sdf.parse(currentTime).time
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        val time = millionSeconds - currentTimemillion
        if (time < 0) {
            new_hs_level.visibility = View.GONE
            new_ll_miaosha_land.setVisibility(View.GONE)
            return
        }
//        val mTimerHelper = TimerHelper(10, time)
//        mTimerHelper.setOnTimerListener(object : OnTimerListener() {
//            fun OnTick(arg0: Long) {
//                val time: String = Fast.Helper.DateTimeHelper.formatLongToHH_MM_SS(arg0)
//                val split = time.split(":").toTypedArray()
//                if (split.size == 3) {
//                    new_tv_hour.text = split[0]
//                    new_tv_min.text = (split[1])
//                    new_tv_sec.text = (split[2])
//                } else if (split.size == 2) {
//                    new_tv_hour.text = "00"
//                    new_tv_min.text = (split[0])
//                    new_tv_sec.text = (split[1])
//                }
//            }
//
//            // 倒计时完成
//            fun OnComplete() {
//                new_hs_level.visibility = View.GONE
//                new_ll_miaosha_land.visibility = View.GONE
//            }
//        })
//        mTimerHelper.start()
    }

    override fun onResume() {
        super.onResume()
        bannerView.startAutoPlay()
    }

    override fun onPause() {
        super.onPause()
        bannerView.stopAutoPlay()
    }


}


