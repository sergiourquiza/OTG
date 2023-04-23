package pe.edu.ulima.ui.login.uis

import android.content.res.Configuration
import android.graphics.Paint.Align
import android.graphics.drawable.ShapeDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import pe.edu.ulima.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import coil.transform.CircleCropTransformation
import pe.edu.ulima.ui.theme.Gray200
import pe.edu.ulima.ui.theme.Orange200
import pe.edu.ulima.ui.theme.White200

/*
Los @ arriba de la funcion se utilizan para generar una vista previa de un componente Composable.
Esto permite a los desarrolladores ver cómo se verá un Composable en tiempo real,
sin necesidad de ejecutar la aplicación completa.
Esto es especialmente útil para la iteración
rápida en el diseño de la interfaz de usuario.
*/

// Clase que modela los Sayayines que habrán
data class Sayayin(
    val nombre: String,
    val imageUrl: String
)

//=============================================
@Preview
@Composable
public fun GokuProfileScreenPreview() {
    GokuProfileScreen()

//=============================================
}

@Composable
public fun GokuProfileScreen(){

// IMPORTAMOS LAS FUENTES desde el FONT.(NAME)
    val caslonFont = FontFamily(Font(R.font.caslon_classico_sc_regular))
    val coralFont = FontFamily(Font(R.font.coral))
    val valentineFont = FontFamily(Font(R.font.valentine))
    val otonoFont = FontFamily(Font(R.font.otono))

    val sayayines : MutableList<Sayayin> = mutableListOf();


    Column(
        modifier = Modifier
            .fillMaxSize()
            // CONDICIONAL QUE NOS CAMBIA EL BACKGROUND COLOR DEPENDIENTDO EL SYSTEM THEME
            .background(if (isSystemInDarkTheme()) Gray200 else White200)
    ){

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = rememberImagePainter(data = "https://sm.ign.com/ign_latam/screenshot/default/goku-ssj-blue-3_6qjv.jpg"),
                contentDescription = "Goku profile picture",
                modifier = Modifier
                    .size(150.dp)
                    .padding(bottom = 10.dp)
                    .padding(start = 10.dp)
                    .clip(CircleShape)


            )
            Column(
               modifier = Modifier
                   .weight(weight = 1f)
                   .align(Alignment.CenterVertically)
                   .padding(start = 10.dp)



            ){
                Text(
                    modifier = Modifier
                    .padding(start = 17.dp),
                    text = "20",
                    textAlign = TextAlign.Center,
                    fontFamily = coralFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,



                )
                Text(
                    text = "PUBLICACIONES",
                    textAlign = TextAlign.Center,
                    fontFamily = valentineFont
                )

            }

            Column(
                modifier = Modifier
                    .weight(weight = 1f)
                    .align(Alignment.CenterVertically)



            ){
                Text(
                    text = "90",
                    textAlign = TextAlign.Center,
                    fontFamily = coralFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp


                )
                Text(
                    text = "SEGUIDOS",
                    textAlign = TextAlign.Center,
                    fontFamily = valentineFont
                )

            }

        }
        sayayines.add(Sayayin("Kokun 1", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 2", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 3", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 4", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 5", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 6", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 7", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 8", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))
        sayayines.add(Sayayin("Kokun 8", "https://static.wikia.nocookie.net/dragonball/images/c/c0/Son_Goku_en_Super_Hero.png/revision/latest/scale-to-width-down/222?cb=20220302091733&path-prefix=es"))

        for(i in 0..sayayines.size/3) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                if((i+1)*3-3 in sayayines.indices){
                    Image(
                        painter = rememberImagePainter(data = sayayines[(i+1)*3-3].imageUrl),
                        contentDescription = "Foto del sayayin",

                    )
                }
                if((i+1)*3-2 in sayayines.indices){
                    Image(
                        painter = rememberImagePainter(data = sayayines[(i+1)*3-2].imageUrl),
                        contentDescription = "Foto del sayayin"
                    )
                }
                if((i+1)*3-1 in sayayines.indices){
                    Image(
                        painter = rememberImagePainter(data = sayayines[(i+1)*3-1].imageUrl),
                        contentDescription = "Foto del sayayin"
                    )
                }
            }
        }
    }
}