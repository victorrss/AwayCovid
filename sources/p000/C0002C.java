package p000;

import android.view.ViewTreeObserver;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

/* renamed from: C */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0002C implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ SplashActivity f3a;

    public C0002C(SplashActivity splashActivity) {
        this.f3a = splashActivity;
    }

    public void onGlobalLayout() {
        if (this.f3a.f50b.getWidth() != 0 && this.f3a.f50b.getHeight() != 0) {
            this.f3a.f50b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SplashActivity splashActivity = this.f3a;
            splashActivity.f51c = C0008I.m3c(splashActivity.f50b, 12582912);
            C0040y yVar = this.f3a.f54f;
            yVar.f72b = true;
            yVar.mo46a();
        }
    }
}
