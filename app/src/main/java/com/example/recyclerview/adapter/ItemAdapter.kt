package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Affirmation

class ItemAdapter(
    private val context : Context, 
    private val dataset : List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout) //루트뷰가 adapterLayout인 새 ItemViewHolder인스턴스를 반환(생성)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        //뷰홀더내의 텍스트뷰에 item에 들어있는 문자열리소스ID로 getString()을 통해 인스턴스 참조해서 셋함
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    } //간소화 override fun getItemCount() = dataset.size 
}