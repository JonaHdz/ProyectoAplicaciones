package com.example.uv_eats;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.uv_eats.databinding.ActivityMainBindingImpl;
import com.example.uv_eats.databinding.ActivityPrincipalTabMenuActivityBindingImpl;
import com.example.uv_eats.databinding.ActivityRecoverPasswordBindingImpl;
import com.example.uv_eats.databinding.ActivitySignInBindingImpl;
import com.example.uv_eats.databinding.FragmentProductsBindingImpl;
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
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYPRINCIPALTABMENUACTIVITY = 2;

  private static final int LAYOUT_ACTIVITYRECOVERPASSWORD = 3;

  private static final int LAYOUT_ACTIVITYSIGNIN = 4;

  private static final int LAYOUT_FRAGMENTPRODUCTS = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uv_eats.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uv_eats.R.layout.activity_principal_tab_menu_activity, LAYOUT_ACTIVITYPRINCIPALTABMENUACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uv_eats.R.layout.activity_recover_password, LAYOUT_ACTIVITYRECOVERPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uv_eats.R.layout.activity_sign_in, LAYOUT_ACTIVITYSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uv_eats.R.layout.fragment_products, LAYOUT_FRAGMENTPRODUCTS);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRINCIPALTABMENUACTIVITY: {
          if ("layout/activity_principal_tab_menu_activity_0".equals(tag)) {
            return new ActivityPrincipalTabMenuActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_principal_tab_menu_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECOVERPASSWORD: {
          if ("layout/activity_recover_password_0".equals(tag)) {
            return new ActivityRecoverPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recover_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNIN: {
          if ("layout/activity_sign_in_0".equals(tag)) {
            return new ActivitySignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTS: {
          if ("layout/fragment_products_0".equals(tag)) {
            return new FragmentProductsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_products is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.uv_eats.R.layout.activity_main);
      sKeys.put("layout/activity_principal_tab_menu_activity_0", com.example.uv_eats.R.layout.activity_principal_tab_menu_activity);
      sKeys.put("layout/activity_recover_password_0", com.example.uv_eats.R.layout.activity_recover_password);
      sKeys.put("layout/activity_sign_in_0", com.example.uv_eats.R.layout.activity_sign_in);
      sKeys.put("layout/fragment_products_0", com.example.uv_eats.R.layout.fragment_products);
    }
  }
}
