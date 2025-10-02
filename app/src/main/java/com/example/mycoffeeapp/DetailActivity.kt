package com.example.mycoffeeapp

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.mycoffeeapp.data.Coffee
import com.example.mycoffeeapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        ViewCompat.setOnApplyWindowInsetsListener(binding.detailMain) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.toolbarDetail.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val coffee = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Coffee>(EXTRA_COFFEE, Coffee::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Coffee>(EXTRA_COFFEE)
        }

        coffee?.let { it ->
            supportActionBar?.title = it.name

            binding.tvNameDetail.text = it.name
            binding.tvDescriptionDetail.text = it.description
            binding.tvPriceDetail.text = it.price
            Glide.with(this)
                .load(coffee.image)
                .into(binding.imgCoffeeDetail)

            val bulletList = coffee.ingredients.joinToString("\n") { "• $it" }
            binding.tvIngredientsDetail.text = bulletList
        }
    }

    companion object {
        const val EXTRA_COFFEE = "extra_coffee"
    }
}