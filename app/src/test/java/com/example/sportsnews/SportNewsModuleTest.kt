package com.example.sportsnews

import com.example.sportsnews.repository.SportNewsRepository
import com.example.sportsnews.viewmodel.HomeViewModel
import io.mockk.mockk
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object SportNewsModuleTest {
    val testModule = module {
        single<SportNewsRepository> { mockk() }
        viewModel { HomeViewModel(get()) }
    }
}