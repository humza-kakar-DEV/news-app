package com.example.design_system.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Light",
)
annotation class LightPreview

@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
annotation class DarkPreview

@Preview(
    name = "Large Font",
    fontScale = 1.5f,
)
annotation class LargeFontPreview

@Preview(
    name = "Small Font",
    fontScale = 0.85f,
)
annotation class SmallFontPreview

@Preview(
    name = "RTL",
    locale = "ar",
)
annotation class RTLPreview