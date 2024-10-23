package com.likobehruz.viewpager2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.likobehruz.viewpager2.databinding.ItemPagerBinding
import com.likobehruz.viewpager2.models.MyInfo

class MyINfoAdapter(var list : ArrayList<MyInfo>):RecyclerView.Adapter<MyINfoAdapter.Vh>() {

    inner class Vh( var itemPage: ItemPagerBinding ):ViewHolder(itemPage.root){
        fun onBind (myInfo: MyInfo){
            itemPage.tvTitle.text = myInfo.title
            itemPage.tvText.text =myInfo.text
            itemPage.itemContainer.setBackgroundResource(myInfo.image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
     holder.onBind(list[position])
    }

}