package com.example.filme_projeto_android

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.Executors


class ApiConsumer {



        fun buscarFilmes() {
            val client = OkHttpClient()
            val apiKey = "4de12d042be2ab1402ee92ec2aa8daef"


            var bolota = Request.Builder()
                .url("https://api.themoviedb.org/3/search/movie?query=alien&api_key=API_KEY")
                .get()
                .addHeader("accept", "application/json")
                .addHeader(
                    "Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5M2ZhZTMyNjEzYjJmNDE1NGJjNDY4Y2QxMmM1Zjk4MSIsIm5iZiI6MTcyNzcxMjE3NS4yOTU2NjYsInN1YiI6IjY2ZmFiZTg3ODA3Y2Q1MWMxN2YxOTQ2MSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.XK4kaiZxMZ9xKrtQF5YSh5HwzuruRmHs75_1kGPBcEw"
                )
                .build()
            val execut = Executors.newSingleThreadExecutor()
            execut.execute{
                var resp = client.newCall(bolota).execute()
                val test = resp.body?.string()
                Log.e("MainActivity","$test" )
            }


    }

}


