package com.example.test1

sealed class BottomNavigationItem(val name: String, val icon: Int, val screenRoute: String) {
    object Home : BottomNavigationItem("Home", R.drawable.home, "home")
    object Freaks : BottomNavigationItem("Freaks", R.drawable.presentation, "freaks")
    object Profile : BottomNavigationItem("com.example.test1.Profile", R.drawable.profile, "profile")
}