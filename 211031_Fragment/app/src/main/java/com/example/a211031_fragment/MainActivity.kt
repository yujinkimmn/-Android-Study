package com.example.a211031_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a211031_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFrag(0)

        binding.btnFragment1.setOnClickListener{
            setFrag(0)
        }
        binding.btnFragment2.setOnClickListener{
            setFrag(1)
        }
        binding.btnFragment3.setOnClickListener{
            setFrag(2)
        }

    }

    //
    private fun setFrag(fragNum : Int) {
        // 프래그먼트 교체, 관리 가능하도록
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame,Fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame,Fragment3()).commit()
            }
        }
    }
}