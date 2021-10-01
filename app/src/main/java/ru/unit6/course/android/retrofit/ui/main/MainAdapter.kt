package ru.unit6.course.android.retrofit.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.unit6.course.android.retrofit.R
import ru.unit6.course.android.retrofit.data.model.User
//import ru.unit6.course.android.retrofit.ui.main.MainAdapter.OnUserClickListener

import android.content.Context;


class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            itemView.apply {
                val textViewUserName = this.findViewById<TextView>(R.id.textViewUserName)
                val textViewUserEmail = this.findViewById<TextView>(R.id.textViewUserEmail)
                val imageViewAvatar = this.findViewById<ImageView>(R.id.imageViewAvatar)
                println("###### перемещение списка")
                textViewUserName.text = user.name
                textViewUserEmail.text = user.email
                Glide.with(imageViewAvatar.context)
                    .load(user.avatar)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = users.size

    //##########################################
    interface OnUserClickListener {
        fun onUserClick(users: ArrayList<User>, position: Int){
           println("####### onUserClick")
       }
    }
    //private fun onClickListener= OnUserClickListener.onUserClick()

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])

        // обработка нажатия
        // обработка нажатия
        //holder.itemView.setOnClickListener { // вызываем метод слушателя, передавая ему данные
          //  OnUserClickListener.onUserClick(users, position)
        //}
    }



    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }
    }



}