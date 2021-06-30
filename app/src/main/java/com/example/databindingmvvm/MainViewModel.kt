package com.example.databindingmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var number: Int = 1

    private val _counter = MutableLiveData<String>()
    val counter : LiveData<String>
        get() = _counter

    init {
        _counter.value = number.toString()
    }

    fun clickMe(){
        _counter.value = (number++).toString()
    }

    fun restart(){
        _counter.value = "0"
        number = 1
    }
}