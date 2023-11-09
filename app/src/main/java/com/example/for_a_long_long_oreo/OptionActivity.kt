package com.example.for_a_long_long_oreo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // OptionActivity에 대한 XML 레이아웃 파일을 연결 (option.xml)
        setContentView(R.layout.option)
    }
}

