package com.laptrinhdidong.nhom3.btvntuan1;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnLoginBindingImpl;
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3AnProfileBindingImpl;
import com.laptrinhdidong.nhom3.btvntuan1.databinding.Nhom3QuocSignupBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_NHOM3ANLOGIN = 1;

  private static final int LAYOUT_NHOM3ANPROFILE = 2;

  private static final int LAYOUT_NHOM3QUOCSIGNUP = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_an_login, LAYOUT_NHOM3ANLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_an_profile, LAYOUT_NHOM3ANPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_quoc_signup, LAYOUT_NHOM3QUOCSIGNUP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_NHOM3ANLOGIN: {
          if ("layout/nhom3_an_login_0".equals(tag)) {
            return new Nhom3AnLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nhom3_an_login is invalid. Received: " + tag);
        }
        case  LAYOUT_NHOM3ANPROFILE: {
          if ("layout/nhom3_an_profile_0".equals(tag)) {
            return new Nhom3AnProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nhom3_an_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_NHOM3QUOCSIGNUP: {
          if ("layout/nhom3_quoc_signup_0".equals(tag)) {
            return new Nhom3QuocSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nhom3_quoc_signup is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "account");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/nhom3_an_login_0", com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_an_login);
      sKeys.put("layout/nhom3_an_profile_0", com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_an_profile);
      sKeys.put("layout/nhom3_quoc_signup_0", com.laptrinhdidong.nhom3.btvntuan1.R.layout.nhom3_quoc_signup);
    }
  }
}
