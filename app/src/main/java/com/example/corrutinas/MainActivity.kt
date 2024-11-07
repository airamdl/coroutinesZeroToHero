package com.example.corrutinas

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.corrutinas.ui.theme.CorrutinasTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val retrofit = RetrofitHelper.getInstance()

        lifecycleScope.launch(Dispatchers.IO) {
            val response: Response<SuperHeroDataResponse> = retrofit.getSuperheroes("a")
            if (response.isSuccessful) {
                runOnUiThread {
                    Log.i("dam2", "${this@MainActivity} ${response.toString()} Entra")
                    Log.i("dam2", response.body().toString())
                    Log.i("dam2", response.raw().toString())
                }

                setContent {
                    CorrutinasTheme {
                        Surface {

                            SuperheroList()
                        }
                    }
                }
            }
        }
    }
    }

@Composable
fun SuperheroList() {
//    var retrofit = RetrofitHelper.getInstance()
//
//
//
//    Log.i("Dam2","${retrofit.getSuperheroes('a')}")
    Text(
        text ="hola"
    )
}
