package p000;

/* renamed from: y */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0040y {

    /* renamed from: a */
    public final Runnable f71a;

    /* renamed from: b */
    public boolean f72b;

    /* renamed from: c */
    public boolean f73c;

    /* renamed from: d */
    public boolean f74d;

    /* renamed from: e */
    public boolean f75e;

    public C0040y(Runnable runnable) {
        this.f71a = runnable;
    }

    /* renamed from: a */
    public final void mo46a() {
        if (this.f74d && this.f72b && this.f73c && !this.f75e) {
            this.f75e = true;
            this.f71a.run();
        }
    }
}
