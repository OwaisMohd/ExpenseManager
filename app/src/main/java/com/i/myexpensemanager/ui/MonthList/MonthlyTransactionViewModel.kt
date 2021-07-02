package com.i.myexpensemanager.ui.MonthList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.i.myexpensemanager.data.MonthlyTransactions
import com.i.myexpensemanager.data.TransactionListRepository

class MonthlyTransactionViewModel(application: Application): AndroidViewModel(application) {

    private val repo: TransactionListRepository = TransactionListRepository(application)

    val month: LiveData<List<MonthlyTransactions>>
        get() = repo.getTransactionMonth()

}