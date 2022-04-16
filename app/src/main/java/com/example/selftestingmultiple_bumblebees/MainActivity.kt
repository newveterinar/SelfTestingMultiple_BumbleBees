package com.example.selftestingmultiple_bumblebees

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: AppCompatActivity() {
    // Начинаем разработку кнопки
    /** Исходные данные */ //region
    lateinit var button: Button
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создали элемент Toast
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show()

        // Создали кнопку
        button = findViewById(R.id.buttonMainActivity)
    }
}