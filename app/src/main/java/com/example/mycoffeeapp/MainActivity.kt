package com.example.mycoffeeapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycoffeeapp.data.CoffeeData
import com.example.mycoffeeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvCoffee: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvCoffee = binding.rvCoffee
        rvCoffee.setHasFixedSize(true)
        showRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_view -> {
                if (rvCoffee.layoutManager is LinearLayoutManager) {
                    rvCoffee.layoutManager = GridLayoutManager(this, 2)
                    item.icon = ContextCompat.getDrawable(this, R.drawable.outline_view_list_24)
                } else {
                    rvCoffee.layoutManager = LinearLayoutManager(this)
                    item.icon = ContextCompat.getDrawable(this, R.drawable.baseline_grid_view_24)
                }
            }
            R.id.about -> { }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerView() {
        if (application.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvCoffee.layoutManager = GridLayoutManager(this, 2)
        } else {
            rvCoffee.layoutManager =
                LinearLayoutManager(this)
        }
        val listCoffeeAdapter = ListCoffeeAdapter(CoffeeData.coffees)
        rvCoffee.adapter = listCoffeeAdapter
    }
}