package com.nuc.evaluate.util

import com.nuc.evaluate.result.Result

/**
 * @author 杨晓辉 2018/2/1 14:07
 * ResultUtils 通过该类进行结果返回，保证了接口风格统一
 */
object ResultUtils {

    private lateinit var data: Any

    private var code: Int = 200

    private lateinit var message: String

    private var result = Result()

    fun success(): Result {
        return result
    }

    fun success(message: String): Result {
        result.message = message
        return result
    }

    fun success(code: Int, message: String): Result {
        result.code = code
        result.message = message
        return result
    }

    fun success(code: Int, message: String, data: Any): Result {
        result.code = code
        result.message = message
        result.data = data
        return result
    }


    fun error(code: Int, message: String): Result {
        result.code = code
        result.message = message
        return result
    }
}