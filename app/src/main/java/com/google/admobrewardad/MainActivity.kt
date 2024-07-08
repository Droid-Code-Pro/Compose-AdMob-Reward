package com.google.admobrewardad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.google.admobrewardad.ui.component.DroidTopAppBar
import com.google.admobrewardad.ui.theme.AdMobRewardAdTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      AdMobRewardAdTheme {
        Scaffold(modifier = Modifier.fillMaxSize(),
          topBar = { DroidTopAppBar() }) { innerPadding ->
          Surface(modifier = Modifier.padding(innerPadding)) {
            AdMobRewardAdScreen()
          }
        }
      }
    }
  }
}
