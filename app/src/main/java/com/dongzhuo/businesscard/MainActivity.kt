package com.dongzhuo.businesscard

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dongzhuo.businesscard.ui.theme.WangXinChenAquaticCorpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WangXinChenAquaticCorpTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val ToastDescription =
                        getString(R.string.this_program_is_non_interactive_and_only_have_one_page_due_to_my_ability_as_a_starter_and_tight_schedule_please_enjoy)
                    DongZhuoContent()
                    Toast.makeText(this, ToastDescription, Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}

@Composable
fun DongZhuoContent () {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.avatarlowres),
            contentDescription = "A very handsome photo of Dong Zhuo.",
            modifier = Modifier
                .requiredSize(width = 200.dp, height = 200.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(text = stringResource(R.string.Name), fontSize = 50.sp, lineHeight = 55.sp, modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        Text(text = stringResource(R.string.AKA), fontSize = 40.sp, lineHeight = 45.sp,modifier = Modifier.align(alignment = Alignment.CenterHorizontally),color = Color.Blue)
        Text(text = stringResource(R.string.Description_1),fontSize = 20.sp,modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        Text(text = stringResource(R.string.Description_2),fontSize = 20.sp,modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        Text(text = stringResource(R.string.Description_AquaticCorp),fontSize = 20.sp,modifier = Modifier.align(alignment = Alignment.CenterHorizontally), color = Color.Red)


    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    WangXinChenAquaticCorpTheme {
        DongZhuoContent()
    }
}