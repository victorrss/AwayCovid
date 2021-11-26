package p000;

import android.content.ComponentName;
import android.content.Context;
import org.chromium.webapk.shell_apk.h2o.H2OMainActivity;
import org.chromium.webapk.shell_apk.h2o.H2OOpaqueMainActivity;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

/* renamed from: B */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0001B implements C0038w {

    /* renamed from: a */
    public final /* synthetic */ long f1a;

    /* renamed from: b */
    public final /* synthetic */ SplashActivity f2b;

    public C0001B(SplashActivity splashActivity, long j) {
        this.f2b = splashActivity;
        this.f1a = j;
    }

    /* renamed from: a */
    public void mo2a(String str, boolean z) {
        if (str == null) {
            this.f2b.finish();
            return;
        }
        SplashActivity splashActivity = this.f2b;
        C0027l a = C0027l.m23a(splashActivity, splashActivity.getIntent(), str, z, -1, this.f1a);
        SplashActivity splashActivity2 = this.f2b;
        int i = SplashActivity.f48g;
        if (a == null) {
            splashActivity2.finish();
            return;
        }
        Context applicationContext = splashActivity2.getApplicationContext();
        if (!C0028m.m27d(a)) {
            C0026k.m21a(splashActivity2, a);
            C0024i.m18a(applicationContext, new ComponentName(applicationContext, H2OMainActivity.class), new ComponentName(applicationContext, H2OOpaqueMainActivity.class));
            splashActivity2.finish();
            return;
        }
        splashActivity2.f52d = a;
        C0040y yVar = splashActivity2.f54f;
        yVar.f74d = true;
        yVar.mo46a();
    }
}
