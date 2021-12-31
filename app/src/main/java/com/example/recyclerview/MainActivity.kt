package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ItemAdapter
import com.example.recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val myDataset = Datasource().loadAffirmations()
        
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true) //콘텐츠 내용변경에도 recyclerView 레이아웃 크기 변동X 경우, 성능개선
        
        //리스트 카운트
//        val textView : TextView = findViewById(R.id.textview)
//        textView.text = Datasource().loadAffirmation().size.toString()
        
        
        
        
        
    }
}