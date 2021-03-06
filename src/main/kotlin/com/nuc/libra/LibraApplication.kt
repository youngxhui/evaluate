package com.nuc.libra

import com.nuc.libra.util.PathUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import java.io.File

/**
 * spring boot 启动入口
 */
@SpringBootApplication
@EnableScheduling
class LibraApplication

private val logger: Logger = LoggerFactory.getLogger(LibraApplication::class.java)

/**
 * 主函数
 */
fun main(args: Array<String>) {
    runApplication<LibraApplication>(*args)

    // 创建静态文件路径
    val rootPath = PathUtils.rootPath()
    val binFile = File(rootPath, "bin/dll")
    val dataFile = File(rootPath, "data")
    if (!binFile.exists()) {
        binFile.mkdirs()
    }
    if (!dataFile.exists()) {
        dataFile.mkdirs()
    }
    logger.info("import")
    logger.info("please copy file libCapricornus.so to $binFile ")
    logger.info("please copy file polyglot-zh.txt to $dataFile ")
    logger.info("import")
    // 试卷存放地方
    val pageFile = File(rootPath, "/page/code")
    if (!pageFile.exists()) {
        pageFile.mkdirs()
    }

}


