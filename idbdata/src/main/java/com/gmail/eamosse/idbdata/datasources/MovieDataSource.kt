package com.gmail.eamosse.idbdata.datasources
import com.gmail.eamosse.idbdata.data.Token
import com.gmail.eamosse.idbdata.utils.Result

interface MovieDataSource {
    suspend fun getToken(): Result<Token>
    suspend fun saveToken(token: Token)
}