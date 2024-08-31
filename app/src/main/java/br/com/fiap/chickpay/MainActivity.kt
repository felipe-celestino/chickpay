package br.com.fiap.chickpay

import CadastroScreen
import br.com.fiap.chickpay.screens.HomeScreen
import LoginScreen
import MaintenanceScreen
import PaymentScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Home") {
                        composable(route = "Login") {
                            LoginScreen(navController)
                        }
                        composable(route = "Cadastro") {
                            CadastroScreen()
                        }
                        composable(route = "Home") {
                            HomeScreen(navController)
                        }
                        composable(route = "Payment") {
                            PaymentScreen(navController)
                        }
                        composable(route = "Maintenance") {
                            MaintenanceScreen(navController)
                        }
                    }
                }
            }
        }
    }
}