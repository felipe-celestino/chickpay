import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.chickpay.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logosecundario),
                contentDescription = "Logo Principal",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(370.dp)
                    .padding(top = 10.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 280.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Cadastro",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .clip(
                    RoundedCornerShape(
                        topStart = 50.dp,
                        topEnd = 50.dp
                    )
                )
                .height(490.dp)
                .background(color = Color.White),
        ) {
            var name by remember {
                mutableStateOf("")
            }
            var email by remember{
                mutableStateOf( "")
            }
            var telefone by remember{
                mutableStateOf( "")
            }
            var cpf by remember{
                mutableStateOf( "")
            }
            var password by remember {
                mutableStateOf("")
            }

            TextField(
                value = name,
                onValueChange = { newValue ->
                    name = newValue
                },
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .shadow(8.dp, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                label = {
                    Text("Nome completo")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Representa um user"
                    )
                }
            )

            TextField(
                value = email,
                onValueChange = { newValue ->
                    name = newValue
                },
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .shadow(8.dp, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                label = {
                    Text("Email")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Representa uma Caixa de Email"
                    )
                }
            )

            TextField(
                value = telefone,
                onValueChange = { newValue ->
                    name = newValue
                },
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .shadow(8.dp, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                label = {
                    Text("Telefone")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Representa um Telefone"
                    )
                }
            )

            TextField(
                value = cpf,
                onValueChange = { newValue ->
                    name = newValue
                },
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .shadow(8.dp, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                label = {
                    Text("CPF")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "Representa um user"
                    )
                }
            )

            TextField(
                value = password,
                onValueChange = { newValue ->
                    password = newValue
                },
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .shadow(8.dp, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                label = {
                    Text("Password")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Representa de Senha"
                    )
                },
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(70.dp))

            Button(
                onClick = {
                    navController.navigate("Home")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Red
                ),
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "proximo",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}