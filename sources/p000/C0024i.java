package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: i */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0024i {
    /* renamed from: a */
    public static void m18a(Context context, ComponentName componentName, ComponentName componentName2) {
        context.getSharedPreferences("org.chromium.webapk.shell_apk", 0).edit().commit();
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        packageManager.setComponentEnabledSetting(componentName2, 2, 0);
    }

    /* renamed from: b */
    public static void m19b(Context context, Intent intent, String str, long j, ComponentName componentName) {
        Intent intent2 = new Intent("android.intent.action.VIEW", intent.getData());
        intent2.setComponent(componentName);
        intent2.setFlags(268435456);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (str != null) {
            intent2.putExtra("org.chromium.webapk.selected_share_target_activity_class_name", str);
        }
        if (j != -1) {
            intent2.putExtra("org.chromium.chrome.browser.webapk_launch_time", j);
        }
        context.startActivity(intent2);
    }
}
