package com.example.gitrollbackapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"假如这里是大量的代码============ 开始")

        Log.i(TAG,"我是gxx_dev上的代码，代码，代码")

        Log.i(TAG,"我是gxx_dev上的代码，代码增加")

        Log.i(TAG,"假如这里是大量的代码============ 结束")
    }
}