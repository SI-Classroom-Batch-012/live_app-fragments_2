package de.syntaxinstitut.fragmentnavigation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntaxinstitut.fragmentnavigation2.fragment.Profile

class MainActivity : AppCompatActivity() {

    var profile: Profile? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}