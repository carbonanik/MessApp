package com.massage.massenger.util.extensions

import android.content.Context
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.massage.massenger.util.PermissionStatus

class PermissionHandler(context: Context, vararg permissionToRequest: String){

    init {

    }

    fun onResult(){

    }

}
fun AppCompatActivity.myRequestPermission(
    vararg permissionToRequest: String,
    onPermissionResult: (status: PermissionStatus) -> Unit,
) {

    val permissionLauncher: ActivityResultLauncher<Array<String>> = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    )
    { permissions ->

        val notPermitted = mutableListOf<String>()
        permissions.forEach {
            if (it.value == false) {
                notPermitted.add(it.key)
            }
        }

        if (notPermitted.isEmpty()) {
            // all permission granted
            Toast.makeText(
                this, "Read Permission Granted",
                Toast.LENGTH_SHORT
            ).show()
            onPermissionResult(PermissionStatus.PermissionGranted)
        } else {
            onPermissionResult(PermissionStatus.PermissionDenied(notPermitted))
        }
    }

    val remainPermissionToRequest = mutableListOf<String>()

    permissionToRequest.forEach {

        val hasPermission =
            ContextCompat.checkSelfPermission(this, it) ==
                    PackageManager.PERMISSION_GRANTED

        if (!hasPermission) {
            remainPermissionToRequest.add(it)
            Toast.makeText(this,
                "Add permission to request list", Toast.LENGTH_SHORT).show()
        }
    }

    if (remainPermissionToRequest.isNotEmpty()) {
        permissionLauncher.launch(remainPermissionToRequest.toTypedArray())
        Toast.makeText(this, "launch permission", Toast.LENGTH_SHORT).show()
    } else {
        // no permission to launch
        onPermissionResult(PermissionStatus.PermissionGranted)
    }
}
