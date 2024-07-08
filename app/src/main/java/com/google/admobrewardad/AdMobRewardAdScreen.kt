package com.google.admobrewardad

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily

@Composable
fun AdMobRewardAdScreen() {
  val activity = LocalContext.current as Activity
  val adId = stringResource(id = R.string.admob_reward_ad)
  val rewardAd = remember { AdMobRewardAd() }

  Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround,
    modifier = Modifier.fillMaxSize()) {
    
  Text(text = "AdMob Reward Ad",
    style = MaterialTheme.typography.headlineLarge,
    fontFamily = FontFamily.Cursive,)

  Row (modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceAround){
    Button(onClick = { rewardAd.loadRewardAd(activity,adId)}) {
      Text(text = "Load Reward Ad")
    }
    
    Button(onClick = { rewardAd.showRewardAd(activity) }) {
      Text(text = "Show Reward Ad")
    }
  }
}
  }
