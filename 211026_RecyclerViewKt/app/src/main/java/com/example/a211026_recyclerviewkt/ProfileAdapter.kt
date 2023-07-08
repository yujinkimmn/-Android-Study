package com.example.a211026_recyclerviewkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*

class ProfileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {
        // 만들어놓은 list_item.xml을 어댑터에 붙이기
        // inflate = 붙이다! 라고 생각하자
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        // 여기서 만든 view를 CustomViewHolder로 전달
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos: Int = adapterPosition
                val profile: Profiles = profileList.get(curPos)
                Toast.makeText(parent.context, "이름: ${profile.name} \n 나이: ${profile.age}\n 직업: ${profile.job}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    // view를 실제로 어댑터에 연결해주는 역할
    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.gender.setImageResource(profileList.get(position).gender)
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        holder.job.text = profileList.get(position).job
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gender = itemView.findViewById<ImageView>(R.id.iv_profile) // 성별
        val name = itemView.findViewById<TextView>(R.id.tv_name) // 이름
        val age = itemView.findViewById<TextView>(R.id.tv_age) // 나이
        val job = itemView.findViewById<TextView>(R.id.tv_job) // 직업
    }

}
