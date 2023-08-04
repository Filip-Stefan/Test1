package com.example.test1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController,
        startDestination = BottomNavigationItem.Home.screenRoute,
        modifier = Modifier.fillMaxHeight(0.9f)
    ) {
        composable(BottomNavigationItem.Home.screenRoute) {
            HomeScreen()
        }
        composable(BottomNavigationItem.Freaks.screenRoute) {
            FreaksScreen()
        }
        composable(BottomNavigationItem.Profile.screenRoute) {
            ProfileScreen()
        }
    }
}

@Composable
fun BottomTabs(navController: NavHostController) {
    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Freaks,
        BottomNavigationItem.Profile,
    )
    NavigationBar(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        NavigationBarItem(selected = true, onClick = {
            navController.navigate(BottomNavigationItem.Home.screenRoute)
        }, icon = {
            Image(painterResource(id = R.drawable.home), contentDescription = "home")
        }, label = { Text(text = "Home", fontFamily = nunitoFontFamily) })
        NavigationBarItem(selected = true, onClick = {
            navController.navigate(BottomNavigationItem.Freaks.screenRoute)
        }, icon = {
            Image(painterResource(id = R.drawable.presentation), contentDescription = "freaks")
        }, label = { Text(text = "Freaks", fontFamily = nunitoFontFamily) })
        NavigationBarItem(selected = true, onClick = {
            navController.navigate(BottomNavigationItem.Profile.screenRoute)
        }, icon = {
            Image(painterResource(id = R.drawable.profile), contentDescription = "profile")
        }, label = { Text(text = "Profile", fontFamily = nunitoFontFamily) })

    }
}