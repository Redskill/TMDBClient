package com.redskill.tmdbclient.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redskill.tmdbclient.R
import com.redskill.tmdbclient.data.model.Artist
import com.redskill.tmdbclient.data.model.TvShow
import com.redskill.tmdbclient.databinding.ActivityHomeBinding
import com.redskill.tmdbclient.presentation.artist.ArtistActivity
import com.redskill.tmdbclient.presentation.movie.MovieActivity
import com.redskill.tmdbclient.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.movieButton.setOnClickListener {
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
        binding.tvButton.setOnClickListener {
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
        binding.artistsButton.setOnClickListener {
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}