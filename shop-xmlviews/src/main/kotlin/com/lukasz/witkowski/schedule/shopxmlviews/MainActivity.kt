package com.lukasz.witkowski.schedule.shopxmlviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lukasz.witkowski.schedule.shopxmlviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binging: ActivityMainBinding? = null
    private val binding get() = _binging!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binging = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        val productListFragment = ProductListFragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, productListFragment)
            .commit()
    }

    fun setToolbarTitle(title: String) {
        supportActionBar?.title = title
    }
}