package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: n */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0029n extends Binder implements IInterface {
    public C0029n() {
        attachInterface(this, "org.chromium.webapk.lib.common.identity_service.IIdentityService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.webapk.lib.common.identity_service.IIdentityService");
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface("org.chromium.webapk.lib.common.identity_service.IIdentityService");
            String a = C0028m.m24a(((C0031p) this).f58a.getApplicationContext());
            parcel2.writeNoException();
            parcel2.writeString(a);
            return true;
        }
    }
}
