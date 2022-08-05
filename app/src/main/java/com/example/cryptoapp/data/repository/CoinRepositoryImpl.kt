package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.dto.CoinDetailDto
import com.example.cryptoapp.data.dto.CoinDto
import com.example.cryptoapp.data.dto.CoinPaprikaApi
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api:CoinPaprikaApi
):CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}