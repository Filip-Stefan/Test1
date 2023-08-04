package com.example.test1

data class Freak(val name: String, val resourceId: Int)

fun defaultFreaksList(): List<Freak> =
    listOf(
        Freak("cineva", R.drawable.profile1),
        Freak("cineva", R.drawable.profile1),
        Freak("altcineva", R.drawable.profile2),
        Freak("altcineva", R.drawable.profile2),
        Freak("altcineva", R.drawable.profile3),
        Freak("altcineva", R.drawable.profile4),
//        Freak("un om", R.drawable.profile5),
//        Freak("un om", R.drawable.profile5),
//        Freak("un om", R.drawable.profile5),
//        Freak("un om", R.drawable.profile5),
//        Freak("un om", R.drawable.profile5),
//        Freak("un om", R.drawable.profile5),
    )
