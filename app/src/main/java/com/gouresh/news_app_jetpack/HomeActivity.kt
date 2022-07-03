package com.gouresh.news_app_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gouresh.news_app_jetpack.ui.theme.News_app_jetpackTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            News_app_jetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeScreen("Android")
                }
            }
        }
    }
}

@Composable
fun HomeScreen(name: String) {

    Scaffold(
        topBar = {AppBar("HEADLINES")}
    ) {
        renderList()
    }
}

@Composable
fun renderList(){

    LazyColumn(content =
    {
        item { Text("itemRow") }
    }
    )

}

@Composable
fun AppBar(appBarTitle : String){
    TopAppBar() {
        Text(text = appBarTitle)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    News_app_jetpackTheme {
        HomeScreen("Android !!")
    }
}