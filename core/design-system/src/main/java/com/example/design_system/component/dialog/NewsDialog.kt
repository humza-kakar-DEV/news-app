package com.example.design_system.component.dialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.design_system.preview.AppPreview
import com.example.design_system.preview.PreviewTheme

@Composable
fun NewsDialog(
    onDismissRequest: () -> Unit,
    confirmButtonText: String,
    onConfirmClick: () -> Unit,
    title: String,
    text: String,
    modifier: Modifier,
    dismissButtonText: String? = null,
    onDismissClick: (() -> Unit)? = null,
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(onClick = onConfirmClick) {
                Text(
                    text = confirmButtonText,
                    style = MaterialTheme.typography.labelLarge
                )
            }
        },
        dismissButton = dismissButtonText?.let {
            {
                TextButton(onClick = { onDismissClick?.invoke() }) {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        },
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge
            )
        },
        text = {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    )
}

@AppPreview
@Composable
fun NewsDialogPreview() {
    PreviewTheme {
        NewsDialog(
            onDismissRequest = {},
            confirmButtonText = "Confirm",
            onConfirmClick = {},
            title = "Dialog Title",
            text = "This is a news app dialog description.",
            modifier = Modifier
        )
    }
}
