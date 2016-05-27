package com.traffitruck;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient  extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        String uri = Uri.parse(url).getHost();
        if (uri.toLowerCase().contains("traffitruck")
                || uri.equals("54.77.150.182")
                || uri.equals("10.0.0.22")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
