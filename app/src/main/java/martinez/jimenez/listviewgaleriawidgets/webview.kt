package martinez.jimenez.listviewgaleriawidgets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_webview.*

class webview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        miwebview.settings.javaScriptEnabled
        miwebview.loadUrl("http://jviewz.com/#/dna")

    }
}
