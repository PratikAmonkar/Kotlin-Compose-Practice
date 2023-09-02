package com.example.authenticationui.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun ImageDisplay(modifier: Modifier = Modifier, @DrawableRes imageName: Int) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = imageName),
            contentDescription = "Login Image",
            contentScale = ContentScale.Fit,
        )
    }
}