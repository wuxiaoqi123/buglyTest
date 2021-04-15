package com.example.buglytest

import android.app.Application
import com.tencent.bugly.Bugly
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.bugly.crashreport.CrashReport.UserStrategy


class App : Application() {

    override fun onCreate() {
        super.onCreate()
//        CrashReport.initCrashReport(getApplicationContext(), "注册时申请的APP ID", false);
//        第三个参数为SDK调试模式开关，调试模式的行为特性如下：
//        输出详细的Bugly SDK的Log 每一条Crash都会被立即上报 自定义日志将会在Logcat中输出 建议在测试阶段建议设置成true，发布时设置为false。

        // 可选配置
        val strategy = UserStrategy(this)
        strategy.setAppChannel("myChannel") //设置渠道
        strategy.setAppVersion("1.0.1") //App版本
        strategy.setAppPackageName(packageName) //App包名
//        strategy.setAppReportDelay(20000); //初始化延迟

        CrashReport.initCrashReport(getApplicationContext(), "2bbdea5f7a", true, strategy);

        Bugly.init(this, "2bbdea5f7a", true, strategy)

    }
}