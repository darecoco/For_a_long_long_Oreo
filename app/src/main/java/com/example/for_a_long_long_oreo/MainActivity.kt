package com.example.for_a_long_long_oreo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_plan : Button;
    lateinit var btn_gallery : Button;
    lateinit var btn_option : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_plan = findViewById(R.id.btn_plan)
        btn_gallery = findViewById(R.id.btn_gallery)
        btn_option = findViewById(R.id.btn_option)

        // '오레오 만들기' 버튼 클릭 시
        btn_plan.setOnClickListener {
            val intent = Intent(this, PlanActivity::class.java)
            startActivity(intent)
        }
        // '오레오 갤러리' 버튼 클릭 시
        btn_gallery.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
        // '옵션' 버튼 클릭 시
        btn_option.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }
    }

}