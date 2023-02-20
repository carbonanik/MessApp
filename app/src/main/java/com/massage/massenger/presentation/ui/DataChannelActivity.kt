package com.massage.massenger.presentation.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.massage.massenger.databinding.ActivityDataChannel2Binding
import com.massage.massenger.util.extensions.length
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DataChannelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataChannel2Binding
    private val viewModel by viewModels<DataChannelViewModel>()
    private lateinit var readActivityResultLauncher: ActivityResultLauncher<Intent>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataChannel2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.init()

        readActivityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result?.data?.data?.also { uri ->

                    contentResolver.openInputStream(uri)?.let {
                        // start
                        viewModel.sendImage(it, uri.length(contentResolver))
                    }
                }
            }
        }

        binding.pickImageButton.setOnClickListener {
            actionOpenDoc()
        }

        viewModel.incomingImage.observe(this) {
            binding.incomingImage.setImageBitmap(it)
        }
    }

    private fun actionOpenDoc() {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "image/*"
        }

        readActivityResultLauncher.launch(intent)
    }

    private val TAG = "SampleDataChannelAct"


    fun toast(t: String){
        Toast.makeText(this, t, Toast.LENGTH_SHORT).show()
    }

}