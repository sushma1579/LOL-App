package com.example.l_o_l

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var model: JokeModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_activity_main)

        model = JokeModel()

        supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment

    }

}

