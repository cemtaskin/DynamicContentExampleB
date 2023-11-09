package com.ttposmobile.dynamiccontentexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
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
                   MainScreen()

                }
            }
        }
    }
}


@Composable
fun MainScreen (){
    var namesState =  remember{ mutableStateListOf<String>("Ali Duru","Aliye Duru","DENEME")}

    Column() {
    GreetingList(namesState,{
        namesState.add("Yeni Kişi")
    })
        NamesCount(nameList = namesState)
    }
}

@Composable
fun NamesCount (nameList: List<String>){
    Text(nameList.size.toString())
}
@Composable
fun GreetingList (nameList : List<String>,buttonClick : ()->Unit){

    Column() {
        for(name in nameList){
            Greeting(name = name)
        }

        Button(onClick = buttonClick) {
            Text("Yeni Kişi")
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

    }
}