package martinez.jimenez.listviewgaleriawidgets


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayOf("Botones", "Imagenes", "WebView", "Switch")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista)

        lvWidgets.adapter = adaptador

        lvWidgets.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent()
            when(i){
                0 -> intent = Intent(this, boton::class.java)
                1 -> intent = Intent(this, imagen::class.java)
                2 -> intent = Intent(this, webview::class.java)
                3 -> intent = Intent(this, switch::class.java)
            }
            startActivity(intent)
        }

    }
}