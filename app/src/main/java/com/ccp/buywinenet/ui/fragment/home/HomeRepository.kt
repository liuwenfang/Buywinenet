package com.ccp.buywinenet.ui.fragment.home

import com.ccp.buywinenet.model.net.RetrofitClient
import retrofit2.http.Query

/**
 *作者：刘小芳2020-04-29 15:46
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class HomeRepository {

    suspend fun getHomePageImg(userId: String, signid: String)
            = RetrofitClient.apiService.getHomePageImg(userId,signid).apiData()

    suspend fun getSecKillList(userId: String)
            = RetrofitClient.apiService.getSeckillList((userId)).apiData()

    suspend fun getHomeHotList(
                    seriesid: Int,
                    pageIndex: Int,
                    pagesize: Int,
                    userId: String,
                    signid: String)
            = RetrofitClient.apiService.getHomeHotList(seriesid,pageIndex,pagesize,userId,signid)
}