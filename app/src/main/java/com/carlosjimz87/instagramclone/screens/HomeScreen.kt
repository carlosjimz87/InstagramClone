package com.carlosjimz87.instagramclone.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carlosjimz87.instagramclone.R
import com.carlosjimz87.instagramclone.ui.theme.InstagramCloneTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color.White
                ),
                title = {
                    Image(
                        modifier = Modifier
                            .width(140.dp)
                            .padding(0.dp, 10.dp, 0.dp, 0.dp),
                        contentScale = ContentScale.FillWidth,
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = null
                    )
                },
                actions = {
                    Image(
                        modifier = Modifier.width(30.dp),
                        contentScale = ContentScale.FillWidth,
                        painter = painterResource(id = R.drawable.like), contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Image(
                        modifier = Modifier.width(30.dp),
                        contentScale = ContentScale.FillWidth,
                        painter = painterResource(id = R.drawable.message),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                }
            )
        },
        bottomBar = {
            Row(
                modifier = Modifier
                    .background(Color.White)
                    .border(1.dp, Color.White)
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.home), contentDescription = null
                )
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.search), contentDescription = null
                )
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.save), contentDescription = null
                )
                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .border(
                            1.dp, Color.Red,
                            CircleShape
                        ),
                    painter = painterResource(id = R.drawable.profile1), contentDescription = null
                )
            }
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    InstagramCloneTheme {
        HomeScreen()
    }
}
