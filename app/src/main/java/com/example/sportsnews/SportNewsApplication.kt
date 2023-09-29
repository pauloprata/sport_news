package com.example.sportsnews

import android.app.Application
import com.example.sportsnews.di.SportNewsModule.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SportNewsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SportNewsApplication)
            modules(appModule)
        }
    }
}