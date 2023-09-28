package com.example.sportsnews.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sportsnews.model.SportNews

class HomeViewModel : ViewModel() {
    private val listNews: List<SportNews> = listOf(
        SportNews(
            title = " São Paulo Campeão",
            description = "Campeão São Paulo, venceu o Flamengo por 3-1",
            date = "24 de Setembro, 2023"
        ),
        SportNews(
            title = "Novo Recorde de Corrida",
            description = "Atleta quebra recorde mundial em corrida de 100 metros.",
            date = "20 de Setembro, 2023"
        ),
        SportNews(
            title = "Campeonato de Tênis",
            description = "Campeonato de tênis reúne os melhores jogadores do mundo.",
            date = "20 de Setembro, 2023"
        ),
        SportNews(
            title = "Final de Basquete Eletrizante",
            description = "Final de basquete foi marcado por lances emocionantes.",
            date = "15 de Setembro, 2023"
        ),
        SportNews(
            title = "Goool Espetacular de Cr7",
            description = "Cr7 marca um gol espetacular de bicicleta aos 95 minutos.",
            date = "12 de Setembro, 2023"
        ),
        SportNews(
            title = "Neymar Faz Golaço",
            description = "Neymar marca um gol espetacular de bicicleta aos 90 minutos.",
            date = "12 de Setembro, 2023"
        ),
        SportNews(
            title = "Flamengo Assina Com Tite",
            description = "Flamengo e Tite chegaram a um acordo, o tecnico assinou.",
            date = "30 de Setembro, 2023"
        )
    )

    fun getListNews() = listNews
}