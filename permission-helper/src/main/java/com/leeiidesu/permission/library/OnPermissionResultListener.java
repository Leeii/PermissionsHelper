package com.leeiidesu.permission.library;

import java.util.ArrayList;

/**
 * Created by leeiidesu on 2017/7/14.
 */

public interface OnPermissionResultListener {
    void onGranted();

    void onFailed(ArrayList<String> deniedPermissions);
}
