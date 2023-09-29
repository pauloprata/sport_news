package com.example.sportsnews.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sportsnews.repository.SportNewsRepository

class HomeViewModel(private val repository: SportNewsRepository) : ViewModel() {


    fun getListNews()= repository.getListSportNews()
}