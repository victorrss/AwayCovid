package p000;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* renamed from: b */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0017b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f18a;

    /* renamed from: b */
    public final /* synthetic */ C0022g f19b;

    /* renamed from: c */
    public final /* synthetic */ C0036u f20c;

    /* renamed from: d */
    public final /* synthetic */ AlertDialog f21d;

    public C0017b(List list, C0022g gVar, C0036u uVar, AlertDialog alertDialog) {
        this.f18a = list;
        this.f19b = gVar;
        this.f20c = uVar;
        this.f21d = alertDialog;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0021f fVar = (C0021f) this.f18a.get(i);
        if (fVar.f29d) {
            this.f19b.f30a = true;
            C0036u uVar = this.f20c;
            String str = fVar.f26a;
            C0028m.m28e(uVar.f66b.f69a, str);
            uVar.f65a.mo2a(str, true);
            this.f21d.cancel();
        }
    }
}
