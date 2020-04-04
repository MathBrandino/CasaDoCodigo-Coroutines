package br.com.brandinocasadocodigo.app

import android.app.Application
import br.com.brandinocasadocodigo.di.viewmodels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CDCApp : Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(arrayListOf(viewmodels))
            androidContext(this@CDCApp)
        }
    }
}