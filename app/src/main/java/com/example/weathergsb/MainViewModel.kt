package com.example.weathergsb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathergsb.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataModel = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}