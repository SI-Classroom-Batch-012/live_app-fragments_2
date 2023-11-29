package de.syntaxinstitut.fragmentnavigation2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import de.syntaxinstitut.fragmentnavigation2.MainActivity
import de.syntaxinstitut.fragmentnavigation2.R
import de.syntaxinstitut.fragmentnavigation2.databinding.FragmentFirstBinding
import de.syntaxinstitut.fragmentnavigation2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    //Funktioniert nur wenn immer alle Argumente mitgegeben werden bei Navigation
    private val args: SecondFragmentArgs by navArgs()

    //Daten Laden - Alternativ
//    private var text : String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        arguments?.let {
//            text = it.getString("text")
//        }
//    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity as MainActivity
        val profile = mainActivity.profile

        profile?.let {
            binding.nameTV.text = "${profile.name}, ${profile.spitzName}"
            binding.extraTV.text = "wohnhaft: ${profile.address},Alter: ${profile.age}"
        }

        //Daten Laden - Alternativ
//        text?.let {
//            binding.secondFragmentTV.text = it
//        }
    }

}