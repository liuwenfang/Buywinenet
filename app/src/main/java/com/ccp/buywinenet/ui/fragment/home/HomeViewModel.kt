package com.ccp.buywinenet.ui.fragment.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.ccp.buywinenet.model.bean.AppSeckill
import com.ccp.buywinenet.model.bean.Data
import com.ccp.buywinenet.model.bean.SecKill
import com.ccp.buywinenet.ui.base.BaseViewModel
import com.youth.banner.Banner

/**
 *作者：刘小芳2020-04-29 14:40
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class HomeViewModel : BaseViewModel(){

    private val homeRepository by lazy { HomeRepository() }

    val articleList = MutableLiveData<MutableList<Data>>(mutableListOf())

    val secKill =  MutableLiveData<ArrayList<SecKill.DataBean>>()


    fun loadHomeImg(userId: String, signid: String) {
        launch(
            block = {
                val homePageImg = homeRepository.getHomePageImg(userId, signid)
                articleList.value = homePageImg
                val secKillList = homeRepository.getSecKillList(userId)
                secKill.value = secKillList
            },
            error = {

            },
            cancel = {

            }
        )
    }
    fun loadHomeSecKill(userId: String){
        launch(
            block = {

//                seckill.value = secKillList
//                Log.e("213123-------->",secKillList.toString())
            } ,
            error = {

            },
            cancel = {

            }
        )
    }

}