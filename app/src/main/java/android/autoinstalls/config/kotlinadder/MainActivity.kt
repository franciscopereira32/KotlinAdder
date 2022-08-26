package android.autoinstalls.config.kotlinadder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number:Int = 0
        var tvNumber = this.findViewById<TextView>(R.id.tvNumber)
        var mais = this.findViewById<Button>(R.id.btSoma)
        var stop:Int = 10

        mais.setOnClickListener {
            if (number < stop){
                number ++
                tvNumber.text = number.toString()
                }else{
                    tvNumber.text = 0.toString()
                    val mIntent = intent
                    finish()
                    startActivity(mIntent)
            }
        }
    }
}
