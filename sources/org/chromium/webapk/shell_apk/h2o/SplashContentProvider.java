package org.chromium.webapk.shell_apk.h2o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* compiled from: chromium-WebApk.apk-default-1 */
public class SplashContentProvider extends ContentProvider implements ContentProvider.PipeDataWriter {

    /* renamed from: b */
    public static Bitmap.CompressFormat f55b;

    /* renamed from: c */
    public static AtomicReference f56c = new AtomicReference();

    /* renamed from: a */
    public String f57a;

    /* renamed from: a */
    public static byte[] m37a(byte[] bArr) {
        C0005F f = (C0005F) f56c.getAndSet(bArr != null ? new C0005F(bArr, new C0004E()) : null);
        if (f == null) {
            return null;
        }
        f.f6b.removeCallbacksAndMessages((Object) null);
        return f.f5a;
    }

    /* renamed from: b */
    public final Bitmap mo33b() {
        View view;
        Context applicationContext = getContext().getApplicationContext();
        SharedPreferences a = C0014O.m8a(applicationContext);
        int i = a.getInt("org.chromium.webapk.shell_apk.splash_width", -1);
        int i2 = a.getInt("org.chromium.webapk.shell_apk.splash_height", -1);
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        if (SplashActivity.m35a()) {
            view = LayoutInflater.from(applicationContext).inflate(R.layout.splash_screen_view, (ViewGroup) null);
        } else {
            view = C0008I.m2b(applicationContext);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, i, i2);
        return C0008I.m3c(view, 12582912);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        if (uri == null || !uri.toString().equals(this.f57a)) {
            return null;
        }
        if (f55b == null) {
            SharedPreferences a = C0014O.m8a(getContext().getApplicationContext());
            f55b = C0008I.m4d(a.getInt("org.chromium.webapk.shell_apk.splash_width", -1), a.getInt("org.chromium.webapk.shell_apk.splash_height", -1));
        }
        if (f55b == Bitmap.CompressFormat.PNG) {
            return "image/png";
        }
        if (f55b == Bitmap.CompressFormat.JPEG) {
            return "image/jpeg";
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate() {
        String packageName = getContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(packageName + ".SplashContentProvider");
        sb.append("/cached_splash_image");
        this.f57a = sb.toString();
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        if (uri == null || !uri.toString().equals(this.f57a)) {
            return null;
        }
        return openPipeHelper((Uri) null, (String) null, (Bundle) null, (Object) null, this);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeDataToPipe(android.os.ParcelFileDescriptor r1, android.net.Uri r2, java.lang.String r3, android.os.Bundle r4, java.lang.Object r5) {
        /*
            r0 = this;
            java.lang.Void r5 = (java.lang.Void) r5
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003b }
            java.io.FileDescriptor r1 = r1.getFileDescriptor()     // Catch:{ Exception -> 0x003b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x003b }
            r1 = 0
            byte[] r1 = m37a(r1)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0016
            r2.write(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x002f
        L_0x0016:
            android.graphics.Bitmap r1 = r0.mo33b()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x002f
            int r3 = r1.getWidth()     // Catch:{ all -> 0x0036 }
            int r4 = r1.getHeight()     // Catch:{ all -> 0x0036 }
            android.graphics.Bitmap$CompressFormat r3 = p000.C0008I.m4d(r3, r4)     // Catch:{ all -> 0x0036 }
            f55b = r3     // Catch:{ all -> 0x0036 }
            r4 = 100
            r1.compress(r3, r4, r2)     // Catch:{ all -> 0x0036 }
        L_0x002f:
            r2.flush()     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ Exception -> 0x003b }
            goto L_0x003b
        L_0x0036:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r1     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.webapk.shell_apk.h2o.SplashContentProvider.writeDataToPipe(android.os.ParcelFileDescriptor, android.net.Uri, java.lang.String, android.os.Bundle, java.lang.Object):void");
    }
}
