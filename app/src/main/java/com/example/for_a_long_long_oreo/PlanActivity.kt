package com.example.for_a_long_long_oreo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // PlanActivity(오레오만들기)에 대한 XML 레이아웃 파일을 연결 (plan.xml)
        setContentView(R.layout.plan)
    }
}

