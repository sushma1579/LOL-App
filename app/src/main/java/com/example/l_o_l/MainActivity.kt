package com.example.l_o_l

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var model: JokeModel
    private lateinit var navGraph: NavGraph
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragement_activity_main)

        model = JokeModel()

        (supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment)
            .navController.let {
                val graphInflater = it.navInflater
                navGraph = graphInflater.inflate(R.navigation.joke_nav_graph)
            }
    }

}

