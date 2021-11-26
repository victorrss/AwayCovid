package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: N */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0013N extends C0030o {

    /* renamed from: a */
    public final int f15a;

    /* renamed from: b */
    public IBinder f16b;

    /* renamed from: c */
    public Context f17c;

    public C0013N(Context context, IBinder iBinder, int i) {
        this.f17c = context;
        this.f16b = iBinder;
        this.f15a = i;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = this.f16b;
        int i3 = -1;
        if (iBinder != null) {
            try {
                Field declaredField = iBinder.getClass().getSuperclass().getDeclaredField("TRANSACTION_notifyNotification");
                declaredField.setAccessible(true);
                i3 = ((Integer) declaredField.get((Object) null)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == i3) {
            int callingUid = Binder.getCallingUid();
            if (this.f15a == callingUid) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            throw new RemoteException("Unauthorized caller " + callingUid + " does not match expected host=" + this.f15a);
        }
        IBinder iBinder2 = this.f16b;
        if (iBinder2 == null) {
            return false;
        }
        try {
            Class<?> cls = iBinder2.getClass();
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("onTransact", new Class[]{cls2, Parcel.class, Parcel.class, cls2});
            method.setAccessible(true);
            return ((Boolean) method.invoke(this.f16b, new Object[]{Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)})).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
