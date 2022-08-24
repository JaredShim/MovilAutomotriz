package com.example.movilautomotriz

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.service.autofill.SavedDatasetsInfo
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MenuMain :  AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer: DrawerLayout
    private lateinit var toogle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout)

        toogle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toogle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.Buscar -> {
                val findCar = Intent(this, findCar::class.java )

                startActivity(findCar)
            }
            R.id.NuevoRegistro -> {
                val nuevoregistro = Intent(this, Generals::class.java )

                startActivity(nuevoregistro)
            }
            R.id.Generales -> {
                val Generals = Intent(this, Generals::class.java )

                startActivity(Generals)
            }
            R.id.SistemasMotor -> {
                val SistemasMotor = Intent(this, SistemasMotor::class.java )

                startActivity(SistemasMotor)
            }

            R.id.GeneralesMotor -> {
                val GeneralesMotor = Intent(this, GeneralesMotor::class.java )

                startActivity(GeneralesMotor)
            }
            R.id.Automotrices -> {
                val Automotrices = Intent(this, Automotrices::class.java )

                startActivity(Automotrices)
            }
            R.id.Carroceria -> {
                val Carroceria = Intent(this, Carroceria::class.java )

                startActivity(Carroceria)
            }
            R.id.Interiores -> {
                val Interiores = Intent(this, Interiores::class.java )

                startActivity(Interiores)
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toogle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toogle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return false
        }
        return super.onOptionsItemSelected(item)
    }
}
