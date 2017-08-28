# PermissionsHelper
Android 权限申请

### use

-in `FragmentActivity,v4.app.Fragment` or use `FragmentManager`

```
          PermissionHelper.with(this)
                .permissions(Manifest.permission.CAMERA)
                .request();
```

or


```
                  PermissionHelper.with(this)
                        .permissions(Manifest.permission.CAMERA)
                        .showOnRationale("需要相机权限", "取消", "我知道了")
                        .showOnDenied("必需要许可相机权限才能使用该功能", "取消", "去设置")
                        .listener(this)
                        .request();
```
