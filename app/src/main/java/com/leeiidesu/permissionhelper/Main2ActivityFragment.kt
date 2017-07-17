package com.leeiidesu.permissionhelper

import android.Manifest
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leeiidesu.permission.library.Config
import com.leeiidesu.permission.library.OnPermissionResultListener
import com.leeiidesu.permission.library.PermissionHelper
import kotlinx.android.synthetic.main.fragment_main2.*
import java.util.ArrayList

/**
 * A placeholder fragment containing a simple view.
 */
class Main2ActivityFragment : Fragment(), View.OnClickListener, OnPermissionResultListener {
    override fun onGranted() {
        Log.e("TAG", "onGranted")
    }

    override fun onFailed(deniedPermissions: ArrayList<String>) {
        Log.e("TAG", "onFailed")
    }

    override fun onClick(v: View?) {
        val config = Config.Builder().setDeniedText("大哥我错了，你快同意！")
                .setRationaleText("你是傻逼吗？这都不同意？")
                .build()

        PermissionHelper.request(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA), config, this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button.setOnClickListener(this)
    }
}
