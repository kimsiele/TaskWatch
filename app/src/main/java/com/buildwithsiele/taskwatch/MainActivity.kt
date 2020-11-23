package com.buildwithsiele.taskwatch

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.buildwithsiele.taskwatch.databinding.ActivityMainBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

abstract class MainActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val currentDate = LocalDate.now()
        val formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
        val formattedDate = currentDate.format(formatter)
        mBinding.tvDate.text= formattedDate
    }
}