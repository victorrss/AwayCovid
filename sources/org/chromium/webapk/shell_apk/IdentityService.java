package org.chromium.webapk.shell_apk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: chromium-WebApk.apk-default-1 */
public class IdentityService extends Service {

    /* renamed from: a */
    public final C0029n f45a = new C0031p(this);

    public IBinder onBind(Intent intent) {
        return this.f45a;
    }
}
