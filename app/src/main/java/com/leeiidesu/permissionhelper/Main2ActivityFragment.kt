package com.leeiidesu.permissionhelper

import android.Manifest
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leeiidesu.permission.PermissionHelper
import com.leeiidesu.permission.callback.OnPermissionResultListener
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
        PermissionHelper.with(this)
                .permissions(Manifest.permission.CAMERA)
                .request()
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
