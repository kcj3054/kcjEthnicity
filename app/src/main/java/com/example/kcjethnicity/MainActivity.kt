package com.example.kcjethnicity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = arrayOf(
            R.drawable.ai,
            R.drawable.html,
            R.drawable.css,
            R.drawable.id,
            R.drawable.jpg,
            R.drawable.js,
            R.drawable.mp4,
            R.drawable.pdf,
            R.drawable.php,
            R.drawable.profile,
            R.drawable.psd,
            R.drawable.tiff
        )

        val text = arrayOf(
            "ai",
            "html",
            "css",
            "id",
            "jpg",
            "js",
            "mp4",
            "pdf",
            "php",
            "profile",
            "psd",
            "tiff"
        )

        val gridViewAdapter = GridViewAdapter(this, img, text)

        viewpager = findViewById(R.id.viewpager) as ViewPager
        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter

        
    }
}
