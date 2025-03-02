package com.example.affirmations.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,   // represents an ID for the affirmation text stored in a string resource
    @DrawableRes val imageResourceId: Int   // represents an ID for the affirmation image stored in a drawable resource
)
