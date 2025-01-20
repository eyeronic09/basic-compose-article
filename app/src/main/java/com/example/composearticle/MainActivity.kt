package com.example.composearticle

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    IndexPage(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

@Composable
fun GreetingImage() {
    val Bgimages =  painterResource(R.drawable.bg_compose_background)
    Image(painter = Bgimages, contentDescription = "image"   )

}

@Composable
fun IndexPage(modifier: Modifier){
     Column (modifier = modifier.fillMaxWidth()){
        GreetingImage()
         Text(text = "Jetpack Compose Tutorial", fontSize = 24.sp , modifier = Modifier.padding(16.dp))
         Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
             , modifier.padding(start = 16.dp , end = 16.dp) )
         Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
         , modifier.padding(start = 16.dp , end = 16.dp) )
    }
}



@Preview(showBackground = true)
@Composable
fun Preview() {
    ComposeArticleTheme {
        IndexPage(
          Modifier
        )       
    }
}
