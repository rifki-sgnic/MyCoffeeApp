package com.example.mycoffeeapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coffee(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val ingredients: List<String>,
    val price: String,
) : Parcelable

