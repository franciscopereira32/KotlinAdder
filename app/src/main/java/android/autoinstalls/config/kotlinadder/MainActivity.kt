package android.autoinstalls.config.kotlinadder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvNumber = this.findViewById<TextView>(R.id.tvNumber)
        var mais = this.findViewById<Button>(R.id.btSoma)
        var menos = this.findViewById<Button>(R.id.btMenos)
        var stop:Int = 10
        var number:Int = 0

        mais.setOnClickListener {
            if (number < stop){
                number ++
                tvNumber.text = number.toString()
                }
        }
        menos.setOnClickListener {
            if (number > 0){
                number --
                tvNumber.text = number.toString()
            }
        }
    }
}
