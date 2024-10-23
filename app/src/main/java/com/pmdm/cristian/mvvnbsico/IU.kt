package com.pmdm.cristian.mvvnbsico

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Interfaz de usuario
 * Modificado desde Code
 */

@Composable
fun IU(miViewModel: MyViewModel, modifier: Modifier = Modifier) {
    // creo un boton
    Boton(miViewModel, Colores.CLASE_AZUL)
}

@Composable
fun Boton(miViewModel: MyViewModel, enum_color: Colores) {

    // para que sea mas facil la etiqueta del log
    val TAG_LOG: String = "miDebug"

    Button(
        // utilizamos el color del enum
        colors =  ButtonDefaults.buttonColors(enum_color.color),
        onClick = {
            Log.d(TAG_LOG, "Dentro del onClick")
            miViewModel.crearRandom()
        },
        modifier = Modifier
            .size(100.dp)
            .padding(10.dp)
    ) {
        // utilizamos el texto del enum
        Text(text = enum_color.txt, fontSize = 10.sp)
    }
}
/**
 * Preview de la interfaz de usuario
 */

@Preview(showBackground = true)
@Composable
fun IUPreview() {
    IU(MyViewModel())
}