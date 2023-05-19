package com.carlosjimz87.instagramclone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carlosjimz87.instagramclone.R
import com.carlosjimz87.instagramclone.ui.theme.InstagramCloneTheme
import com.carlosjimz87.instagramclone.utils.Dummy

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 70.dp)
        ) {
            item {
                LazyRow() {
                    items(Dummy.storyList) { item ->
                        Column(
                            modifier = Modifier.padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(CircleShape)
                                    .border(1.dp, Color.Red, CircleShape)
                                    .padding(3.dp)
                                    .clip(CircleShape)
                                    .border(2.dp, Color.White, CircleShape),
                                painter = painterResource(id = item.profile),
                                contentDescription = item.name
                            )
                            Text(
                                text = item.name,
                                style = TextStyle(color = Color.Black)
                            )
                        }
                    }
                }
            }

            items(Dummy.postList) { item ->
                Column(Modifier.padding(0.dp, 10.dp)) {
                    Row(
                        Modifier
                            .padding(10.dp, 0.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(45.dp)
                                    .clip(CircleShape)
                                    .border(1.dp, Color.Red),
                                painter = painterResource(id = item.profile),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = item.name,
                                style = TextStyle(fontWeight = FontWeight.Medium)
                            )
                        }
                        Image(
                            modifier = Modifier.width(20.dp),
                            contentScale = ContentScale.FillWidth,
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = null
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))
                    Image(
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.FillWidth,
                        painter = painterResource(id = item.image), contentDescription = null
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row {
                            Image(
                                modifier = Modifier.width(25.dp),
                                contentScale = ContentScale.FillWidth,
                                painter = painterResource(id = R.drawable.like),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Image(
                                modifier = Modifier.width(25.dp),
                                contentScale = ContentScale.FillWidth,
                                painter = painterResource(id = R.drawable.comment),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Image(
                                modifier = Modifier.width(25.dp),
                                contentScale = ContentScale.FillWidth,
                                painter = painterResource(id = R.drawable.share),
                                contentDescription = null
                            )

                        }
                        Image(
                            modifier = Modifier.width(25.dp),
                            contentScale = ContentScale.FillWidth,
                            painter = painterResource(id = R.drawable.save),
                            contentDescription = null
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    InstagramCloneTheme {
        HomeScreen()
    }
}
