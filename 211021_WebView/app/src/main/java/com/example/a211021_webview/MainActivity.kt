package com.example.a211021_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.example.a211021_webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        binding.webView.webViewClient = WebViewClient()
        binding.webView.webChromeClient = WebChromeClient()
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        binding.webView.loadUrl("http://www.naver.com") // 링크 주소를 load 함
    }

    // 백 버튼 코딩
    override fun onBackPressed() {
        if(binding.webView.canGoBack()){
            // 웹사이트에서 뒤로 갈 페이지가 존재 한다면 ...
            binding.webView.goBack() // 웹사이트 뒤로가기
        }
        else{
            super.onBackPressed() // 본래의 백버튼 기능 수행
        }

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}


