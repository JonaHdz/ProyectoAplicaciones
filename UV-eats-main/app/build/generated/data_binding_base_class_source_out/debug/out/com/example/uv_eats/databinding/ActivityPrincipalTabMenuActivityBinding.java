// Generated by data binding compiler. Do not edit!
package com.example.uv_eats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.example.uv_eats.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPrincipalTabMenuActivityBinding extends ViewDataBinding {
  @NonNull
  public final TabItem tabCart;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TabItem tabProducts;

  @NonNull
  public final TabItem tabRecord;

  @NonNull
  public final ViewPager viewPager;

  protected ActivityPrincipalTabMenuActivityBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TabItem tabCart, TabLayout tabLayout, TabItem tabProducts,
      TabItem tabRecord, ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tabCart = tabCart;
    this.tabLayout = tabLayout;
    this.tabProducts = tabProducts;
    this.tabRecord = tabRecord;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityPrincipalTabMenuActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_principal_tab_menu_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrincipalTabMenuActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPrincipalTabMenuActivityBinding>inflateInternal(inflater, R.layout.activity_principal_tab_menu_activity, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPrincipalTabMenuActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_principal_tab_menu_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrincipalTabMenuActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPrincipalTabMenuActivityBinding>inflateInternal(inflater, R.layout.activity_principal_tab_menu_activity, null, false, component);
  }

  public static ActivityPrincipalTabMenuActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityPrincipalTabMenuActivityBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityPrincipalTabMenuActivityBinding)bind(component, view, R.layout.activity_principal_tab_menu_activity);
  }
}
