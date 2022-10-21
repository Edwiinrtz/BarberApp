package com.example.barbarapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun hourComponent(hourRange:String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp)
            .border(.5.dp, color = Color.Gray)

    ) {
        Text(text = hourRange,
            color = Color.LightGray,
            modifier = Modifier.wrapContentHeight(Alignment.Bottom)
                .wrapContentWidth(Alignment.Start)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun hourPreview() {
    hourComponent(hourRange = "6am a 7am")
}