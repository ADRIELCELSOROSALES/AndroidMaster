package com.example.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaster.firstapp.firstAppActivity
import com.example.androidmaster.imccalculeitor.ImcCalculatorActivity
import com.example.androidmaster.settings.SettingActivity
import com.example.androidmaster.superheroapp.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
        btnSettings.setOnClickListener { NavigationToSetting() }
    }

    private fun NavigationToSetting() {
        val intent = Intent (this, SettingActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent( this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }


    private fun navigateToSaludApp(){
        val intent = Intent(this, firstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}