// Generated by data binding compiler. Do not edit!
package com.example.uv_eats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.uv_eats.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRecoverPasswordBinding extends ViewDataBinding {
  @NonNull
  public final ImageView Logo;

  @NonNull
  public final TextView NewPassword;

  @NonNull
  public final TextView RepeatPassword;

  @NonNull
  public final Button buttonCode;

  @NonNull
  public final Button buttonEmail;

  @NonNull
  public final Button buttonPassword;

  @NonNull
  public final TextView textCode;

  @NonNull
  public final TextView textEmail;

  @NonNull
  public final EditText textboxCode;

  @NonNull
  public final EditText textboxEmail;

  @NonNull
  public final EditText textboxPassword;

  protected ActivityRecoverPasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView Logo, TextView NewPassword, TextView RepeatPassword,
      Button buttonCode, Button buttonEmail, Button buttonPassword, TextView textCode,
      TextView textEmail, EditText textboxCode, EditText textboxEmail, EditText textboxPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Logo = Logo;
    this.NewPassword = NewPassword;
    this.RepeatPassword = RepeatPassword;
    this.buttonCode = buttonCode;
    this.buttonEmail = buttonEmail;
    this.buttonPassword = buttonPassword;
    this.textCode = textCode;
    this.textEmail = textEmail;
    this.textboxCode = textboxCode;
    this.textboxEmail = textboxEmail;
    this.textboxPassword = textboxPassword;
  }

  @NonNull
  public static ActivityRecoverPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recover_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecoverPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRecoverPasswordBinding>inflateInternal(inflater, R.layout.activity_recover_password, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRecoverPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recover_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecoverPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRecoverPasswordBinding>inflateInternal(inflater, R.layout.activity_recover_password, null, false, component);
  }

  public static ActivityRecoverPasswordBinding bind(@NonNull View view) {
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
  public static ActivityRecoverPasswordBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityRecoverPasswordBinding)bind(component, view, R.layout.activity_recover_password);
  }
}
