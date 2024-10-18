package com.example.filme_projeto_android.filmes

data class FilmesData(
    val id: Int,
    val title: String,
    val overview: String,
    val poster_path: String
)

data class FilmesResposta(
    val results: List<FilmesData>
)
