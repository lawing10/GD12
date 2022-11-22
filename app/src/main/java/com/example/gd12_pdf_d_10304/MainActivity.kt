package com.example.gd12_pdf_d_10304

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class qrcodeactivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityQrcodeactivityBinding

    companion object{
        private const val CAMERA_REQUEST_CODE = 100
        private const val STORAGE_REQUEST_CODE = 101

        private const val TAG = "MAIN_TAG"
    }

    private lateinit var cameraPermission: Array<String>
    private lateinit var storagePermission: Array<String>

    private var imageUri: Uri? = null

    private vat barcodeScannerOption: BarcodeScannerOptions? = null
    private var barcodeScanner: BarcodeScanner: BarcodeScanner? = null

}