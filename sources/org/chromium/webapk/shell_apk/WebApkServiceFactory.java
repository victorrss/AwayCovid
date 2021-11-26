package org.chromium.webapk.shell_apk;

import android.app.Service;

/* compiled from: chromium-WebApk.apk-default-1 */
public class WebApkServiceFactory extends Service {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if ((p000.C0025j.m20a(r0) == getSharedPreferences("org.chromium.webapk.shell_apk", 0).getInt("org.chromium.webapk.shell_apk.version_code", -1)) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        if (r8 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019f A[SYNTHETIC, Splitter:B:110:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0 A[SYNTHETIC, Splitter:B:43:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012f A[SYNTHETIC, Splitter:B:87:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0136 A[SYNTHETIC, Splitter:B:91:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder onBind(android.content.Intent r17) {
        /*
            r16 = this;
            r1 = r16
            java.util.Set r0 = p000.C0028m.f43a
            android.content.pm.PackageManager r0 = r16.getPackageManager()
            java.lang.String r2 = p000.C0028m.f44b
            boolean r2 = p000.C0015P.m14f(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.String r0 = p000.C0028m.f44b
        L_0x0013:
            r2 = r0
            goto L_0x0023
        L_0x0015:
            java.lang.String r2 = p000.C0028m.m26c(r16)
            boolean r0 = p000.C0015P.m14f(r0, r2)
            if (r0 != 0) goto L_0x0021
            r0 = r3
            goto L_0x0013
        L_0x0021:
            r0 = r2
            goto L_0x0013
        L_0x0023:
            boolean r0 = p000.C0028m.m25b(r2)
            java.lang.String r4 = "cr_WebApkServiceFactory"
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "Host browser does not support WebAPKs."
            android.util.Log.w(r4, r0)
            return r3
        L_0x0031:
            r5 = 0
            android.content.Context r0 = r16.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x003b }
            android.content.Context r0 = r0.createPackageContext(r2, r5)     // Catch:{ NameNotFoundException -> 0x003b }
            goto L_0x0040
        L_0x003b:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r3
        L_0x0040:
            java.lang.String r6 = "cr_HostBrowserClassLoader"
            java.lang.String r7 = "org.chromium.webapk.lib.runtime_library.WebApkServiceImpl"
            r9 = -1
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "Failed to get remote context."
            android.util.Log.w(r6, r0)
            r12 = r3
            goto L_0x0196
        L_0x004f:
            java.lang.ClassLoader r10 = p000.C0025j.f31a
            java.lang.String r11 = "org.chromium.webapk.shell_apk.version_code"
            java.lang.String r12 = "org.chromium.webapk.shell_apk"
            if (r10 == 0) goto L_0x006a
            android.content.SharedPreferences r10 = r1.getSharedPreferences(r12, r5)
            int r10 = r10.getInt(r11, r9)
            int r13 = p000.C0025j.m20a(r0)
            if (r13 != r10) goto L_0x0067
            r10 = 1
            goto L_0x0068
        L_0x0067:
            r10 = 0
        L_0x0068:
            if (r10 != 0) goto L_0x0193
        L_0x006a:
            android.content.SharedPreferences r10 = r1.getSharedPreferences(r12, r5)
            java.lang.String r12 = "org.chromium.webapk.shell_apk.dex_version"
            int r13 = r10.getInt(r12, r9)
            int r14 = p000.C0025j.m20a(r0)
            int r15 = r10.getInt(r11, r9)
            if (r15 != r14) goto L_0x0080
            r3 = -1
            goto L_0x00b8
        L_0x0080:
            java.lang.String r15 = "webapk_dex_version.txt"
            java.util.Scanner r8 = new java.util.Scanner     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
            android.content.res.AssetManager r3 = r0.getAssets()     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
            java.io.InputStream r3 = r3.open(r15)     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
            r8.<init>(r3)     // Catch:{ Exception -> 0x00a4, all -> 0x009c }
            int r3 = r8.nextInt()     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
            r8.close()     // Catch:{ Exception -> 0x0097, all -> 0x0099 }
            goto L_0x00a8
        L_0x0097:
            goto L_0x00a6
        L_0x0099:
            r0 = move-exception
            r3 = r8
            goto L_0x009e
        L_0x009c:
            r0 = move-exception
            r3 = 0
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            r3.close()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            throw r0
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            r3 = -1
        L_0x00a6:
            if (r8 == 0) goto L_0x00ab
        L_0x00a8:
            r8.close()     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            android.content.SharedPreferences$Editor r8 = r10.edit()
            r8.putInt(r11, r14)
            r8.putInt(r12, r3)
            r8.apply()
        L_0x00b8:
            if (r3 != r9) goto L_0x00bb
            r3 = r13
        L_0x00bb:
            java.lang.String r8 = "dex"
            java.io.File r8 = r1.getDir(r8, r5)
            if (r3 == r13) goto L_0x00cb
            java.lang.String r10 = "Delete cached dex files."
            android.util.Log.w(r6, r10)
            p000.C0023h.m17a(r8)
        L_0x00cb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "webapk"
            r6.append(r10)
            r6.append(r3)
            java.lang.String r3 = ".dex"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r8, r3)
            boolean r10 = r6.exists()
            java.lang.String r11 = "cr.DexLoader"
            if (r10 == 0) goto L_0x00f8
            long r12 = r6.length()
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x0142
        L_0x00f8:
            boolean r10 = r8.exists()
            if (r10 != 0) goto L_0x0106
            boolean r10 = r8.mkdirs()
            if (r10 != 0) goto L_0x0106
            goto L_0x0190
        L_0x0106:
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x012b }
            java.io.InputStream r0 = r0.open(r3)     // Catch:{ IOException -> 0x012b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x012c }
            r3.<init>(r6)     // Catch:{ IOException -> 0x012c }
            r10 = 16384(0x4000, float:2.2959E-41)
            byte[] r12 = new byte[r10]     // Catch:{ IOException -> 0x0129 }
        L_0x0117:
            int r13 = r0.read(r12, r5, r10)     // Catch:{ IOException -> 0x0129 }
            if (r13 == r9) goto L_0x0121
            r3.write(r12, r5, r13)     // Catch:{ IOException -> 0x0129 }
            goto L_0x0117
        L_0x0121:
            r0.close()     // Catch:{ IOException -> 0x0129 }
            r3.close()     // Catch:{ IOException -> 0x0129 }
            r0 = 1
            goto L_0x013a
        L_0x0129:
            goto L_0x012d
        L_0x012b:
            r0 = 0
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r0 == 0) goto L_0x0134
            r0.close()     // Catch:{ IOException -> 0x0133 }
            goto L_0x0134
        L_0x0133:
        L_0x0134:
            if (r3 == 0) goto L_0x0139
            r3.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "Could not extract dex from assets"
            android.util.Log.w(r11, r0)
            goto L_0x0190
        L_0x0142:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "optimized"
            r3.<init>(r8, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0156
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L_0x0156
            goto L_0x0190
        L_0x0156:
            dalvik.system.BaseDexClassLoader r0 = new dalvik.system.BaseDexClassLoader     // Catch:{ Exception -> 0x0168 }
            java.lang.String r8 = r6.getPath()     // Catch:{ Exception -> 0x0168 }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0168 }
            r12 = 0
            r0.<init>(r8, r3, r12, r10)     // Catch:{ Exception -> 0x0168 }
            r0.loadClass(r7)     // Catch:{ Exception -> 0x0168 }
            goto L_0x0191
        L_0x0168:
            r0 = move-exception
            java.lang.String r3 = r3.getPath()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Could not load dex from "
            r8.append(r10)
            java.lang.String r6 = r6.getPath()
            r8.append(r6)
            java.lang.String r6 = " with optimized directory "
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.w(r11, r3)
            r0.printStackTrace()
        L_0x0190:
            r0 = 0
        L_0x0191:
            p000.C0025j.f31a = r0
        L_0x0193:
            java.lang.ClassLoader r0 = p000.C0025j.f31a
            r12 = r0
        L_0x0196:
            if (r12 != 0) goto L_0x019f
            java.lang.String r0 = "Unable to create ClassLoader."
            android.util.Log.w(r4, r0)
        L_0x019d:
            r2 = 0
            return r2
        L_0x019f:
            java.lang.Class r0 = r12.loadClass(r7)     // Catch:{ Exception -> 0x01ec }
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01ec }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r5] = r7     // Catch:{ Exception -> 0x01ec }
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r8 = 1
            r6[r8] = r7     // Catch:{ Exception -> 0x01ec }
            java.lang.reflect.Constructor r6 = r0.getConstructor(r6)     // Catch:{ Exception -> 0x01ec }
            if (r2 != 0) goto L_0x01b6
            goto L_0x01c7
        L_0x01b6:
            android.content.pm.PackageManager r0 = r16.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01c3 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r7)     // Catch:{ NameNotFoundException -> 0x01c3 }
            int r9 = r0.uid     // Catch:{ NameNotFoundException -> 0x01c3 }
            goto L_0x01c7
        L_0x01c3:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x01ec }
        L_0x01c7:
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x01ec }
            r0.<init>()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r2 = "small_icon_id"
            r7 = 2130968578(0x7f040002, float:1.7545814E38)
            r0.putInt(r2, r7)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r2 = "host_browser_uid"
            r0.putInt(r2, r9)     // Catch:{ Exception -> 0x01ec }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01ec }
            r2[r5] = r1     // Catch:{ Exception -> 0x01ec }
            r3 = 1
            r2[r3] = r0     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r0 = r6.newInstance(r2)     // Catch:{ Exception -> 0x01ec }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x01ec }
            N r2 = new N     // Catch:{ Exception -> 0x01ec }
            r2.<init>(r1, r0, r9)     // Catch:{ Exception -> 0x01ec }
            return r2
        L_0x01ec:
            r0 = move-exception
            java.lang.String r2 = "Unable to create WebApkServiceImpl."
            android.util.Log.w(r4, r2)
            r0.printStackTrace()
            goto L_0x019d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.webapk.shell_apk.WebApkServiceFactory.onBind(android.content.Intent):android.os.IBinder");
    }
}
