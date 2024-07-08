package com.google.admobrewardad

import android.app.Activity
import android.widget.Toast
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

class AdMobRewardAd {
  
  private var rewardAd: RewardedAd? = null
  
  fun loadRewardAd(activity: Activity,adId:String) {
    val adRequest = AdRequest.Builder().build()
    RewardedAd.load(activity,adId,adRequest,object : RewardedAdLoadCallback(){
      override fun onAdFailedToLoad(p0: LoadAdError) {
        super.onAdFailedToLoad(p0)
        rewardAd = null
        Toast.makeText(activity,"Ad Failed to Load",Toast.LENGTH_LONG).show()
      }
      
      override fun onAdLoaded(ad: RewardedAd) {
        super.onAdLoaded(ad)
        rewardAd = ad
        Toast.makeText(activity,"Ad Loaded Successfully",Toast.LENGTH_LONG).show()
      }
    })
  }
  
  fun showRewardAd(activity: Activity) {
    if (rewardAd == null) {
      Toast.makeText(activity,"Reward Ad Not Loaded",Toast.LENGTH_LONG).show()
      return
    }
  rewardAd?.show(activity) {
    Toast.makeText(activity, "Reward Ad Shown", Toast.LENGTH_LONG).show()
  }
    rewardAd?.fullScreenContentCallback = object :FullScreenContentCallback(){
      override fun onAdClicked() {
        super.onAdClicked()
      }
      
      override fun onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent()
      }
      
      override fun onAdFailedToShowFullScreenContent(p0: AdError) {
        super.onAdFailedToShowFullScreenContent(p0)
      }
      
      override fun onAdImpression() {
        super.onAdImpression()
      }
      
      override fun onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent()
      }
    }
  }
}