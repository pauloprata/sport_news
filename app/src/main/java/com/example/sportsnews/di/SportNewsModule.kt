package com.example.sportsnews.di

import com.example.sportsnews.repository.SportNewsRepository
import com.example.sportsnews.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object SportNewsModule {

    private val viewModelModule = module {
        viewModel { HomeViewModel(repository = get()) }
    }
    private val repositoryModule = module {
        factory { SportNewsRepository() }
    }

    val appModule = listOf(viewModelModule, repositoryModule)
}