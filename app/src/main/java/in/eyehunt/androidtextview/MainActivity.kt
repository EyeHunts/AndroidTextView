package `in`.eyehunt.androidtextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Dynamically text change - on click button
    fun changeText(view : View){
        textView5.setText("Hello I am dynamic text")
    }
}
