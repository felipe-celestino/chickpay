import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.chickpay.ui.theme.RobotoBold

@Composable
fun PaymentScreen() {
    Box(modifier = Modifier.fillMaxWidth().padding(50.dp)) {
        Text(
            text = "Pagamentos",
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 30.sp,
            fontFamily = RobotoBold
        )
    }
}