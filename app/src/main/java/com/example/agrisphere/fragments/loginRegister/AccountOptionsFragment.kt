package com.example.agrisphere.fragments.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.agrisphere.R



class AccountOptionsFragment: Fragment(R.layout.fragment_account_options) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonRegisterAccountOptions: Button =
            view.findViewById(R.id.buttonRegisterAccountOptions)

        buttonRegisterAccountOptions.setOnClickListener {
            findNavController().navigate(R.id.registerFragment2)
        }

        val buttonLoginAccountOptions: Button = view.findViewById(R.id.buttonLoginAccountOptions)
        buttonLoginAccountOptions.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
    }
}








