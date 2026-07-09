package com.example.designsystem.preview

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Small Phone",
    device = Devices.PIXEL_4,
    showBackground = true
)
@Preview(
    name = "Medium Phone",
    device = Devices.PIXEL_7,
    showBackground = true
)
@Preview(
    name = "Large Phone",
    device = Devices.PIXEL_8_PRO,
    showBackground = true
)
@Preview(
    name = "Tablet",
    device = Devices.TABLET,
    showBackground = true
)
@Preview(
    name = "Foldable",
    device = Devices.FOLDABLE,
    showBackground = true
)
annotation class DevicePreview