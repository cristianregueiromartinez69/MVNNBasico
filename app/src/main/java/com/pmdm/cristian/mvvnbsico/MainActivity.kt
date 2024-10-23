package com.pmdm.cristian.mvvnbsico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pmdm.cristian.mvvnbsico.ui.theme.MVVNbásicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inicializamos ViewModel
        val miViewModel: MyViewModel = MyViewModel()

        enableEdgeToEdge()
        setContent {
            MVVNbásicoTheme {
                // llamamos a la IU pasando el ViewModel
                IU(miViewModel)

            }
        }
    }
}