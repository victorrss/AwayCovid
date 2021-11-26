package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;
import org.chromium.webapk.shell_apk.ManageDataLauncherActivity;

/* renamed from: k */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0026k {
    /* renamed from: a */
    public static void m21a(Activity activity, C0027l lVar) {
        Set set = C0028m.f43a;
        String str = lVar.f33b;
        int i = lVar.f34c;
        if (!C0028m.m25b(str) || (!TextUtils.equals(str, "org.chromium.arc.intent_helper") ? !TextUtils.equals(str, "org.chromium.arc.webapk") && i < 57 : i < 2)) {
            Context applicationContext = activity.getApplicationContext();
            ManageDataLauncherActivity.m30c(applicationContext, lVar);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(lVar.f37f));
            intent.setPackage(lVar.f33b);
            intent.setFlags(268435456);
            intent.putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true).putExtra("org.chromium.chrome.browser.webapp_source", lVar.f38g);
            try {
                applicationContext.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            m22b(activity, lVar, (Bundle) null, 268435456, false);
        }
    }

    /* renamed from: b */
    public static void m22b(Activity activity, C0027l lVar, Bundle bundle, int i, boolean z) {
        ManageDataLauncherActivity.m30c(activity.getApplicationContext(), lVar);
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.chrome.webapps.WebappManager.ACTION_START_WEBAPP");
        intent.setPackage(lVar.f33b);
        intent.setFlags(i);
        Bundle extras = lVar.f36e.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.removeExtra("org.chromium.webapk.relaunch");
        intent.putExtra("org.chromium.chrome.browser.webapp_url", lVar.f37f).putExtra("org.chromium.chrome.browser.webapp_source", lVar.f38g).putExtra("org.chromium.chrome.browser.webapk_package_name", activity.getPackageName()).putExtra("org.chromium.webapk.selected_share_target_activity_class_name", lVar.f42k).putExtra("org.chromium.chrome.browser.webapk_force_navigation", lVar.f39h);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!lVar.f35d) {
            long j = lVar.f40i;
            if (j >= 0) {
                intent.putExtra("org.chromium.chrome.browser.webapk_launch_time", j);
            }
        }
        long j2 = lVar.f41j;
        if (j2 >= 0) {
            intent.putExtra("org.chromium.webapk.new_style_splash_shown_time", j2);
        }
        if (z) {
            try {
                activity.startActivityForResult(intent, 0);
            } catch (ActivityNotFoundException e) {
                Log.w("cr_HostBrowserLauncher", "Unable to launch browser in WebAPK mode.");
                e.printStackTrace();
            }
        } else {
            activity.startActivity(intent);
        }
    }
}
