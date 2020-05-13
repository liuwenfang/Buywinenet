package com.ccp.buywinenet.model.net

import com.ccp.buywinenet.BuildConfig
import com.ccp.buywinenet.BuyWineNetApp
import com.ccp.buywinenet.model.api.ApiService
import com.ccp.buywinenet.utils.HttpLog
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor
import me.jessyan.autosize.utils.LogUtils
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.internal.cache.CacheInterceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 *作者：刘小芳2020-04-29 14:27
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */

object RetrofitClient{


    /**
     * 临时cookie
     */
    private val cookieJar = PersistentCookieJar(
        SetCookieCache(),
        SharedPrefsCookiePersistor(BuyWineNetApp.context)
    )

    //处理网络请求的日志拦截输出
    private val logInterceptor = if (BuildConfig.DEBUG) {
        //只显示基础信息
        HttpLoggingInterceptor( HttpLog()).setLevel(HttpLoggingInterceptor.Level.BODY);
    } else {
        HttpLoggingInterceptor( HttpLog()).setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    private val okHttpClient = OkHttpClient.Builder()
        .callTimeout(10, TimeUnit.SECONDS)
        .cookieJar(cookieJar)
        .addInterceptor(logInterceptor)
        .connectTimeout(60,TimeUnit.SECONDS)
        .writeTimeout(60,TimeUnit.SECONDS)
        .readTimeout(60,TimeUnit.SECONDS)
        .build()

    private val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(ApiService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: ApiService = retrofit.create(ApiService::class.java)

    fun clearCookie() = cookieJar.clear()
}

