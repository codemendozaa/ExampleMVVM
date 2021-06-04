package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteModel
import com.example.examplemvvm.data.network.QuoteRepository

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}