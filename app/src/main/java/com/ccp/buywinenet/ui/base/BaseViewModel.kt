package com.ccp.buywinenet.ui.base

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ccp.buywinenet.ui.common.UserRepositoty
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 *作者：刘小芳2020-04-29 10:54
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */

typealias Block<T> = suspend () -> T
typealias Error = suspend (e: Exception) -> Unit
typealias Cancel = suspend (e: Exception) -> Unit
open class BaseViewModel : ViewModel(){

    protected val userRepositoty by lazy { UserRepositoty() }

    protected fun launch(block: Block<Unit>, error:Error?, cancel:Cancel?): Job{
        return viewModelScope.launch {
            try {
                block.invoke()
            }catch (e: Exception){
                when(e){
                    is CancellationException -> cancel?.invoke(e)
                    else -> {
                        Log.e("BaseViewModel","网络请求出现异常！"+e.localizedMessage)
                        error?.invoke(e)
                    }
                }
            }
        }
    }

    /**
     * 统一处理错误
     * @param e 异常
     */
//    private fun onError(e: Exception) {
//        when (e) {
//            is ApiException -> {
//                when (e.code) {
//                    -1001 -> {
//                        // 登录失效
//                        userRepository.clearLoginState()
//                        Bus.post(USER_LOGIN_STATE_CHANGED, false)
//                        loginStatusInvalid.value = true
//                    }
//                    -1 -> {
//                        // 其他api错误
//                        App.instance.showToast(e.message)
//                    }
//                    else -> {
//                        // 其他错误
//                        App.instance.showToast(e.message)
//                    }
//                }
//            }
//            is ConnectException -> {
//                // 连接失败
//                App.instance.showToast(App.instance.getString(R.string.network_connection_failed))
//            }
//            is SocketTimeoutException -> {
//                // 请求超时
//                App.instance.showToast(App.instance.getString(R.string.network_request_timeout))
//            }
//            is JsonParseException -> {
//                // 数据解析错误
//                App.instance.showToast(App.instance.getString(R.string.api_data_parse_error))
//            }
//            else -> {
//                // 其他错误
//                e.message?.let { App.instance.showToast(it) }
//            }
//        }
//    }
}