package org.chromium.webapk.shell_apk.h2o;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/* compiled from: chromium-WebApk.apk-default-1 */
public class SplashActivity extends Activity {

    /* renamed from: g */
    public static final /* synthetic */ int f48g = 0;

    /* renamed from: a */
    public AsyncTask f49a;

    /* renamed from: b */
    public View f50b;

    /* renamed from: c */
    public Bitmap f51c;

    /* renamed from: d */
    public C0027l f52d;

    /* renamed from: e */
    public int f53e;

    /* renamed from: f */
    public final C0040y f54f = new C0040y(new C0000A(this));

    /* renamed from: a */
    public static boolean m35a() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: b */
    public final void mo27b(byte[] bArr, Bitmap.CompressFormat compressFormat) {
        int width = this.f50b.getWidth();
        int height = this.f50b.getHeight();
        Bitmap.CompressFormat compressFormat2 = SplashContentProvider.f55b;
        SharedPreferences.Editor edit = getSharedPreferences("org.chromium.webapk.shell_apk", 0).edit();
        edit.putInt("org.chromium.webapk.shell_apk.splash_width", width);
        edit.putInt("org.chromium.webapk.shell_apk.splash_height", height);
        edit.apply();
        SplashContentProvider.f55b = compressFormat;
        SplashContentProvider.m37a(bArr);
        C0027l lVar = this.f52d;
        String str = lVar.f37f;
        Bundle bundle = new Bundle();
        bundle.putBoolean("org.chromium.chrome.browser.webapk.splash_provided_by_webapk", true);
        C0026k.m22b(this, lVar, bundle, 65536, true);
        this.f52d = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f53e != 2 && i2 == 0) {
            this.f53e = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            boolean r9 = m35a()
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x002a
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            boolean r9 = r9.hasCategory(r2)
            if (r9 == 0) goto L_0x002a
            android.view.Window r9 = r8.getWindow()
            z r2 = new z
            r2.<init>(r8)
            J r3 = new J     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002a }
            r3.<init>(r9, r8, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002a }
            p000.C0011L.m6a(r8, r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002a }
            r9 = 1
            goto L_0x002b
        L_0x002a:
            r9 = 0
        L_0x002b:
            r2 = 0
            r3 = 23
            if (r9 != 0) goto L_0x00f9
            android.os.Bundle r9 = p000.C0015P.m15g(r8)
            java.lang.String r4 = "org.chromium.webapk.shell_apk.themeColor"
            java.lang.String r4 = r9.getString(r4)
            r5 = -1
            if (r4 == 0) goto L_0x0054
            java.lang.String r6 = "L"
            boolean r6 = r4.endsWith(r6)
            if (r6 != 0) goto L_0x0046
            goto L_0x0054
        L_0x0046:
            int r6 = r4.length()     // Catch:{ NumberFormatException -> 0x0054 }
            int r6 = r6 + r5
            java.lang.String r4 = r4.substring(r1, r6)     // Catch:{ NumberFormatException -> 0x0054 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            r6 = -1
        L_0x0056:
            int r4 = (int) r6
            android.view.Window r6 = r8.getWindow()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.addFlags(r7)
            r6.setStatusBarColor(r4)
            boolean r4 = p000.C0015P.m16h(r4)
            r4 = r4 ^ r0
            android.view.Window r6 = r8.getWindow()
            android.view.View r6 = r6.getDecorView()
            android.view.View r6 = r6.getRootView()
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r3) goto L_0x0079
            goto L_0x0087
        L_0x0079:
            int r7 = r6.getSystemUiVisibility()
            if (r4 == 0) goto L_0x0082
            r4 = r7 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0084
        L_0x0082:
            r4 = r7 & -8193(0xffffffffffffdfff, float:NaN)
        L_0x0084:
            r6.setSystemUiVisibility(r4)
        L_0x0087:
            java.lang.String r4 = "org.chromium.webapk.shell_apk.orientation"
            java.lang.String r9 = r9.getString(r4)
            if (r9 == 0) goto L_0x00c6
            java.lang.String r4 = "natural"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x0098
            goto L_0x00c6
        L_0x0098:
            java.lang.String r9 = "window"
            java.lang.Object r9 = r8.getSystemService(r9)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            android.view.Display r9 = r9.getDefaultDisplay()
            int r4 = r9.getRotation()
            if (r4 == 0) goto L_0x00b9
            r6 = 2
            if (r4 != r6) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            int r4 = r9.getHeight()
            int r9 = r9.getWidth()
            if (r4 >= r9) goto L_0x00c4
            goto L_0x00c7
        L_0x00b9:
            int r4 = r9.getHeight()
            int r9 = r9.getWidth()
            if (r4 < r9) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            r0 = 0
            goto L_0x00c7
        L_0x00c6:
            r0 = -1
        L_0x00c7:
            if (r0 == r5) goto L_0x00cc
            r8.setRequestedOrientation(r0)
        L_0x00cc:
            boolean r9 = m35a()
            if (r9 == 0) goto L_0x00e0
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r8)
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            android.view.View r9 = r9.inflate(r0, r2)
            r8.f50b = r9
            goto L_0x00e6
        L_0x00e0:
            android.view.View r9 = p000.C0008I.m2b(r8)
            r8.f50b = r9
        L_0x00e6:
            android.view.View r9 = r8.f50b
            android.view.ViewTreeObserver r9 = r9.getViewTreeObserver()
            C r0 = new C
            r0.<init>(r8)
            r9.addOnGlobalLayoutListener(r0)
            android.view.View r9 = r8.f50b
            r8.setContentView(r9)
        L_0x00f9:
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r3) goto L_0x0141
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.Class<org.chromium.webapk.shell_apk.h2o.SplashActivity> r5 = org.chromium.webapk.shell_apk.h2o.SplashActivity.class
            r4.<init>(r8, r5)
            int r5 = r8.getTaskId()
            if (r9 >= r3) goto L_0x010f
            goto L_0x013a
        L_0x010f:
            java.lang.String r9 = "activity"
            java.lang.Object r9 = r8.getSystemService(r9)
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9
            java.util.List r9 = r9.getAppTasks()
            java.util.Iterator r9 = r9.iterator()
        L_0x011f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r9.next()
            android.app.ActivityManager$AppTask r3 = (android.app.ActivityManager.AppTask) r3
            android.app.ActivityManager$RecentTaskInfo r3 = r3.getTaskInfo()     // Catch:{ IllegalArgumentException -> 0x0138 }
            if (r3 == 0) goto L_0x011f
            int r6 = r3.id     // Catch:{ IllegalArgumentException -> 0x0138 }
            if (r6 != r5) goto L_0x011f
            android.content.ComponentName r2 = r3.topActivity     // Catch:{ IllegalArgumentException -> 0x0138 }
            goto L_0x013a
        L_0x0138:
            goto L_0x011f
        L_0x013a:
            boolean r9 = r4.equals(r2)
            if (r9 != 0) goto L_0x0141
            return
        L_0x0141:
            x r9 = new x
            r9.<init>(r8)
            B r2 = new B
            r2.<init>(r8, r0)
            r9.mo45a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.webapk.shell_apk.h2o.SplashActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SplashContentProvider.m37a((byte[]) null);
        AsyncTask asyncTask = this.f49a;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.f49a = null;
        }
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f53e = 2;
        C0040y yVar = this.f54f;
        yVar.f75e = false;
        yVar.f74d = false;
        yVar.f73c = false;
        new C0039x(this).mo45a(new C0001B(this, -1));
    }

    public void onResume() {
        super.onResume();
        if (this.f53e == 1) {
            finish();
            return;
        }
        this.f53e = 0;
        C0040y yVar = this.f54f;
        yVar.f73c = true;
        yVar.mo46a();
    }
}
