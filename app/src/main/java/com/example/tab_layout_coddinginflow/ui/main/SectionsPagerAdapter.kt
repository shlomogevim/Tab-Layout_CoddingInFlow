package com.example.tab_layout_coddinginflow.ui.main

import android.content.Context
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tab_layout_coddinginflow.R
import com.example.tab_layout_coddinginflow.model.Fragment_1
import com.example.tab_layout_coddinginflow.model.Fragment_2
import com.example.tab_layout_coddinginflow.model.Fragment_3
import com.google.android.material.bottomnavigation.BottomNavigationView

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

          var frgPosition:Fragment?=null
        when (position){
            0->frgPosition= Fragment_1()
            1->frgPosition= Fragment_2()
            2->frgPosition= Fragment_3()
        }

      //  return PlaceholderFragment.newInstance(position + 1)
        return frgPosition!!
    }


  /*  object : BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            var selectedFragment: Fragment? = null
            when (item.getItemId()) {
                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_favorites -> selectedFragment = FavoriteFragment()
                R.id.nav_search -> selectedFragment = SearchFregment()
            }
            getSupportFragmentManager().beginTransaction().replace(
                R.id.fragment_container, selectedFragment!!
            ).commit()
            return true
        }

    }  */




    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}