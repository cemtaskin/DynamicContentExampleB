package com.ttposmobile.dynamiccontentexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ttposmobile.dynamiccontentexam.ui.theme.DynamicContentExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicContentExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   
                }
            }
        }
    }
}

@Composable
fun GreetingList (names: List<String>){
    Column() {
        for(name in names){
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name : String){
    Text(name)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DynamicContentExamTheme {
        GreetingList(names = listOf("Ali Duru","Aliye Duru","DENEME"))
    }
}