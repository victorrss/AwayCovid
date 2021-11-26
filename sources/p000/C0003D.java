package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Pair;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

/* renamed from: D */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0003D extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ SplashActivity f4a;

    public C0003D(SplashActivity splashActivity) {
        this.f4a = splashActivity;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r4) {
        /*
            r3 = this;
            java.lang.Void[] r4 = (java.lang.Void[]) r4
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0035 }
            r4.<init>()     // Catch:{ IOException -> 0x0035 }
            org.chromium.webapk.shell_apk.h2o.SplashActivity r0 = r3.f4a     // Catch:{ all -> 0x0030 }
            android.graphics.Bitmap r0 = r0.f51c     // Catch:{ all -> 0x0030 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0030 }
            org.chromium.webapk.shell_apk.h2o.SplashActivity r1 = r3.f4a     // Catch:{ all -> 0x0030 }
            android.graphics.Bitmap r1 = r1.f51c     // Catch:{ all -> 0x0030 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0030 }
            android.graphics.Bitmap$CompressFormat r0 = p000.C0008I.m4d(r0, r1)     // Catch:{ all -> 0x0030 }
            org.chromium.webapk.shell_apk.h2o.SplashActivity r1 = r3.f4a     // Catch:{ all -> 0x0030 }
            android.graphics.Bitmap r1 = r1.f51c     // Catch:{ all -> 0x0030 }
            r2 = 100
            r1.compress(r0, r2, r4)     // Catch:{ all -> 0x0030 }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0030 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0036
        L_0x0030:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r0 = 0
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003D.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        Bitmap.CompressFormat compressFormat;
        Pair pair = (Pair) obj;
        SplashActivity splashActivity = this.f4a;
        byte[] bArr = null;
        splashActivity.f49a = null;
        if (pair != null) {
            bArr = (byte[]) pair.first;
        }
        if (pair == null) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = (Bitmap.CompressFormat) pair.second;
        }
        splashActivity.mo27b(bArr, compressFormat);
    }
}
