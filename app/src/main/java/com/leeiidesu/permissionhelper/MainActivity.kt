package com.leeiidesu.permissionhelper

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.leeiidesu.permission.library.OnPermissionResultListener
import com.leeiidesu.permission.library.PermissionHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), OnPermissionResultListener {
    override fun onGranted() {
        Log.e("TAG", "onGranted")
    }

    override fun onFailed(deniedPermissions: ArrayList<String>) {
        Log.e("TAG", "onFailed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        fab.setOnClickListener { _ ->

           PermissionHelper.with(this)
                   .permissions(Manifest.permission.READ_EXTERNAL_STORAGE)
                   .request()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
