package com.jaehyeon.downloadmanagertest.domain

/**
 * Created by Jaehyeon on 2023/01/26.
 */
interface Downloader {
    fun downloadFile(url: String): Long
}