package com.example.a211018_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.a211018_listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    // UserList 만들어주기
    var UserList = arrayListOf<User>(
        User(R.drawable.android, "유진", "22", "안녕!!!"),
        User(R.drawable.android, "냠냠", "22", "안녕!!!"),
        User(R.drawable.android, "냐옹", "22", "안녕!!!"),
        User(R.drawable.android, "고양이", "22", "드놀러오세요!!!"),
        User(R.drawable.android, "스위프트", "22", "심심하"),
        User(R.drawable.android, "인드로이드", "22", "안녕!!!"),
        User(R.drawable.android, "홍드로이", "22", "안녕!!!"),
        User(R.drawable.android, "유진", "22", "안녕!!!")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Adapter = UserAdapter(this, UserList)
        binding.listView.adapter = Adapter

        // clickListener 구현
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()

        }

//        var item = arrayOf("사과", "배", "딸기", "바나나", "유진")
//       //  context란 한 액티비티의 모든 정보를 담고있다.
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

    }
}