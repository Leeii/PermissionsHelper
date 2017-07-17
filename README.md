# PermissionsHelper
Android 权限申请

### use

-in `Activity,Fragment,v4.app.Fragment` or use `FragmentManager`

```
 PermissionHelper.request(this,new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
        });
```

or


```
PermissionHelper.request(this,new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
        },config,resultListener);
```
