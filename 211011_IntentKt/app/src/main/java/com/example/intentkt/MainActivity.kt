package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java) //다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg", tv_sendMsg.text.toString()) //  Hello world 라는 메시지 전달
            startActivity(intent)   // intent에 저장되어 있는 액티비티 쪽으로 이동한다.
            finish()                // 자기 자신 액티비티를 파괴한다.
        }

        btn_toast.setOnClickListener {
            Toast.makeText(this@MainActivity, "토스트 메시지가 생성되었습니다", Toast.LENGTH_SHORT).show()
            iv_android.setImageResource(R.drawable.android2)
        }
    }
}