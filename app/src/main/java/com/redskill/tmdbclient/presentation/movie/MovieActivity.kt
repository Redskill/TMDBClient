package com.redskill.tmdbclient.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.redskill.tmdbclient.R
import com.redskill.tmdbclient.databinding.ActivityMovieBinding
import com.redskill.tmdbclient.presentation.di.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {

    @Inject
    private lateinit var binding: ActivityMovieBinding
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var movieViewModelFactory: MovieViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (application as Injector).createMoviesSubComponent()
            .inject(this)

        movieViewModel = ViewModelProvider(this, movieViewModelFactory)
            .get(MovieViewModel::class.java)

        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            Log.i("MYTAG", it.toString())
        })
    }
}