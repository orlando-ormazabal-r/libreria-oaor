package com.oor.mylibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

fun NavGraphBuilder.dashboardGraph(navController: NavHostController) {
    navigation(
        route = "dashboardRoot",
        startDestination = "dashboard"
    ) {
        composable("dashboard") {
            TextWhitDescription(
                text = "Texto de prueba",
                description = "Description",
                onClick = {
                    navController.navigate("description")
                }
            )
        }

        composable("description") {
            TextWhitDescription(
                text = "Navegación interna de libreria",
                description = "Estamos navegando internamente",
            )
        }
    }
}

@Composable
fun TextWhitDescription(
    modifier: Modifier = Modifier,
    text: String,
    description: String,
    onClick: () -> Unit = { }
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
    ) {
        Text(
            text = text,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.clickable {
                onClick()
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = description,
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Monospace
        )
    }
}