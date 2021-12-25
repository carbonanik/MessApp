package com.massage.massenger.util

sealed class PermissionStatus {
    object PermissionGranted : PermissionStatus()

    class PermissionDenied(
        val deniedPermission: List<String>
    ) : PermissionStatus()

//    class ShowRational(requestCode: Int) : PermissionStatus(requestCode)
//    class PermissionDeniedPermanently(
//        requestCode: Int,
//        val permanentlyDeniedPermission: List<String>
//    ) : PermissionStatus(requestCode)
}
