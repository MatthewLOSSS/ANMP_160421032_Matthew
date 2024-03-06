package com.st.a160421032matthew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.st.a160421032matthew.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStart.setOnClickListener{
            val name=binding.txtName.text.toString()
            val action = MainFragmentDirections.actionGameFragment(name)
            Navigation.findNavController(it).navigate(action)
        }
    }



}