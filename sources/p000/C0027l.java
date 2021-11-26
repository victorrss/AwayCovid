package p000;

import android.content.Intent;

/* renamed from: l */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0027l {

    /* renamed from: a */
    public boolean f32a;

    /* renamed from: b */
    public String f33b;

    /* renamed from: c */
    public int f34c;

    /* renamed from: d */
    public boolean f35d;

    /* renamed from: e */
    public Intent f36e;

    /* renamed from: f */
    public String f37f;

    /* renamed from: g */
    public int f38g;

    /* renamed from: h */
    public boolean f39h;

    /* renamed from: i */
    public long f40i;

    /* renamed from: j */
    public long f41j;

    /* renamed from: k */
    public String f42k;

    public C0027l(boolean z, String str, int i, boolean z2, Intent intent, String str2, int i2, boolean z3, long j, long j2, String str3) {
        this.f32a = z;
        this.f33b = str;
        this.f34c = i;
        this.f35d = z2;
        this.f36e = intent;
        this.f37f = str2;
        this.f38g = i2;
        this.f39h = z3;
        this.f40i = j;
        this.f41j = j2;
        this.f42k = str3;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0194  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0027l m23a(android.content.Context r17, android.content.Intent r18, java.lang.String r19, boolean r20, long r21, long r23) {
        /*
            r5 = r18
            android.os.Bundle r0 = p000.C0015P.m15g(r17)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = p000.C0028m.m25b(r19)
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x0015
        L_0x0012:
            r6 = r19
            goto L_0x0044
        L_0x0015:
            android.content.pm.PackageManager r2 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0012 }
            r6 = r19
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0043 }
            java.lang.String r2 = r2.versionName
            java.lang.String r7 = "Developer Build"
            boolean r7 = android.text.TextUtils.equals(r2, r7)
            if (r7 == 0) goto L_0x0030
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0044
        L_0x0030:
            java.lang.String r7 = "."
            int r7 = r2.indexOf(r7)
            if (r7 >= 0) goto L_0x0039
            goto L_0x0044
        L_0x0039:
            java.lang.String r2 = r2.substring(r4, r7)     // Catch:{  }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{  }
            r3 = r2
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r7 = -1
            java.lang.String r2 = "org.chromium.chrome.browser.webapk_launch_time"
            long r7 = r5.getLongExtra(r2, r7)
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            r9 = r7
            goto L_0x0056
        L_0x0054:
            r9 = r21
        L_0x0056:
            java.lang.String r2 = "org.chromium.webapk.selected_share_target_activity_class_name"
            java.lang.String r2 = r5.getStringExtra(r2)
            java.lang.String r7 = r18.getAction()
            java.lang.String r8 = "android.intent.action.SEND"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0074
            java.lang.String r7 = r18.getAction()
            java.lang.String r8 = "android.intent.action.SEND_MULTIPLE"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x007c
        L_0x0074:
            android.content.ComponentName r2 = r18.getComponent()
            java.lang.String r2 = r2.getClassName()
        L_0x007c:
            r13 = r2
            java.lang.String r2 = "org.chromium.webapk.shell_apk.startUrl"
            r7 = 1
            if (r13 == 0) goto L_0x0168
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.String r11 = r17.getPackageName()
            r8.<init>(r11, r13)
            android.content.pm.PackageManager r11 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009b }
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r8 = r11.getActivityInfo(r8, r12)     // Catch:{ NameNotFoundException -> 0x009b }
            if (r8 != 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            android.os.Bundle r8 = r8.metaData
            goto L_0x009c
        L_0x009b:
            r8 = r1
        L_0x009c:
            if (r8 != 0) goto L_0x009f
            goto L_0x00cd
        L_0x009f:
            java.lang.String r11 = "org.chromium.webapk.shell_apk.shareMethod"
            java.lang.String r11 = r8.getString(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x00ad
            r11 = 0
            goto L_0x00b9
        L_0x00ad:
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r11 = r11.toUpperCase(r12)
            java.lang.String r12 = "POST"
            boolean r11 = r12.equals(r11)
        L_0x00b9:
            java.lang.String r12 = "org.chromium.webapk.shell_apk.shareAction"
            if (r11 == 0) goto L_0x00c3
            java.lang.String r8 = r8.getString(r12)
            goto L_0x0161
        L_0x00c3:
            java.lang.String r11 = r8.getString(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x00d0
        L_0x00cd:
            r8 = r1
            goto L_0x0161
        L_0x00d0:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.util.Pair r14 = new android.util.Pair
            java.lang.String r15 = "org.chromium.webapk.shell_apk.shareParamTitle"
            java.lang.String r15 = r8.getString(r15)
            java.lang.String r4 = "android.intent.extra.SUBJECT"
            java.lang.String r4 = r5.getStringExtra(r4)
            r14.<init>(r15, r4)
            r12.add(r14)
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r14 = "org.chromium.webapk.shell_apk.shareParamText"
            java.lang.String r8 = r8.getString(r14)
            java.lang.String r14 = "android.intent.extra.TEXT"
            java.lang.String r14 = r5.getStringExtra(r14)
            r4.<init>(r8, r14)
            r12.add(r4)
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.util.Iterator r8 = r12.iterator()
        L_0x0106:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0132
            java.lang.Object r12 = r8.next()
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r14 = r12.first
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0106
            java.lang.Object r14 = r12.second
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0106
            java.lang.Object r14 = r12.first
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.second
            java.lang.String r12 = (java.lang.String) r12
            r4.appendQueryParameter(r14, r12)
            goto L_0x0106
        L_0x0132:
            android.net.Uri r8 = android.net.Uri.parse(r11)
            android.net.Uri$Builder r8 = r8.buildUpon()
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 == 0) goto L_0x014a
            r8 = r11
            goto L_0x0161
        L_0x014a:
            java.lang.String r11 = "%20"
            java.lang.String r12 = "+"
            java.lang.String r4 = r4.replace(r11, r12)
            java.lang.String r4 = r4.substring(r7)
            r8.encodedQuery(r4)
            android.net.Uri r4 = r8.build()
            java.lang.String r8 = r4.toString()
        L_0x0161:
            r4 = 13
            r4 = r8
            r8 = 13
            r11 = 1
            goto L_0x0191
        L_0x0168:
            java.lang.String r4 = r18.getDataString()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x018a
            java.lang.String r8 = r18.getDataString()
            r4 = 9
            java.lang.String r11 = "org.chromium.chrome.browser.webapp_source"
            int r4 = r5.getIntExtra(r11, r4)
            java.lang.String r11 = "org.chromium.chrome.browser.webapk_force_navigation"
            boolean r11 = r5.getBooleanExtra(r11, r7)
            r16 = r8
            r8 = r4
            r4 = r16
            goto L_0x0191
        L_0x018a:
            java.lang.String r8 = r0.getString(r2)
            r4 = r8
            r8 = 0
            r11 = 0
        L_0x0191:
            if (r4 != 0) goto L_0x0194
            return r1
        L_0x0194:
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r12 = "org.chromium.webapk.shell_apk.loggedIntentUrlParam"
            java.lang.String r12 = r0.getString(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 == 0) goto L_0x01a5
            goto L_0x01b9
        L_0x01a5:
            boolean r14 = r4.startsWith(r2)
            if (r14 == 0) goto L_0x01bb
            android.net.Uri r14 = android.net.Uri.parse(r4)
            java.lang.String r14 = r14.getQueryParameter(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01bb
        L_0x01b9:
            r12 = r4
            goto L_0x01cb
        L_0x01bb:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            r2.appendQueryParameter(r12, r4)
            java.lang.String r2 = r2.toString()
            r12 = r2
        L_0x01cb:
            if (r12 == 0) goto L_0x01df
            java.lang.String r2 = "http:"
            boolean r2 = r12.startsWith(r2)
            if (r2 != 0) goto L_0x01dd
            java.lang.String r2 = "https:"
            boolean r2 = r12.startsWith(r2)
            if (r2 == 0) goto L_0x01df
        L_0x01dd:
            r4 = 1
            goto L_0x01e0
        L_0x01df:
            r4 = 0
        L_0x01e0:
            if (r4 != 0) goto L_0x01e3
            return r1
        L_0x01e3:
            java.lang.String r1 = "org.chromium.webapk.shell_apk.isNewStyleWebApk"
            boolean r1 = r0.getBoolean(r1)
            l r14 = new l
            r0 = r14
            r2 = r19
            r4 = r20
            r5 = r18
            r6 = r12
            r7 = r8
            r8 = r11
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0027l.m23a(android.content.Context, android.content.Intent, java.lang.String, boolean, long, long):l");
    }
}
