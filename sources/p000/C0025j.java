package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: j */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0025j {

    /* renamed from: a */
    public static ClassLoader f31a;

    /* renamed from: a */
    public static int m20a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("cr_HostBrowserClassLoader", "Failed to get remote package info.");
            return -1;
        }
    }
}
