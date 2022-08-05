package com.example.cryptoapp.data.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

@GET("/v1/coins")
suspend fun getCoins():List<CoinDto>
@GET("/c1/coins/{coinId}")
suspend fun getCoinById(@Path("coinId")coinId:String):CoinDetailDto




}