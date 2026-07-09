package com.example.designsystem.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Light",
    showBackground = true
)
annotation class LightPreview

@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
annotation class DarkPreview

@Preview(
    name = "Large Font",
    fontScale = 1.5f,
    showBackground = true
)
annotation class LargeFontPreview

@Preview(
    name = "Small Font",
    fontScale = 0.85f,
    showBackground = true
)
annotation class SmallFontPreview

@Preview(
    name = "RTL",
    locale = "ar",
    showBackground = true
)
annotation class RTLPreview