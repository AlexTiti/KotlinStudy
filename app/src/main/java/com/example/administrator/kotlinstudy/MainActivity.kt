package com.example.administrator.kotlinstudy

import android.os.Bundle
import android.renderscript.Int2
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        //function("String",int = 3,int2 = 5,boo = false);
        message.text = getString(R.string.title_dashboard)

    }

    private fun testKotlin(){
        val name : String? = null
        message.setText(name+"=="+ name!!.length);

        message.setOnClickListener{testKotlin()}


    }

    private fun function(str : String = "",int: Int = 1,int2: Int = 2,boo:Boolean = true){
        message.setText(str + boo+"== int + int2 ="+(int+int2));

    }

    data class User(val name : String,val age : Int){

    }
}
