package p000;

import android.view.View;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: K */
/* compiled from: chromium-WebApk.apk-default-1 */
public final /* synthetic */ class C0010K implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ C0009J f12a;

    public /* synthetic */ C0010K(C0009J j) {
        this.f12a = j;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C0009J j = this.f12a;
        if (!method.getName().equals("onSplashScreenExit")) {
            return null;
        }
        try {
            View view = objArr[0];
            j.mo7a(view, (View) view.getClass().getMethod("getIconView", new Class[0]).invoke(view, new Object[0]));
            return null;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
