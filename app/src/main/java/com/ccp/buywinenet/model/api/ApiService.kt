package com.ccp.buywinenet.model.api

import com.ccp.buywinenet.model.bean.AppSeckill
import com.ccp.buywinenet.model.bean.Data
import com.ccp.buywinenet.model.bean.HotData
import com.ccp.buywinenet.model.bean.SecKill
import com.ccp.buywinenet.model.net.ApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *作者：刘小芳2020-04-29 14:28
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */

interface ApiService{

    companion object{
        const val BASE_URL = "http://btcapi1.gjw.com/"
    }

    /**
     * 首页轮播 nav
     */
    @GET("BtCApi/Home/GetHomePageImg")
    suspend fun getHomePageImg(@Query("userId") userId: String,
                               @Query("signid") signid: String): ApiResult<ArrayList<Data>>

    /**
     * 秒杀
     */
    @GET("BtCApi/Home/SeckillList")
    suspend fun getSeckillList(@Query("userId") userId: String): ApiResult<ArrayList<SecKill.DataBean>>


    //获取首页热门列表
    @GET("BtCApi/Home/GethomeProductByhot")
    fun getHomeHotList(
        @Query("seriesid") seriesid: Int,
        @Query("pageindex") pageIndex: Int,
        @Query("pagesize") pagesize: Int,
        @Query("UserID") userId: String,
        @Query("signid") signid: String
    ): ApiResult<HotData>
}