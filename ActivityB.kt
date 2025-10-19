import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.widget.Button

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        window.decorView.setBackgroundColor(Color.parseColor("#4caf50"))

        findViewById<Button>(R.id.btnOpenC).setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }
}