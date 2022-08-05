package com.example.cryptoapp.domain.model

import com.example.cryptoapp.data.dto.TeamMember
import com.example.cryptoapp.data.dto.Whitepaper

data class CoinDetail(
    val coinId:String,
    val name :String,
    val description:String,
    val symbol:String,
    val rank:Int,
    val isActive:Boolean,
    val tags:List<String>,
    val team:List<TeamMember>,
    val type:String,
    val whitepaper:Whitepaper
)
