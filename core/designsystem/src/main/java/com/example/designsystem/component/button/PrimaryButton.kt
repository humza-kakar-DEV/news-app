package com.example.designsystem.component.button


import androidx.annotation.StringRes
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.designsystem.R
import com.example.designsystem.preview.AppPreview
import com.example.designsystem.preview.PreviewTheme
import com.example.designsystem.token.SizeToken
import androidx.compose.foundation.layout.height

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    @StringRes textRes: Int,
) {
    Button(
        modifier = modifier.height(SizeToken.ButtonHeight),
        onClick = onClick,
    ) {
        Text(
            text = stringResource(textRes),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@AppPreview
@Composable
fun PrimaryButtonPreview() {
    PreviewTheme {
        PrimaryButton(
            modifier = Modifier,
            onClick = {},
            textRes = R.string.next
        )
    }
}
