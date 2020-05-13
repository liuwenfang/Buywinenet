package com.ccp.buywinenet.model.net

class ApiException(var code: Int, override var message: String) : RuntimeException()