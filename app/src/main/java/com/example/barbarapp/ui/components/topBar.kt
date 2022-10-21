package com.example.barbarapp.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun topbarComponent(iconImage:ImageVector?, iconDesc: String?) {


    TopAppBar(

        title = { Text(text = "BarberApp", fontWeight = FontWeight.Bold)},
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                if (iconImage != null) {
                    Icon(
                        iconImage,
                        contentDescription = iconDesc
                    )
                }

            }
        }
    ) 
}

@Preview
@Composable
fun topbarPrev() {

    topbarComponent(iconImage= Icons.Filled.Star,"")

}