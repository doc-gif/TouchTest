// Generated by view binder compiler. Do not edit!
package com.example.touchtest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.touchtest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySelectBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RadioButton all;

  @NonNull
  public final RadioButton fifty;

  @NonNull
  public final RadioButton forty;

  @NonNull
  public final RadioButton hundred;

  @NonNull
  public final Button next;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final Spinner selectCsv;

  @NonNull
  public final RadioButton ten;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView texteView2;

  @NonNull
  public final RadioButton thirty;

  @NonNull
  public final RadioButton twenty;

  private ActivitySelectBinding(@NonNull ConstraintLayout rootView, @NonNull RadioButton all,
      @NonNull RadioButton fifty, @NonNull RadioButton forty, @NonNull RadioButton hundred,
      @NonNull Button next, @NonNull RadioGroup radioGroup, @NonNull Spinner selectCsv,
      @NonNull RadioButton ten, @NonNull TextView textView, @NonNull TextView texteView2,
      @NonNull RadioButton thirty, @NonNull RadioButton twenty) {
    this.rootView = rootView;
    this.all = all;
    this.fifty = fifty;
    this.forty = forty;
    this.hundred = hundred;
    this.next = next;
    this.radioGroup = radioGroup;
    this.selectCsv = selectCsv;
    this.ten = ten;
    this.textView = textView;
    this.texteView2 = texteView2;
    this.thirty = thirty;
    this.twenty = twenty;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySelectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.all;
      RadioButton all = ViewBindings.findChildViewById(rootView, id);
      if (all == null) {
        break missingId;
      }

      id = R.id.fifty;
      RadioButton fifty = ViewBindings.findChildViewById(rootView, id);
      if (fifty == null) {
        break missingId;
      }

      id = R.id.forty;
      RadioButton forty = ViewBindings.findChildViewById(rootView, id);
      if (forty == null) {
        break missingId;
      }

      id = R.id.hundred;
      RadioButton hundred = ViewBindings.findChildViewById(rootView, id);
      if (hundred == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.select_csv;
      Spinner selectCsv = ViewBindings.findChildViewById(rootView, id);
      if (selectCsv == null) {
        break missingId;
      }

      id = R.id.ten;
      RadioButton ten = ViewBindings.findChildViewById(rootView, id);
      if (ten == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.texteView2;
      TextView texteView2 = ViewBindings.findChildViewById(rootView, id);
      if (texteView2 == null) {
        break missingId;
      }

      id = R.id.thirty;
      RadioButton thirty = ViewBindings.findChildViewById(rootView, id);
      if (thirty == null) {
        break missingId;
      }

      id = R.id.twenty;
      RadioButton twenty = ViewBindings.findChildViewById(rootView, id);
      if (twenty == null) {
        break missingId;
      }

      return new ActivitySelectBinding((ConstraintLayout) rootView, all, fifty, forty, hundred,
          next, radioGroup, selectCsv, ten, textView, texteView2, thirty, twenty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
