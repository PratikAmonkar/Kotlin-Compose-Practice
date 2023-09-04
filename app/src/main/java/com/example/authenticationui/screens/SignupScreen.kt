package com.example.authenticationui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.authenticationui.R
import com.example.authenticationui.composables.AuthButton
import com.example.authenticationui.composables.ImageDisplay


@Composable
fun SignupScreen(modifier: Modifier = Modifier) {
    var email = rememberSaveable { mutableStateOf("") }
    var password = rememberSaveable { mutableStateOf("") }
    var confirmPassword = rememberSaveable { mutableStateOf("") }
    var openDialog by rememberSaveable { mutableStateOf(false) }


    Column(
        modifier
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())
            .padding(vertical = 10.dp, horizontal = 30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.login), style = MaterialTheme.typography.titleLarge)
        ImageDisplay(imageName = R.drawable.signup_img)
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email id") },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Enter your email id") },
            trailingIcon = {
                Icon(
                    Icons.Outlined.Email, contentDescription = "Email icon"
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                autoCorrect = false,
                imeAction = ImeAction.Done,
            ),
            singleLine = true,
        )
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Enter your password") },
            trailingIcon = {
                Icon(
                    Icons.Outlined.Lock, contentDescription = "Lock icon"
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                autoCorrect = false,
            ),
        )
        OutlinedTextField(
            value = confirmPassword.value,
            onValueChange = { confirmPassword.value = it },
            label = { Text("Confirm password") },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Enter your password") },
            trailingIcon = {
                Icon(
                    Icons.Outlined.Lock, contentDescription = "Lock icon"
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                autoCorrect = false,
            ),
        )
//        AuthButton(
//            isButtonEnable = true,
//            btnName = R.string.login,
//            isButtonClick = { openDialog = true },
//            emailId = email,
//            password = password
//        )

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text("Already have an account ? ")
            Text(
                stringResource(id = R.string.login),
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

