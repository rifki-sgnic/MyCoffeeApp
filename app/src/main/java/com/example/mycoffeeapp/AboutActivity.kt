package com.example.mycoffeeapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycoffeeapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAbout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.about)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.toolbarAbout.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.tvName.text = getString(R.string.profile_name)
        binding.tvEmail.text = getString(R.string.profile_email)
        binding.tvEmailValue.text = getString(R.string.profile_email)
        binding.tvBio.text = getString(R.string.profile_bio)
        binding.tvGithubValue.text = getString(R.string.profile_github)
        binding.tvLinkedinValue.text = getString(R.string.profile_linkedin)
        binding.tvInstagramValue.text = getString(R.string.profile_instagram)
        binding.imgProfile.setImageResource(R.drawable.me)
    }
}