import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowDataActivity : AppCompatActivity() {
    private lateinit var textViewName: TextView
    private lateinit var textViewEmail: TextView
    private lateinit var textViewMajor: TextView
    private lateinit var textViewSemester: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        textViewName = findViewById(R.id.textViewName)
        textViewEmail = findViewById(R.id.textViewEmail)
        textViewMajor = findViewById(R.id.textViewMajor)
        textViewSemester = findViewById(R.id.textViewSemester)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val major = intent.getStringExtra("major")
        val semester = intent.getIntExtra("semester", 0)

        textViewName.text = "Nama: $name"
        textViewEmail.text = "Email: $email"
        textViewMajor.text = "Jurusan: $major"
        textViewSemester.text = "Semester: $semester"
    }
}
