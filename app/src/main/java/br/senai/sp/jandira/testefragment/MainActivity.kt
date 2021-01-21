package br.senai.sp.jandira.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import br.senai.sp.jandira.testefragment.fragments.ConsoleFragment
import br.senai.sp.jandira.testefragment.fragments.GamesFragment
import br.senai.sp.jandira.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment
    private lateinit var gamesFragment: GamesFragment

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gamesFragment = GamesFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, homeFragment)
            .commit()

    }

    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.button_home -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, homeFragment)
//                    .commit()
//            }
//            R.id.button_consoles -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, consoleFragment)
//                    .commit()
//            }
//            R.id.button_games -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, gamesFragment)
//                    .commit()
//            }
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.menu_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, homeFragment)
                    .commit()
            }
            R.id.menu_console -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, consoleFragment)
                    .commit()
            }
            R.id.menu_games -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, gamesFragment)
                    .commit()
            }
        }

        return true
    }
}