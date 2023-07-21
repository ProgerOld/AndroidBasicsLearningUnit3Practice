package com.example.androidbasicslearningunit3practice.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val countTopic: Int,
    @DrawableRes val imageResourceId: Int
)
