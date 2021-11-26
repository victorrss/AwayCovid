package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* renamed from: P */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0015P {
    /* renamed from: a */
    public static void m9a(Context context, View view, TextView textView) {
        Resources resources = context.getResources();
        textView.setTextColor(m10b(resources, R.color.webapk_black_alpha_87));
        textView.setTextSize(0, resources.getDimension(R.dimen.headline_size_medium));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dialog_content_padding);
        textView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.title_bottom_padding));
        view.setPaddingRelative(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.dialog_content_top_padding), dimensionPixelSize, dimensionPixelSize);
    }

    /* renamed from: b */
    public static int m10b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, (Resources.Theme) null);
        }
        return resources.getColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r2 = r1.activityInfo;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m11c(android.content.pm.PackageManager r3) {
        /*
            android.content.Intent r0 = m12d()
            r1 = 131072(0x20000, float:1.83671E-40)
            java.util.List r1 = r3.queryIntentActivities(r0, r1)
            r2 = 65536(0x10000, float:9.18355E-41)
            java.util.List r3 = r3.queryIntentActivities(r0, r2)
            r1.addAll(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            if (r1 == 0) goto L_0x0031
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = r2.packageName
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            r3.put(r2, r1)
            goto L_0x001c
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0015P.m11c(android.content.pm.PackageManager):java.util.Map");
    }

    /* renamed from: d */
    public static Intent m12d() {
        return new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http://"));
    }

    /* renamed from: e */
    public static void m13e(Context context, C0027l lVar) {
        if (lVar.f42k != null) {
            Intent intent = lVar.f36e;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = new ArrayList();
                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    parcelableArrayListExtra.add(uri);
                }
            }
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(lVar.f33b, (Uri) it.next(), 1);
            }
        }
    }

    /* renamed from: f */
    public static boolean m14f(PackageManager packageManager, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static Bundle m15g(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m16h(int i) {
        float f;
        float f2;
        float f3;
        float red = ((float) Color.red(i)) / 255.0f;
        float green = ((float) Color.green(i)) / 255.0f;
        float blue = ((float) Color.blue(i)) / 255.0f;
        if (red < 0.03928f) {
            f = red / 12.92f;
        } else {
            f = (float) Math.pow((double) ((red + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        if (green < 0.03928f) {
            f2 = green / 12.92f;
        } else {
            f2 = (float) Math.pow((double) ((green + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        if (blue < 0.03928f) {
            f3 = blue / 12.92f;
        } else {
            f3 = (float) Math.pow((double) ((blue + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return Math.abs(1.05f / (((f3 * 0.0722f) + ((f2 * 0.7152f) + (f * 0.2126f))) + 0.05f)) >= 3.0f;
    }
}
