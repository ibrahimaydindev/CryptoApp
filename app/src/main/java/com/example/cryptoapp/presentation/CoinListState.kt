package com.example.cryptoapp.presentation

import com.example.cryptoapp.common.Resource
import com.example.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> =emptyList(),
    val error: String = ""

)
