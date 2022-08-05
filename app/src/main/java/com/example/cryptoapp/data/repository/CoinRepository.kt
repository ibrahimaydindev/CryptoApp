package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.dto.CoinDetailDto
import com.example.cryptoapp.data.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String):CoinDetailDto
}