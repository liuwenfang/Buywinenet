package com.ccp.buywinenet.model.net



data class ApiResult<T>(val status: Boolean,
                        val msg: String,
                        val code: Int,
                        val Version: Any,
                        val Content: String,
                        val StatusCode: Int,
                        val ReasonPhrase: String,
                        val Headers: ArrayList<String>,
                        val RequestMessage: String,
                        val IsSuccessStatusCode: Boolean,
                        val data: T) {
    fun apiData(): T {
        if (code == 30000) {
            return data
        } else {
            throw ApiException(code, msg)
        }
    }
}
