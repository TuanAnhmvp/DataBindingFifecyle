package com.example.databindingfifecyle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingfifecyle.databinding.ItemRevDatabindingBinding

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    class UserViewHolder(private val userItemBinding:ItemRevDatabindingBinding):RecyclerView.ViewHolder(userItemBinding.root){

        fun onBind(user: User){
            userItemBinding.user = user
        }

    }
    var users: List<User> = listOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val userItemBinding = ItemRevDatabindingBinding.inflate(inflater, parent, false)
        return UserViewHolder(userItemBinding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.onBind(users[position])
    }

    override fun getItemCount(): Int = users.size
}