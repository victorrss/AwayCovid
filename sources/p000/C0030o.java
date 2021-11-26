package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.lang.reflect.Method;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* renamed from: o */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0030o extends Binder implements IInterface {
    public C0030o() {
        attachInterface(this, "org.chromium.webapk.lib.runtime_library.IWebApkApi");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            Log.w("cr_WebApkService", "Should NOT reach WebApkServiceImplWrapper#getSmallIconId().");
            parcel2.writeNoException();
            parcel2.writeInt(-1);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            Notification notification = parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null;
            C0013N n = (C0013N) this;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                if (i3 >= 26) {
                    ((NotificationManager) n.f17c.getSystemService("notification")).createNotificationChannel(new NotificationChannel("default_channel_id", n.f17c.getString(R.string.notification_channel_name), 3));
                }
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(n.f17c, notification);
                recoverBuilder.setChannelId("default_channel_id");
                notification = recoverBuilder.build();
            }
            IBinder iBinder = n.f16b;
            if (iBinder != null) {
                try {
                    Method method = iBinder.getClass().getMethod("notifyNotification", new Class[]{String.class, Integer.TYPE, Notification.class});
                    method.setAccessible(true);
                    method.invoke(n.f16b, new Object[]{readString, Integer.valueOf(readInt), notification});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            parcel.readString();
            parcel.readInt();
            Log.w("cr_WebApkService", "Should NOT reach WebApkServiceImplWrapper#cancelNotification(String, int).");
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            Log.w("cr_WebApkService", "Should NOT reach WebApkServiceImplWrapper#notificationPermissionEnabled().");
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        } else if (i == 5) {
            parcel.enforceInterface("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            parcel.readString();
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Notification notification2 = (Notification) Notification.CREATOR.createFromParcel(parcel);
            }
            parcel.readString();
            Log.w("cr_WebApkService", "Should NOT reach WebApkServiceImplWrapper#notifyNotificationWithChannel(String, int, Notification, String)");
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("org.chromium.webapk.lib.runtime_library.IWebApkApi");
            return true;
        }
    }
}
