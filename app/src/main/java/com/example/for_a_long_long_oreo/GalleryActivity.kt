package com.example.for_a_long_long_oreo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // GalleryActivity에 대한 XML 레이아웃 파일을 연결 (gallery.xml)
        setContentView(R.layout.gallery)
    }
}

