package br.com.fiap.chickpay.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.chickpay.R

@Composable
fun HomeScreen(navController: NavController) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(
            PaddingValues(
                top = 40.dp,
                bottom = 25.dp,
                start = 10.dp,
                end = 10.dp
            )
        )
    ) {
        Text(
            text = "Olá,",
            fontSize = 22.sp,
            fontWeight = FontWeight.W400,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Nome do usuário",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    )
                    .background(Color(0xFFEC6666))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Saldo em conta",
                    color = Color.White,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    fontSize = 22.sp,
                    text = "R$ 1.000,00",
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffF3F3F3))
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {navController.navigate("Maintenance")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffF3F3F3)),
                    shape = RoundedCornerShape(0.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Exibir Extrato",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W600
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Pagamentos",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(
                            RoundedCornerShape(10.dp
                            )
                        )
                        .background(Color(0xFFEC6666))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {
                                    navController.navigate("Payment")
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_dollar),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Débito\n automático",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Payment")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_cart),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Cartões",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Payment")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_boletos),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Boletos",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Payment")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_pix),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Pix",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Maintenance")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_consulta),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Consultar \n" +
                                        "pagamentos",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Maintenance")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_vencimentos),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Próximos\nvencimentos",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                    }
                }

            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Outros",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(
                            RoundedCornerShape(10.dp
                            )
                        )
                        .background(Color(0xFFEC6666))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Maintenance")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_consulta),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Cashback",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Maintenance")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_nature),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "CO2e",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {navController.navigate("Maintenance")},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                                shape = RoundedCornerShape(30.dp),
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_donation),
                                    contentDescription = "Ícone do botão",
                                    modifier = Modifier.size(60.dp),
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                modifier = Modifier.width(100.dp),
                                text = "Pontos",
                                textAlign = TextAlign.Center,
                                color = Color.White,
                            )
                        }
                    }
                }

            }
        }
    }
}