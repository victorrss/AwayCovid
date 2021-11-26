package p000;

import org.chromium.webapk.shell_apk.TransparentLauncherActivity;

/* renamed from: M */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0012M implements C0038w {

    /* renamed from: a */
    public final /* synthetic */ long f13a;

    /* renamed from: b */
    public final /* synthetic */ TransparentLauncherActivity f14b;

    public C0012M(TransparentLauncherActivity transparentLauncherActivity, long j) {
        this.f14b = transparentLauncherActivity;
        this.f13a = j;
    }

    /* renamed from: a */
    public void mo2a(String str, boolean z) {
        if (str == null) {
            this.f14b.finish();
            return;
        }
        TransparentLauncherActivity transparentLauncherActivity = this.f14b;
        this.f14b.mo23a(C0027l.m23a(transparentLauncherActivity, transparentLauncherActivity.getIntent(), str, z, this.f13a, -1));
        this.f14b.finish();
    }
}
