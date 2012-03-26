package com.jetoile.devoxx.game.client;

import android.graphics.Color;
import android.os.Bundle;
//import org.apache.cordova.*;
import com.phonegap.DroidGap;
import com.strumsoft.websocket.phonegap.WebSocketFactory;

public class MyActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        super.setIntegerProperty("backgroundColor", Color.DKGRAY);
//        super.loadUrl("file:///android_asset/www/index.html");
//        super.loadUrl("file:///android_asset/www/indexTomcat2.html");
        super.loadUrl("file:///android_asset/www/indexJBoss3.html");

//        appView.addJavascriptInterface(new WebSocketFactory(appView), "WebSocketFactory");
    }

}
