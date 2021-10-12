package com.example.a211004_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) { //onCreate : 앱(액티비티)이 최초 실행 됐을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰를 코틀린에 연결

        tv_result.setText("yujin's first android") //텍스트의 값을 변경
        btn_getText.setOnClickListener{ // edit 텍스트에 입력되어 있는 값을 가지고 와서 텍스트 뷰에 표시
            var resultText = et_id.text.toString()
            tv_result.setText(resultText)
        }


    }
}