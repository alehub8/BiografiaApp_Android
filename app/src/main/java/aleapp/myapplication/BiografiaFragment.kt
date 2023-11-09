package aleapp.myapplication

import aleapp.myapplication.databinding.FragmentBiografiaBinding
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

class BiografiaFragment : Fragment() {

    private var _binding: FragmentBiografiaBinding? = null
    private val viewModel: BiografiaViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBiografiaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val label = findNavController().currentDestination!!.label
        if (label!!.contains("Ada")) {
            viewModel.setBio(1)
        }
        if (label!!.contains("Charles")) {
            viewModel.setBio(2)
        }
        if (label!!.contains("John")) {
            viewModel.setBio(3)
        }


        viewModel.currentBio.observe(viewLifecycleOwner) {
            binding.titleTextview.text = it.name
            val resId = resources.getIdentifier(it.foto, "drawable", "aleapp.myapplication")
            binding.fotoImageview.setImageDrawable(resources.getDrawable(resId))
            binding.bioTextview.text = it.biografia
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}