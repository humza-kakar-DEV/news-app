package com.example.design_system.typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.design_system.R

val AppFontFamily = FontFamily(

    Font(
        R.font.natosans_bold,
        FontWeight.Bold
    ),

    Font(
        R.font.natosans_medium,
        FontWeight.Medium
    ),

    Font(
        R.font.natosans_light,
        FontWeight.Light
    )
)