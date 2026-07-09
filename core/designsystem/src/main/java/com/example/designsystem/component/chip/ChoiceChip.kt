package com.example.designsystem.component.chip

import androidx.annotation.StringRes
import com.example.designsystem.preview.AppPreview
import com.example.designsystem.preview.PreviewTheme

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
import androidx.compose.ui.unit.dp
import com.example.designsystem.R

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
            1.dp,
            MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(
            horizontal = 20.dp,
            vertical = 10.dp
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