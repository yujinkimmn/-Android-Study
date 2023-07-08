package com.example.a211020_navigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.a211020_navigationview.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMainBinding? =null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 제거 setContentView(R.layout.activity_main)

        // 자동 생성된 뷰바인딩 클래스에서의 inflate란 메서드를 이용해서
        // 액티비티에서 사용할 바인딩 클래스의 인스턴트 생성
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의 인스턴트를 활용하여
        // 생성된 뷰를 액티비티에 표시
        setContentView(binding.root)

        binding.btnNavi.setOnClickListener{
            // 왼쪽에서 시작해서 밀어라
            binding.layoutDrawer.openDrawer(GravityCompat.START) // 여기서 start는 left랑 같은 말, END는 right
        }
        binding.naviView.setNavigationItemSelectedListener(this) // 네비게이션 메뉴 아이템에 클릭 속성 부여
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { //네비게이션 메뉴 아이템 클릭시 수행
        when (item.itemId){
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }
        binding.layoutDrawer.closeDrawers() // 네비게이션 뷰 닫기
        return false
    }

    // 뒤로가기 버튼 눌렀을 때
    override fun onBackPressed() {
        if (binding.layoutDrawer.isDrawerOpen(GravityCompat.START)){
            binding.layoutDrawer.closeDrawers()
        }
        else{
            super.onBackPressed() // 일반 뒤로가기 버튼 실행(finish)
        }

    }
}