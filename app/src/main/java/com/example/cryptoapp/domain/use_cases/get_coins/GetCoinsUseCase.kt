package com.example.cryptoapp.domain.use_cases.get_coins

import com.example.cryptoapp.common.Resource
import com.example.cryptoapp.data.repository.CoinRepository
import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.toCoin
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository

) {

    operator fun invoke (): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins=repository.getCoins().map{it.toCoin()}
            emit(Resource.Success(coins))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?:"Error"))
        }catch (e:IOException){
            emit(Resource.Error("couldnt reach server."))

        }
    }
}