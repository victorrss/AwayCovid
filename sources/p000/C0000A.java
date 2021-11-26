package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

/* renamed from: A */
/* compiled from: chromium-WebApk.apk-default-1 */
public final /* synthetic */ class C0000A implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SplashActivity f0a;

    public /* synthetic */ C0000A(SplashActivity splashActivity) {
        this.f0a = splashActivity;
    }

    public final void run() {
        SplashActivity splashActivity = this.f0a;
        if (splashActivity.f51c == null) {
            splashActivity.mo27b((byte[]) null, Bitmap.CompressFormat.PNG);
        } else {
            splashActivity.f49a = new C0003D(splashActivity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
