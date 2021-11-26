package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;

/* renamed from: q */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0032q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0035t f59a;

    /* renamed from: b */
    public final /* synthetic */ C0037v f60b;

    /* renamed from: c */
    public final /* synthetic */ String f61c;

    public C0032q(C0035t tVar, C0037v vVar, String str) {
        this.f59a = tVar;
        this.f60b = vVar;
        this.f61c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f59a.f64a = true;
        C0037v vVar = this.f60b;
        String str = this.f61c;
        C0039x xVar = vVar.f68b;
        Objects.requireNonNull(xVar);
        try {
            Activity activity = xVar.f70b;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            intent.addFlags(268435456);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
        C0028m.m28e(vVar.f68b.f69a, str);
        vVar.f67a.mo2a((String) null, true);
    }
}
