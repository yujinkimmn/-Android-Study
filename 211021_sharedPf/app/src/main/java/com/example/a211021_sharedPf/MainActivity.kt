package com.example.a211021_sharedPf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a211021_sharedPf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { // 해당 액티비티가 처음 실행될 때 한번 수행하는 곳(초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // TODO: 저장된 데이터를 로드
        loadData() // edit text 저장되어 있던 값을 setText
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref",  0) // pref란 키 값 으로 저장, mode는 옵션인데 보통 0
        binding.etHello.setText(pref.getString("name", "")) // 끌어올 때는 수정모드 안써도 됨
                                                            // 1번째 인자: 저장할 당시의 key값
                                                            // 2번째 인자: key값의 데이터가 존재하지 않을 경우 대체 데이터
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref",  0) // pref란 키 값 으로 저장, mode는 옵션인데 보통 0
        val edit = pref.edit() // 수정모드
        edit.putString("name", binding.etHello.text.toString()) // 1번쨰 인자: key값, 2번째 인자: 실제 담을 값
        edit.apply() // 값을 저장완료
    }

    override fun onDestroy() { // 액티비티가 종료되는 시점이 다가올 때 호출됨
        super.onDestroy()
        saveData() // edit text 값을 저장
    }


}