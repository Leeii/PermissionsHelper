# PermissionsHelper
Android 权限申请

### use
- in your **build.gradle**

```
compile 'com.leeiidesu:permission-helper:1.1.0'
````

然后


-in `FragmentActivity,v4.app.Fragment` or use `FragmentManager`

```
PermissionHelper.with(this) // FragmentActivity/v4.app.Fragment/FragmentManager
     .permissions(Manifest.permission.CAMERA) 
     .request();
```

or


```
PermissionHelper.with(this)
    .permissions(Manifest.permission.CAMERA)
    .showOnRationale("需要相机权限", "取消", "我知道了")    //用户拒绝过但没有勾选不再提示会显示对话框
    .showOnDenied("必需要许可相机权限才能使用该功能", "取消", "去设置") //用户勾选不再提示会显示对话框
    .listener(this)
    .request();
```
