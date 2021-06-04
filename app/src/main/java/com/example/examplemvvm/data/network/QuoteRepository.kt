package com.example.examplemvvm.data.network

import com.example.examplemvvm.data.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider

class QuoteRepository {

    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}