package ua.javabegin.examples.mvvm2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ua.javabegin.examples.mvvm2.model.MainRepository
import ua.javabegin.examples.mvvm2.model.MyViewModelFactory
import ua.javabegin.examples.mvvm2.R
import ua.javabegin.examples.mvvm2.databinding.ActivityMainBinding
import ua.javabegin.examples.mvvm2.model.RetrofitService
import ua.javabegin.examples.mvvm2.model.SmoothResponse
import ua.javabegin.examples.mvvm2.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    lateinit var viewModel: MainViewModel

    private val retrofitService = RetrofitService.getInstance()
    val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, MyViewModelFactory(MainRepository(retrofitService))).get(
            MainViewModel::class.java)

        binding.recyclerview.adapter = adapter

        viewModel.eventList.observe(this,  Observer{
//            Log.d(TAG, "onCreate: $it")
            adapter.setEventList(it)
        })

        viewModel.errorMessage.observe(this,  {

        })
        viewModel.getAllEvents()
    }
}