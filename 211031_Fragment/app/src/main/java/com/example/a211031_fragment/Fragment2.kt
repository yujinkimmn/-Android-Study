package com.example.a211031_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment as AndroidxFragmentAppFragment

class Fragment2 : AndroidxFragmentAppFragment() {

    // 프래그먼트가 처음 실행 될 때
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // frag.xml이랑 연결하기(setContentView의 프래그먼트 버전이라고 생각하기)
        val view = inflater.inflate(R.layout.frag2, container, false)

        return  view

    }
}