package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: I */
/* compiled from: chromium-WebApk.apk-default-1 */
public abstract class C0008I {
    /* renamed from: a */
    public static C0007H m1a(int i, int i2, int i3) {
        float min = Math.min(1.0f, ((float) i3) / ((float) ((i * 4) * i2)));
        int round = Math.round(((float) i) * min);
        int round2 = Math.round(((float) i2) * min);
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(matrix);
        return new C0007H(createBitmap, canvas, (C0006G) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View m2b(android.content.Context r11) {
        /*
            android.content.res.Resources r0 = r11.getResources()
            r1 = 0
            r2 = 2130968583(0x7f040007, float:1.7545824E38)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2, r1)     // Catch:{ NotFoundException -> 0x0015 }
            if (r2 == 0) goto L_0x0015
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2     // Catch:{ NotFoundException -> 0x0015 }
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch:{ NotFoundException -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r3 = 2130837504(0x7f020000, float:1.7279964E38)
            int r3 = p000.C0015P.m10b(r0, r3)
            r4 = 0
            r5 = 2130771968(0x7f010000, float:1.7147041E38)
            boolean r4 = r0.getBoolean(r5)     // Catch:{ NotFoundException -> 0x0023 }
        L_0x0023:
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r11)
            r6 = 2131230726(0x7f080006, float:1.8077513E38)
            java.lang.String r0 = r0.getString(r6)
            boolean r6 = p000.C0015P.m16h(r3)
            android.content.res.Resources r7 = r11.getResources()
            r8 = 2131099652(0x7f060004, float:1.7811663E38)
            if (r2 == 0) goto L_0x0059
            android.util.DisplayMetrics r9 = r7.getDisplayMetrics()
            int r10 = r2.getScaledWidth(r9)
            int r9 = r2.getScaledHeight(r9)
            int r9 = java.lang.Math.min(r10, r9)
            r10 = 2130903049(0x7f030009, float:1.7412905E38)
            int r7 = r7.getDimensionPixelSize(r10)
            if (r9 >= r7) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r8 = 2131099651(0x7f060003, float:1.7811661E38)
        L_0x0059:
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r11)
            r9 = 1
            android.view.View r7 = r7.inflate(r8, r5, r9)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r8 = 2131034119(0x7f050007, float:1.7678747E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r0)
            if (r6 == 0) goto L_0x008b
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r6 < r9) goto L_0x0084
            int r11 = r11.getColor(r0, r1)
            goto L_0x0088
        L_0x0084:
            int r11 = r11.getColor(r0)
        L_0x0088:
            r8.setTextColor(r11)
        L_0x008b:
            r11 = 2131034117(0x7f050005, float:1.7678742E38)
            android.view.View r11 = r7.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 != 0) goto L_0x0097
            goto L_0x00aa
        L_0x0097:
            if (r4 == 0) goto L_0x00a7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x00a7
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r2)
            r11.setImageIcon(r0)
            goto L_0x00aa
        L_0x00a7:
            r11.setImageBitmap(r2)
        L_0x00aa:
            r5.setBackgroundColor(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0008I.m2b(android.content.Context):android.view.View");
    }

    /* renamed from: c */
    public static Bitmap m3c(View view, int i) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        C0007H a = m1a(width, height, i);
        view.draw(a.f8b);
        return a.f7a;
    }

    /* renamed from: d */
    public static Bitmap.CompressFormat m4d(int i, int i2) {
        if (i * i2 <= 1048576) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }
}
