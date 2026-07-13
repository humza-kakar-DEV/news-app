package com.example.design_system.preview

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Small Phone",
    device = Devices.PIXEL_4,
)
@Preview(
    name = "Medium Phone",
    device = Devices.PIXEL_7,
)
@Preview(
    name = "Large Phone",
    device = Devices.PIXEL_8_PRO,
)
@Preview(
    name = "Tablet",
    device = Devices.TABLET,
)
@Preview(
    name = "Foldable",
    device = Devices.FOLDABLE,
)
annotation class DevicePreview