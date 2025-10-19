import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.widget.Button

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        window.decorView.setBackgroundColor(Color.parseColor("#2196f3"))

        findViewById<Button>(R.id.btnOpenA).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnOpenD).setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnCloseC).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.btnCloseStack).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}