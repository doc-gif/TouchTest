// Generated by view binder compiler. Do not edit!
package com.example.touchtest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class RecyclerviewItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView com1Res;

  @NonNull
  public final TextView idRes;

  @NonNull
  public final TextView questionRes;

  @NonNull
  public final TextView textView6;

  private RecyclerviewItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView com1Res,
      @NonNull TextView idRes, @NonNull TextView questionRes, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.com1Res = com1Res;
    this.idRes = idRes;
    this.questionRes = questionRes;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerviewItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerviewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recyclerview_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerviewItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.com1_res;
      TextView com1Res = ViewBindings.findChildViewById(rootView, id);
      if (com1Res == null) {
        break missingId;
      }

      id = R.id.id_res;
      TextView idRes = ViewBindings.findChildViewById(rootView, id);
      if (idRes == null) {
        break missingId;
      }

      id = R.id.question_res;
      TextView questionRes = ViewBindings.findChildViewById(rootView, id);
      if (questionRes == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new RecyclerviewItemBinding((ConstraintLayout) rootView, com1Res, idRes, questionRes,
          textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
