package org.chromium.webapk.shell_apk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.util.Collections;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* compiled from: chromium-WebApk.apk-default-1 */
public class ManageDataLauncherActivity extends Activity {

    /* renamed from: a */
    public String f46a;

    /* renamed from: b */
    public Uri f47b;

    /* renamed from: b */
    public static boolean m29b(Context context, String str) {
        Bundle g = C0015P.m15g(context);
        if (g == null || !g.getBoolean("org.chromium.webapk.shell_apk.enableSiteSettingsShortcut", false)) {
            return false;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.addCategory("androidx.browser.trusted.category.LaunchWebApkSiteSettings");
        intent.setPackage(str);
        if (context.getPackageManager().queryIntentServices(intent, 64).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m30c(Context context, C0027l lVar) {
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (!m29b(context, lVar.f33b)) {
                shortcutManager.removeDynamicShortcuts(Collections.singletonList("android.support.customtabs.action.SITE_SETTINGS_SHORTCUT"));
                return;
            }
            String str = lVar.f37f;
            String str2 = lVar.f33b;
            Intent intent = new Intent(context, ManageDataLauncherActivity.class);
            intent.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
            intent.putExtra("SITE_SETTINGS_URL", str);
            intent.putExtra("PROVIDER_PACKAGE", str2);
            shortcutManager.addDynamicShortcuts(Collections.singletonList(new ShortcutInfo.Builder(context, "android.support.customtabs.action.SITE_SETTINGS_SHORTCUT").setShortLabel(context.getString(R.string.site_settings_short_label)).setLongLabel(context.getString(R.string.site_settings_long_label)).setIcon(Icon.createWithResource(context, R.drawable.ic_site_settings)).setIntent(intent).build()));
        }
    }

    /* renamed from: a */
    public final void mo20a() {
        String str;
        try {
            str = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.f46a, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            str = this.f46a;
        }
        Toast.makeText(this, getString(R.string.no_support_for_launch_settings, new Object[]{str}), 1).show();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46a = getIntent().getStringExtra("PROVIDER_PACKAGE");
        this.f47b = Uri.parse(getIntent().getStringExtra("SITE_SETTINGS_URL"));
        if (!m29b(this, this.f46a)) {
            mo20a();
            return;
        }
        ProgressBar progressBar = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(progressBar);
        setContentView(frameLayout);
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
        intent.setPackage(this.f46a);
        intent.setData(this.f47b);
        intent.putExtra("org.chromium.webapk.is_webapk", true);
        try {
            startActivityForResult(intent, 0);
            finish();
        } catch (ActivityNotFoundException unused) {
            mo20a();
        }
    }

    public void onStop() {
        super.onStop();
        finish();
    }
}
