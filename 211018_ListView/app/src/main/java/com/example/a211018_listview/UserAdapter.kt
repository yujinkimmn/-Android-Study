package com.example.a211018_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


// UserAdapter가 BaseAdapter를 상속받는다.
class UserAdapter(val context: Context, val Userlist: ArrayList<User>) : BaseAdapter() {
    override fun getCount(): Int {
        return Userlist.size
    }

    override fun getItem(position: Int): Any {
        return Userlist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null)
        //view를 붙일 때 LayoutInflater를 사용한다.

        val profile = view.findViewById<ImageView>(R.id.iv_profile)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val age = view.findViewById<TextView>(R.id.tv_age)
        val greet = view.findViewById<TextView>(R.id.tv_greet)

        val user = Userlist[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return view
    }
}
