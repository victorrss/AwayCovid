package org.chromium.webapk.shell_apk.h2o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: chromium-WebApk.apk-default-1 */
public class H2OOpaqueMainActivity extends Activity {
    public void onCreate(Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        overridePendingTransition(0, 0);
        C0024i.m19b(applicationContext, getIntent(), (String) null, elapsedRealtime, new ComponentName(applicationContext, SplashActivity.class));
        finish();
    }
}
