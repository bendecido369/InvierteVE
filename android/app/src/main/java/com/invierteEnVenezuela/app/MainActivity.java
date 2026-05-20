package com.invierteEnVenezuela.app;

import android.view.KeyEvent;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (bridge != null && bridge.getWebView() != null && bridge.getWebView().canGoBack()) {
                bridge.getWebView().goBack();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
