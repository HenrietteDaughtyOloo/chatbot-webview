package com.henriette.chat

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.settings.javaScriptEnabled = true

        // Load your Botpress chatbot URL
        webView.loadUrl("https://mediafiles.botpress.cloud/7667cedd-4464-4afc-8420-9c0b1c7b993a/webchat/bot.html")
//        webView.loadUrl("https://www.google.com/search?q=cup&oq=cup&gs_lcrp=EgZjaHJvbWUyCQgAEEUYORiABDIHCAEQLhiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQLhiABDIHCAkQABiABNIBCDE2MDlqMGo5qAIAsAIA&sourceid=chrome&ie=UTF-8")

//        webView.loadUrl("https://www.google.com/search?q=Gold&sca_esv=575405473&sxsrf=AM9HkKkWvrZNNaw7GQbosxnSHxs632NSeA%3A1697874854132&source=hp&ei=pYMzZfSkPOSNxc8P4NC6yAo&iflsig=AO6bgOgAAAAAZTORtuYotNQtNOtGoGl75eGN9rsQY3gD")
    }
}

