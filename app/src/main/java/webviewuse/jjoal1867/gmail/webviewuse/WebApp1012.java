package webviewuse.jjoal1867.gmail.webviewuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebApp1012 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app1012);

        WebView webView = (WebView)findViewById(R.id.webView);
        //리다이렉트가 있는 경우, 크롬으로 가지않고 현재 앱에서 이동하도록 설정
        webView.setWebViewClient(new WebViewClient());

        //자바스크립트 사용설정
        //webView.getSettings().setJavaScriptEnabled(true);
        WebSettings set = webView.getSettings();
        set.setJavaScriptEnabled(true);
        //확대축소 버튼을 추가
        set.setBuiltInZoomControls(true);

        webView.loadUrl("http://192.168.0.251:8080/mobileweb");
    }
}
