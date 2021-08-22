package ua.javabegin.examples.mvvm2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ua.javabegin.examples.mvvm2.model.MainRepository
import ua.javabegin.examples.mvvm2.model.SmoothResponse

class MainViewModel constructor(private val repository: MainRepository): ViewModel() {

    val eventList = MutableLiveData<List<SmoothResponse>>()
    val errorMessage = MutableLiveData<String>()

    fun getAllEvents() {

        val response = repository.getAllEvents()

        response.enqueue(object: Callback<List<SmoothResponse>>{
            override fun onResponse(call: Call<List<SmoothResponse>>, response: Response<List<SmoothResponse>>) {
                eventList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<SmoothResponse>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}