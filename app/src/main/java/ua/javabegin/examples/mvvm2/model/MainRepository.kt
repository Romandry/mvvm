package ua.javabegin.examples.mvvm2.model

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllEvents() = retrofitService.getAllEvents()
}