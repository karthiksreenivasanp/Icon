package k0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h extends i1.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1482b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1483c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1484d;

    public h(TextView textView) {
        super(15, null);
        this.f1482b = textView;
        this.f1484d = true;
        this.f1483c = new f(textView);
    }

    @Override // i1.e
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        if (!this.f1484d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof f) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            f fVar = this.f1483c;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == fVar) {
                return inputFilterArr;
            }
            i5++;
        }
    }

    @Override // i1.e
    public final void g(boolean z2) {
        if (z2) {
            i();
        }
    }

    @Override // i1.e
    public final void h(boolean z2) {
        this.f1484d = z2;
        i();
        TextView textView = this.f1482b;
        textView.setFilters(b(textView.getFilters()));
    }

    public final void i() {
        TextView textView = this.f1482b;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1484d) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
