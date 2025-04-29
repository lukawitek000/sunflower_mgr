package com.lukasz.witkowski.shop.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lukasz.witkowski.shop.compose.ui.theme.Sunflower_mgrTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sunflower_mgrTheme() {
                ShopApp()
            }
        }
    }
}


