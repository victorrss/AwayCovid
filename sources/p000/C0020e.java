package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.chromium.webapk.a62461adf62f597a7_v2.R;

/* renamed from: e */
/* compiled from: chromium-WebApk.apk-default-1 */
public class C0020e extends ArrayAdapter {

    /* renamed from: a */
    public List f24a;

    /* renamed from: b */
    public Context f25b;

    public C0020e(Context context, List list) {
        super(context, R.layout.host_browser_list_item, list);
        this.f25b = context;
        this.f24a = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f25b).inflate(R.layout.host_browser_list_item, viewGroup, false);
        }
        Resources resources = this.f25b.getResources();
        ImageView imageView = (ImageView) view.findViewById(R.id.browser_icon);
        TextView textView = (TextView) view.findViewById(R.id.browser_name);
        textView.setPaddingRelative(resources.getDimensionPixelSize(R.dimen.list_column_padding), 0, 0, 0);
        C0021f fVar = (C0021f) this.f24a.get(i);
        textView.setEnabled(fVar.f29d);
        if (fVar.f29d) {
            textView.setText(fVar.f27b);
            textView.setTextColor(C0015P.m10b(resources, R.color.webapk_black_alpha_87));
            imageView.setAlpha(1.0f);
        } else {
            SpannableString spannableString = new SpannableString(this.f25b.getString(R.string.host_browser_item_not_supporting_webapks, new Object[]{fVar.f27b}));
            spannableString.setSpan(new RelativeSizeSpan(resources.getDimension(R.dimen.webapk_text_size_medium_dense) / resources.getDimension(R.dimen.webapk_text_size_large)), fVar.f27b.length() + 1, spannableString.length(), 0);
            textView.setText(spannableString);
            textView.setSingleLine(false);
            textView.setTextColor(C0015P.m10b(resources, R.color.webapk_black_alpha_38));
            imageView.setAlpha(0.26f);
        }
        imageView.setImageDrawable(fVar.f28c);
        imageView.setEnabled(fVar.f29d);
        return view;
    }

    public boolean isEnabled(int i) {
        return ((C0021f) this.f24a.get(i)).f29d;
    }
}
