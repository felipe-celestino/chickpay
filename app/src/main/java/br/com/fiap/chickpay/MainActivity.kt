package br.com.fiap.chickpay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import br.com.fiap.chickpay.ui.theme.ChickPayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChickPayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComponent()
                }
            }
        }
    }
}

@Composable
fun MyComponent() {

    Column(modifier = Modifier.padding(top = 40.dp, start = 10.dp, end = 10.dp)) {
        Text(
            text = "Sign Up",
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 24.sp,
            fontWeight = FontWeight.W600
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Mude Row para Column aqui
        Column {
            Text(text = "Nome:", modifier = Modifier.fillMaxWidth())
            TextField(
                value = "",
                onValueChange = { /* TODO */ },
                label = { Text(text = "Digite seu nome") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Sobrenome:", modifier = Modifier.fillMaxWidth())
            TextField(
                value = "",
                onValueChange = { /* TODO */ },
                label = { Text(text = "Digite seu sobrenome") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ChickPayTheme {
        MyComponent()
    }
}