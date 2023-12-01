import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.login.R

class AdapterCustom(private val context: Activity, private val title: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.instagram_layout, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.instagram_layout, null, true)

        var _gambar = rowView.findViewById<ImageView>(R.id.imageViewPost)
        var _nama = rowView.findViewById<TextView>(R.id.textViewUserName)

        _nama.setText(title[position])
        _gambar.setImageResource(imgid[position])
        return rowView
    }
}