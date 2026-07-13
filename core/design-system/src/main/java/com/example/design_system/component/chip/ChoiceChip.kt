package com.example.design_system.component.chip

import androidx.annotation.StringRes
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.design_system.R
import com.example.design_system.token.BorderToken
import com.example.design_system.token.RadiusToken
import com.example.design_system.token.SpacingToken

@Composable
fun ChoiceChip(
    @StringRes textRes: Int,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {

    val colors = if (selected) {
        ButtonDefaults.outlinedButtonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    } else {
        ButtonDefaults.outlinedButtonColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.primary
        )
    }

    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        colors = colors,
        border = BorderStroke(
            BorderToken.Thin,
            MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(RadiusToken.Medium),
        contentPadding = PaddingValues(
            horizontal = SpacingToken.Large,
            vertical = SpacingToken.XSmall
        )
    ) {
        Text(
            text = stringResource(textRes),
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@AppPreview
@Composable
fun ChoiceChipPreview() {
    PreviewTheme {
        ChoiceChip(
            textRes = R.string.next,
            selected = true,
            onClick = {},
            modifier = Modifier,
            enabled = true
        )
    }
}