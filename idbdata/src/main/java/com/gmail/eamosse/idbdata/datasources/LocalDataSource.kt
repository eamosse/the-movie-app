package com.gmail.eamosse.idbdata.datasources

import com.gmail.eamosse.idbdata.local.daos.TokenDao
import com.gmail.eamosse.idbdata.local.entities.TokenEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class LocalDataSource @Inject constructor(private val tokenDao: TokenDao) {

    suspend fun getToken() = withContext(Dispatchers.IO) {
        tokenDao.retrieve()
    }

    suspend fun saveToken(entity: TokenEntity) = withContext(Dispatchers.IO) {
        tokenDao.insert(entity)
    }
}