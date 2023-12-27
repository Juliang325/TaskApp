package com.example.taskapp.adapters.category

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.taskapp.databinding.ItemCategoryBinding
import com.example.taskapp.entities.Category

class CategoryViewHolder(view: View): ViewHolder(view) {

    val binding = ItemCategoryBinding.bind(view)

    fun render(categoryModel: Category){
        binding.tvName.text = categoryModel.name
    }
}
