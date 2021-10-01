package ru.unit6.course.android.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.bind
import android.view.View
import android.widget.TextView
import ru.unit6.course.android.retrofit.ui.main.MainAdapter
import ru.unit6.course.android.retrofit.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()

           /* val un: TextView
            try {
                println("########## un наполнение")
                un = MainAdapter.DataViewHolder.
                    findViewById<TextView>(R.id.textViewUserName)
                try {
                    un.setOnClickListener(View.OnClickListener {
                        println("########## нажал на имя")
                    })
                } catch (e: Exception) {
                    println("##########         Exception setOnClickListener")
                }

            } catch (e: Exception) {
                println("##########         Exception findById")
            }*/
        }
        //recyclerView.adapter.getItemCount()

    }
}