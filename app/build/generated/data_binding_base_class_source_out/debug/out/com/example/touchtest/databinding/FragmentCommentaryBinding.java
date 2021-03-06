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

public final class FragmentCommentaryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView com1;

  @NonNull
  public final TextView com2;

  @NonNull
  public final TextView com3;

  @NonNull
  public final TextView com4;

  @NonNull
  public final TextView currentCom;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final TextView questionCom;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView totalCom;

  private FragmentCommentaryBinding(@NonNull ConstraintLayout rootView, @NonNull TextView com1,
      @NonNull TextView com2, @NonNull TextView com3, @NonNull TextView com4,
      @NonNull TextView currentCom, @NonNull ConstraintLayout frameLayout2,
      @NonNull TextView questionCom, @NonNull TextView textView2, @NonNull TextView totalCom) {
    this.rootView = rootView;
    this.com1 = com1;
    this.com2 = com2;
    this.com3 = com3;
    this.com4 = com4;
    this.currentCom = currentCom;
    this.frameLayout2 = frameLayout2;
    this.questionCom = questionCom;
    this.textView2 = textView2;
    this.totalCom = totalCom;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommentaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommentaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_commentary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommentaryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.com1;
      TextView com1 = ViewBindings.findChildViewById(rootView, id);
      if (com1 == null) {
        break missingId;
      }

      id = R.id.com2;
      TextView com2 = ViewBindings.findChildViewById(rootView, id);
      if (com2 == null) {
        break missingId;
      }

      id = R.id.com3;
      TextView com3 = ViewBindings.findChildViewById(rootView, id);
      if (com3 == null) {
        break missingId;
      }

      id = R.id.com4;
      TextView com4 = ViewBindings.findChildViewById(rootView, id);
      if (com4 == null) {
        break missingId;
      }

      id = R.id.current_com;
      TextView currentCom = ViewBindings.findChildViewById(rootView, id);
      if (currentCom == null) {
        break missingId;
      }

      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.question_com;
      TextView questionCom = ViewBindings.findChildViewById(rootView, id);
      if (questionCom == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.total_com;
      TextView totalCom = ViewBindings.findChildViewById(rootView, id);
      if (totalCom == null) {
        break missingId;
      }

      return new FragmentCommentaryBinding((ConstraintLayout) rootView, com1, com2, com3, com4,
          currentCom, frameLayout2, questionCom, textView2, totalCom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
