package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication.R.id.webView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myWebView = findViewById(R.id.webView)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://developer.android.com/reference/android/webkit/WebView")






    }

    override fun onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack()
        }                     else {
            super.onBackPressed()
        }
    }
}
