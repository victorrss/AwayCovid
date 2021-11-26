package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: m */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0028m {

    /* renamed from: a */
    public static Set f43a = new HashSet(Arrays.asList(new String[]{"com.google.android.apps.chrome", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "org.chromium.chrome", "org.chromium.chrome.tests", "org.chromium.arc.intent_helper", "org.chromium.arc.webapk"}));

    /* renamed from: b */
    public static String f44b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (p000.C0015P.m14f(r1, r2) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r2 = r2.activityInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (r1.containsKey(r2) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24a(android.content.Context r11) {
        /*
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r1 = f44b
            boolean r0 = p000.C0015P.m14f(r0, r1)
            if (r0 == 0) goto L_0x000f
            java.lang.String r11 = f44b
            return r11
        L_0x000f:
            java.lang.String r0 = m26c(r11)
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r2 = m26c(r11)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L_0x002a
            boolean r3 = p000.C0015P.m14f(r1, r2)
            if (r3 == 0) goto L_0x002a
            goto L_0x00bd
        L_0x002a:
            android.os.Bundle r2 = p000.C0015P.m15g(r11)
            r3 = 0
            if (r2 != 0) goto L_0x0033
            r2 = r3
            goto L_0x0039
        L_0x0033:
            java.lang.String r5 = "org.chromium.webapk.shell_apk.runtimeHost"
            java.lang.String r2 = r2.getString(r5)
        L_0x0039:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x004a
            boolean r1 = p000.C0015P.m14f(r1, r2)
            if (r1 == 0) goto L_0x0047
            goto L_0x00bd
        L_0x0047:
            r2 = r3
            goto L_0x00bd
        L_0x004a:
            android.content.Intent r2 = p000.C0015P.m12d()
            r5 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r1.resolveActivity(r2, r5)
            if (r2 == 0) goto L_0x005d
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = r2.packageName
            goto L_0x005e
        L_0x005d:
            r2 = r3
        L_0x005e:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x0071
            boolean r5 = m25b(r2)
            if (r5 == 0) goto L_0x0071
            boolean r5 = p000.C0015P.m14f(r1, r2)
            if (r5 == 0) goto L_0x0071
            goto L_0x00bd
        L_0x0071:
            java.util.Map r1 = p000.C0015P.m11c(r1)
            java.util.HashMap r1 = (java.util.HashMap) r1
            int r5 = r1.size()
            r6 = 1
            if (r5 != r6) goto L_0x008e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00bd
        L_0x008e:
            java.util.Set r5 = r1.keySet()
            java.util.Iterator r5 = r5.iterator()
            r7 = r3
            r8 = 0
        L_0x0098:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00b1
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            if (r8 <= r6) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            boolean r10 = m25b(r9)
            if (r10 == 0) goto L_0x0098
            int r8 = r8 + 1
            r7 = r9
            goto L_0x0098
        L_0x00b1:
            if (r8 != r6) goto L_0x00b5
            r2 = r7
            goto L_0x00bd
        L_0x00b5:
            if (r8 != 0) goto L_0x0047
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0047
        L_0x00bd:
            f44b = r2
            boolean r1 = android.text.TextUtils.equals(r2, r0)
            if (r1 != 0) goto L_0x00f7
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "org.chromium.webapk.shell_apk"
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r0.apply()
            java.io.File r0 = r11.getCacheDir()
            p000.C0023h.m17a(r0)
            java.io.File r0 = r11.getFilesDir()
            p000.C0023h.m17a(r0)
            java.lang.String r0 = "dex"
            java.io.File r0 = r11.getDir(r0, r4)
            p000.C0023h.m17a(r0)
        L_0x00f2:
            java.lang.String r0 = f44b
            m28e(r11, r0)
        L_0x00f7:
            java.lang.String r11 = f44b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0028m.m24a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m25b(String str) {
        return ((HashSet) f43a).contains(str);
    }

    /* renamed from: c */
    public static String m26c(Context context) {
        return context.getSharedPreferences("org.chromium.webapk.shell_apk", 0).getString("runtime_host", (String) null);
    }

    /* renamed from: d */
    public static boolean m27d(C0027l lVar) {
        return lVar.f32a && !lVar.f33b.equals("org.chromium.arc.intent_helper") && !lVar.f33b.equals("org.chromium.arc.webapk") && lVar.f34c >= 78 && Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: e */
    public static void m28e(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            SharedPreferences.Editor edit = context.getSharedPreferences("org.chromium.webapk.shell_apk", 0).edit();
            edit.putString("runtime_host", str);
            edit.apply();
        }
    }
}
