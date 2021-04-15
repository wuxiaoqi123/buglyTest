package com.example.buglytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tencent.bugly.crashreport.CrashReport

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // native崩溃
        findViewById<Button>(R.id.crash1_btn).setOnClickListener { v -> CrashReport.testNativeCrash() }
        // java崩溃
        findViewById<Button>(R.id.crash2_btn).setOnClickListener { v -> CrashReport.testJavaCrash() }
        // anr
        findViewById<Button>(R.id.crash3_btn).setOnClickListener { v -> CrashReport.testANRCrash() }
    }
}