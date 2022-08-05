package com.example.cryptoapp.presentation

import com.example.cryptoapp.common.Resource
import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? =null,
    val error: String = ""

)
