package com.fazal.appdataexchange1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saveFile(view: View) {
        val text = txt.text.toString()
        var file: File? = null
        var fileDirectory : FileOutputStream? = null
        try {
            file = filesDir
            fileDirectory = openFileOutput("faz.txt", Context.MODE_PRIVATE)
            fileDirectory.write(text.toByteArray())
            Log.i("file_path", file.absolutePath)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
