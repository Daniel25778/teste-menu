package com.example.appbar_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        supportActionBar!!.title = "Testando Menu"
        supportActionBar!!.subtitle = "Aprendendo a lidar com o Menu"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_teste, menu)
        return true
    }


}