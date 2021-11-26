package p000;

import java.util.Comparator;

/* renamed from: d */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0019d implements Comparator {
    public int compare(Object obj, Object obj2) {
        C0021f fVar = (C0021f) obj;
        C0021f fVar2 = (C0021f) obj2;
        boolean z = fVar.f29d;
        if (z == fVar2.f29d) {
            return fVar.f26a.compareTo(fVar2.f26a);
        }
        return z ? -1 : 1;
    }
}
