package com.example.sportsnews.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SportNews(
    var title: String,
    var description: String,
    var date: String
): Parcelable
