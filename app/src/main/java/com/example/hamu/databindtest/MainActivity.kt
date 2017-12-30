package com.example.hamu.databindtest

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hamu.databindtest.databinding.ActivityMainBinding
import com.example.hamu.databindtest.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding =
                DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.viewModel = MainViewModel()
    }
}
