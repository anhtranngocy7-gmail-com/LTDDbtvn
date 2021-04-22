package com.laptrinhdidong.nhom3.btvntuan1.databinding;
import com.laptrinhdidong.nhom3.btvntuan1.R;
import com.laptrinhdidong.nhom3.btvntuan1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class Nhom3QuocSignupBindingImpl extends Nhom3QuocSignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView4, 1);
        sViewsWithIds.put(R.id.image_eclipse2, 2);
        sViewsWithIds.put(R.id.image_eclipe1, 3);
        sViewsWithIds.put(R.id.txt_Signup, 4);
        sViewsWithIds.put(R.id.txt_Fullname, 5);
        sViewsWithIds.put(R.id.editText_Fullname, 6);
        sViewsWithIds.put(R.id.txt_Email, 7);
        sViewsWithIds.put(R.id.editText_Email, 8);
        sViewsWithIds.put(R.id.txt_Password, 9);
        sViewsWithIds.put(R.id.imageButton, 10);
        sViewsWithIds.put(R.id.editText_Password, 11);
        sViewsWithIds.put(R.id.btn_Signup123, 12);
        sViewsWithIds.put(R.id.txt_Already, 13);
        sViewsWithIds.put(R.id.btn_Login, 14);
        sViewsWithIds.put(R.id.txt_Signupwith, 15);
        sViewsWithIds.put(R.id.view_left, 16);
        sViewsWithIds.put(R.id.view_right, 17);
        sViewsWithIds.put(R.id.btn_Facebook, 18);
        sViewsWithIds.put(R.id.btn_Google, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public Nhom3QuocSignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private Nhom3QuocSignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[12]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[11]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[17]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.account == variableId) {
            setAccount((com.laptrinhdidong.nhom3.btvntuan1.Account) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccount(@Nullable com.laptrinhdidong.nhom3.btvntuan1.Account Account) {
        this.mAccount = Account;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): account
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}