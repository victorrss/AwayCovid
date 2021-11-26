package p000;

import android.util.Log;
import java.io.File;

/* renamed from: h */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0023h {
    /* renamed from: a */
    public static void m17a(File file) {
        File[] listFiles;
        if (file != null) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File a : listFiles) {
                    m17a(a);
                }
            }
            if (!file.delete()) {
                Log.e("cr.DexLoader", "Failed to delete : " + file.getAbsolutePath());
            }
        }
    }
}
