package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* renamed from: x */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0039x {

    /* renamed from: a */
    public Context f69a;

    /* renamed from: b */
    public Activity f70b;

    public C0039x(Activity activity) {
        this.f70b = activity;
        this.f69a = activity.getApplicationContext();
    }

    /* renamed from: a */
    public void mo45a(C0038w wVar) {
        boolean z;
        C0038w wVar2 = wVar;
        Bundle g = C0015P.m15g(this.f69a);
        if (g == null) {
            wVar2.mo2a((String) null, false);
            return;
        }
        this.f69a.getPackageName();
        String a = C0028m.m24a(this.f69a);
        if (!TextUtils.isEmpty(a)) {
            wVar2.mo2a(a, false);
            return;
        }
        HashMap hashMap = (HashMap) C0015P.m11c(this.f69a.getPackageManager());
        if (!hashMap.isEmpty()) {
            C0036u uVar = new C0036u(this, wVar2);
            Activity activity = this.f70b;
            String string = this.f69a.getString(R.string.name);
            PackageManager packageManager = activity.getPackageManager();
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C0028m.m25b((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                ResolveInfo resolveInfo = (ResolveInfo) entry.getValue();
                arrayList.add(new C0021f(str, resolveInfo.loadLabel(packageManager), resolveInfo.loadIcon(packageManager), !z || C0028m.m25b(str)));
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, new C0019d());
            }
            TextView textView = new TextView(activity);
            textView.setText(activity.getString(R.string.choose_host_browser_dialog_title, new Object[]{string}));
            View inflate = LayoutInflater.from(activity).inflate(R.layout.choose_host_browser_dialog, (ViewGroup) null);
            C0015P.m9a(activity, inflate, textView);
            ((TextView) inflate.findViewById(R.id.desc)).setText(R.string.choose_host_browser);
            ListView listView = (ListView) inflate.findViewById(R.id.browser_list);
            listView.setAdapter(new C0020e(activity, arrayList));
            C0022g gVar = new C0022g((C0016a) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(activity, 16974130));
            builder.setCustomTitle(textView).setView(inflate).setNegativeButton(R.string.choose_host_browser_dialog_quit, new C0016a());
            AlertDialog create = builder.create();
            listView.setOnItemClickListener(new C0017b(arrayList, gVar, uVar, create));
            create.setOnDismissListener(new C0018c(gVar, uVar));
            create.show();
            return;
        }
        String string2 = g.getString("org.chromium.webapk.shell_apk.runtimeHost");
        String string3 = g.getString("org.chromium.webapk.shell_apk.runtimeHostApplicationName");
        if (TextUtils.isEmpty(string2)) {
            string2 = "com.android.chrome";
            string3 = "Google Chrome";
        }
        C0037v vVar = new C0037v(this, wVar2);
        Activity activity2 = this.f70b;
        String string4 = this.f69a.getString(R.string.name);
        View inflate2 = LayoutInflater.from(activity2).inflate(R.layout.host_browser_list_item, (ViewGroup) null);
        TextView textView2 = new TextView(activity2);
        textView2.setText(activity2.getString(R.string.install_host_browser_dialog_title, new Object[]{string4}));
        C0015P.m9a(activity2, inflate2, textView2);
        ((ImageView) inflate2.findViewById(R.id.browser_icon)).setImageResource(R.drawable.last_resort_runtime_host_logo);
        TextView textView3 = (TextView) inflate2.findViewById(R.id.browser_name);
        textView3.setText(string3);
        textView3.setPaddingRelative(activity2.getResources().getDimensionPixelSize(R.dimen.list_column_padding), 0, 0, 0);
        C0035t tVar = new C0035t((C0032q) null);
        AlertDialog.Builder builder2 = new AlertDialog.Builder(new ContextThemeWrapper(activity2, 16974130));
        builder2.setCustomTitle(textView2).setView(inflate2).setNegativeButton(R.string.choose_host_browser_dialog_quit, new C0033r()).setPositiveButton(R.string.install_host_browser_dialog_install_button, new C0032q(tVar, vVar, string2));
        AlertDialog create2 = builder2.create();
        create2.setOnDismissListener(new C0034s(tVar, vVar));
        create2.show();
    }
}
