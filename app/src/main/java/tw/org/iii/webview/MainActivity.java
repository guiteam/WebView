package tw.org.iii.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mesg ;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        webView = new WebView(this);
        webView.loadUrl("http://www.iii.org.tw");
        setContentView(webView);
//        mesg =(TextView)findViewById(R.id.mesg);
//        webView=(WebView)findViewById(R.id.webView);
        initWebView();
    }

    public  void initWebView(){

    }
}
