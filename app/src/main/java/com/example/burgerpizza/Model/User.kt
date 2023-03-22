package com.example.burgerpizza.Model

import java.io.Serializable

data class User constructor(
    val number: String,
    val name: String,
    val tittle: String,
    val price: String,
    val imageID: Int,
): Serializable {}
