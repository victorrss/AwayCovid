package org.chromium.webapk.shell_apk;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: chromium-WebApk.apk-default-1 */
public class TransparentLauncherActivity extends Activity {
    /* renamed from: a */
    public void mo23a(C0027l lVar) {
        if (lVar != null) {
            C0015P.m13e(getApplicationContext(), lVar);
            C0026k.m21a(this, lVar);
        }
    }

    public void onCreate(Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        new C0039x(this).mo45a(new C0012M(this, elapsedRealtime));
    }
}
