package p000;

import android.content.DialogInterface;

/* renamed from: c */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0018c implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C0022g f22a;

    /* renamed from: b */
    public final /* synthetic */ C0036u f23b;

    public C0018c(C0022g gVar, C0036u uVar) {
        this.f22a = gVar;
        this.f23b = uVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f22a.f30a) {
            this.f23b.f65a.mo2a((String) null, true);
        }
    }
}
