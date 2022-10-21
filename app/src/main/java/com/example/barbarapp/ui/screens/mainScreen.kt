package com.example.barbarapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.barbarapp.ui.components.hourComponent
import com.example.barbarapp.ui.components.topbarComponent

@Composable
fun mainScreen(addTurn:()->Unit) {

    val horarios = listOf<String>(
        "6am a 7am",
        "7am a 8am",
        "8am a 9am",
        "9am a 10am",
        "10am a 11am",
        "11am a 12m",
        "12m a 1pm",
    )

    Scaffold(
        topBar = { topbarComponent(iconImage= Icons.Filled.Star,"") },
        content = {
                  LazyColumn{
                      items(horarios){ item ->
                          hourComponent(hourRange = item)
                      }
                      
                  }

        },
        floatingActionButton = {
            FloatingActionButton(onClick = addTurn) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add a new turn assignation")
            }
        },
        isFloatingActionButtonDocked = true,


    )

}

@Preview
@Composable
fun mainPrev() {

    mainScreen() {}

}