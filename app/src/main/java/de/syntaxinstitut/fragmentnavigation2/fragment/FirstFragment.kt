package de.syntaxinstitut.fragmentnavigation2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.fragmentnavigation2.MainActivity
import de.syntaxinstitut.fragmentnavigation2.R
import de.syntaxinstitut.fragmentnavigation2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val profile = Profile(
            "Hans",
            6,
            "zuhause",
            true,
            "Hanni"
        )

        binding.firstFragmentTV.setOnClickListener {

            val mainActivity = activity as MainActivity
            mainActivity.profile = profile

            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(profile.name))

        }
    }

}