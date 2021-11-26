package p000;

import android.app.Activity;
import java.lang.reflect.Proxy;

/* renamed from: L */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0011L {
    /* renamed from: a */
    public static void m6a(Activity activity, C0009J j) {
        Class<?> cls = Class.forName("android.window.SplashScreen$OnExitAnimationListener");
        Object newProxyInstance = Proxy.newProxyInstance(activity.getClassLoader(), new Class[]{cls}, new C0010K(j));
        Object invoke = activity.getClass().getMethod("getSplashScreen", new Class[0]).invoke(activity, new Object[0]);
        invoke.getClass().getMethod("setOnExitAnimationListener", new Class[]{cls}).invoke(invoke, new Object[]{newProxyInstance});
    }
}
