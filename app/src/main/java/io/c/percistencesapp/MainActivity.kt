package io.c.percistencesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        var myNumToSave = 0
        var myTextToSave = ""

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myNumbrePicker.maxValue = 30
        myNumbrePicker.minValue = 0


    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //Sauvegarde des valeurs que je souhaite conserver à l'affichage... ou autre pi être
    override fun onSaveInstanceState(outState: Bundle?) {

        myNumToSave = myNumbrePicker.value

        super.onSaveInstanceState(outState)
    }


    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //Restauration des valeurs que je souhaite conserver à l'affichage... ou autre pi être
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {

        myNumbrePicker.value = myNumToSave

        super.onRestoreInstanceState(savedInstanceState)
    }



}