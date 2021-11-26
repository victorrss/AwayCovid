package p000;

import android.content.DialogInterface;

/* renamed from: s */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0034s implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C0035t f62a;

    /* renamed from: b */
    public final /* synthetic */ C0037v f63b;

    public C0034s(C0035t tVar, C0037v vVar) {
        this.f62a = tVar;
        this.f63b = vVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f62a.f64a) {
            this.f63b.f67a.mo2a((String) null, true);
        }
    }
}
