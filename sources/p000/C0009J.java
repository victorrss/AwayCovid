package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Paint;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import org.chromium.webapk.a62461adf62f597a7_v2.R;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

/* renamed from: J */
/* compiled from: chromium-WebApk.apk-default-1 */
public final /* synthetic */ class C0009J {

    /* renamed from: a */
    public final /* synthetic */ Window f9a;

    /* renamed from: b */
    public final /* synthetic */ Activity f10b;

    /* renamed from: c */
    public final /* synthetic */ C0041z f11c;

    public /* synthetic */ C0009J(Window window, Activity activity, C0041z zVar) {
        this.f9a = window;
        this.f10b = activity;
        this.f11c = zVar;
    }

    /* renamed from: a */
    public final void mo7a(View view, View view2) {
        Window window = this.f9a;
        Activity activity = this.f10b;
        C0041z zVar = this.f11c;
        Insets insets = window.getDecorView().getRootWindowInsets().getInsets(WindowInsets.Type.systemBars());
        int b = C0015P.m10b(activity.getResources(), R.color.background_color_non_empty);
        int width = (view.getWidth() - insets.right) - insets.left;
        int height = (view.getHeight() - insets.top) - insets.bottom;
        C0007H a = C0008I.m1a(width, height, 12582912);
        Paint paint = new Paint();
        paint.setColor(b);
        a.f8b.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        a.f8b.translate((float) (iArr[0] - insets.left), (float) (iArr[1] - insets.top));
        view2.draw(a.f8b);
        Bitmap bitmap = a.f7a;
        SplashActivity splashActivity = zVar.f76a;
        splashActivity.f50b = view;
        splashActivity.f51c = bitmap;
        C0040y yVar = splashActivity.f54f;
        yVar.f72b = true;
        yVar.mo46a();
    }
}
