package com.example.mycoffeeapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val splashScreen = installSplashScreen()

            splashScreen.setKeepOnScreenCondition { true }

            splashScreen.setOnExitAnimationListener { provider ->
                provider.view.animate()
                    .alpha(0f)
                    .setDuration(300L)
                    .withEndAction { provider.remove() }
                    .start()
            }
        }

        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            setContentView(R.layout.activity_splash)

            enableEdgeToEdge()
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            // Add a short delay so the splash is visible
            Handler(Looper.getMainLooper()).postDelayed({
                goToMain()
            }, 1000)
        } else {
            goToMain()
        }
    }

    private fun goToMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}