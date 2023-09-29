package com.example.sportsnews

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.sportsnews.SportNewsModuleTest.testModule
import com.example.sportsnews.model.SportNews
import com.example.sportsnews.repository.SportNewsRepository
import com.example.sportsnews.viewmodel.HomeViewModel
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

@ExperimentalCoroutinesApi
class HomeViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    // Repositório simulado com MockK
    private val repository: SportNewsRepository = mockk(relaxed = true)

    // ViewModel a ser testada
    private lateinit var viewModel: HomeViewModel

    private val testDispatcher = UnconfinedTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        startKoin { modules(testModule) }
        viewModel = HomeViewModel(repository)
    }

    @After
    fun tearDown() {
        stopKoin()
        Dispatchers.resetMain()
    }

    @Test
    fun `testar lista vazia`() {
        coEvery { repository.getListSportNews() } returns emptyList()
        viewModel.getListNews()

        coVerify { repository.getListSportNews() }

    }

    @Test
    fun `testar lista cheia`() {
        val listNews: List<SportNews> = listOf(
            SportNews(
                title = " São Paulo Campeão",
                description = "Campeão São Paulo, venceu o Flamengo por 3-1",
                date = "24 de Setembro, 2023",
            ),
            SportNews(
                title = " São Paulo Campeão",
                description = "Campeão São Paulo, venceu o Flamengo por 3-1",
                date = "24 de Setembro, 2023",
            )
        )
        coEvery { repository.getListSportNews() } returns listNews
        viewModel.getListNews()
        coVerify { repository.getListSportNews() }
    }
}