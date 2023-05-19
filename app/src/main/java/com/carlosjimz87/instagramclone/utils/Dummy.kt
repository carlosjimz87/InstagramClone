package com.carlosjimz87.instagramclone.utils

import com.carlosjimz87.instagramclone.R
import com.carlosjimz87.instagramclone.models.Post
import com.carlosjimz87.instagramclone.models.Story

object Dummy {
    val storyList = mutableListOf(
        Story("Your story", R.drawable.profile1),
        Story("Jonu", R.drawable.profile2),
        Story("Ahmad", R.drawable.profile3),
        Story("Akbar", R.drawable.profile4),
        Story("Julia", R.drawable.profile5),
        Story("Chad", R.drawable.profile6),
    )

    val postList = mutableListOf(
        Post("Raj Sing", R.drawable.profile1, image = R.drawable.post1),
        Post("Jonu", R.drawable.profile2, image = R.drawable.post2),
    )
}