package com.example.mycoffeeapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mycoffeeapp.data.Coffee
import com.example.mycoffeeapp.databinding.ItemCoffeeBinding

class ListCoffeeAdapter(
    private val listCoffee: ArrayList<Coffee>
) : RecyclerView.Adapter<ListCoffeeAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val binding = ItemCoffeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val coffee = listCoffee[position]
        holder.bind(coffee)
    }

    override fun getItemCount(): Int = listCoffee.size

    inner class ListViewHolder(private val binding: ItemCoffeeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(coffee: Coffee) {
            binding.tvName.text = coffee.name
            binding.tvDescription.text = coffee.description

            Glide.with(binding.root.context)
                .load(coffee.image)
                .into(binding.imgCoffee)

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_COFFEE, coffee)
                binding.root.context.startActivity(intent)
            }
        }
    }

}