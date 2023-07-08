package com.example.a211026_recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a211026_recyclerviewkt.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        super.onCreate(savedInstanceState)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 개발자") ,
            Profiles(R.drawable.woman, "김유", 22, "데이 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 21, "안드로이드 개발자") ,
            Profiles(R.drawable.man, "김유", 22, "데이 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 개발자") ,
            Profiles(R.drawable.man, "김유", 35, "데이 개발자"),
            Profiles(R.drawable.woman, "홍드로이드", 13, "알") ,
            Profiles(R.drawable.woman, "김유", 29, "연구"),
        )

        binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(profileList)
    }
}