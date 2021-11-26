package p000;

import android.os.Handler;

/* renamed from: F */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0005F {

    /* renamed from: a */
    public byte[] f5a;

    /* renamed from: b */
    public Handler f6b;

    public C0005F(byte[] bArr, Runnable runnable) {
        this.f5a = bArr;
        Handler handler = new Handler();
        this.f6b = handler;
        handler.postDelayed(runnable, 10000);
    }
}
