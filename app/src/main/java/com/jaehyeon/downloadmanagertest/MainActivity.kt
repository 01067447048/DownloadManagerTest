package com.jaehyeon.downloadmanagertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jaehyeon.downloadmanagertest.data.AndroidDownloader
import com.jaehyeon.downloadmanagertest.ui.theme.DownloadManagerTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val downloader = AndroidDownloader(this)
        downloader.downloadFile("")
        setContent {
            DownloadManagerTestTheme {
                
            }
        }
    }
}
