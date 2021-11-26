package org.chromium.webapk.shell_apk.h2o;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.chromium.webapk.shell_apk.TransparentLauncherActivity;

/* compiled from: chromium-WebApk.apk-default-1 */
public class H2OMainActivity extends TransparentLauncherActivity {
    /* renamed from: a */
    public void mo23a(C0027l lVar) {
        if (lVar != null) {
            Context applicationContext = getApplicationContext();
            if (C0028m.m27d(lVar)) {
                if (!(System.currentTimeMillis() - applicationContext.getSharedPreferences("org.chromium.webapk.shell_apk", 0).getLong("org.chromium.webapk.shell_apk.request_host_browser_relaunch_timestamp", -1) <= 20000)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor edit = getSharedPreferences("org.chromium.webapk.shell_apk", 0).edit();
                    edit.putLong("org.chromium.webapk.shell_apk.request_host_browser_relaunch_timestamp", currentTimeMillis);
                    edit.apply();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("org.chromium.webapk.relaunch", true);
                    C0026k.m22b(this, lVar, bundle, 268435456, false);
                    C0024i.m18a(applicationContext, new ComponentName(applicationContext, H2OOpaqueMainActivity.class), getComponentName());
                    return;
                }
            }
            C0026k.m21a(this, lVar);
        }
    }
}
