package com.example.a0923kotlin.activity

import android.app.Activity
import android.os.Bundle
import com.example.a0923kotlin.R
import kotlinx.android.synthetic.main.activity_hello.* //apply plugin 하고 여기 추가

class HelloActivity : Activity(){

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello) //액티비티에 레이아웃 연결

        btnHello.setOnClickListener(){
            //클릭시 동작할 코드 작성
        }
    }
}