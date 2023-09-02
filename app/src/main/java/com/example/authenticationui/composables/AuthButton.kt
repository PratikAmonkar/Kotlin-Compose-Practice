package com.example.authenticationui.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun AuthButton(isButtonEnable:Boolean,@StringRes btnName:Int){
    ElevatedButton(
        onClick = { }, enabled = isButtonEnable, colors = ButtonDefaults.elevatedButtonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
        ), modifier = Modifier.width(200.dp)
    ) {
        Text(stringResource(id = btnName), style = MaterialTheme.typography.bodyMedium)
    }
}