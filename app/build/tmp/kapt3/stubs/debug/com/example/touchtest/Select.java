package com.example.touchtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014J0\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/touchtest/Select;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "binding", "Lcom/example/touchtest/databinding/ActivitySelectBinding;", "csvID", "", "numQue", "realm", "Lio/realm/Realm;", "checkError", "", "getRadioButtonIndex", "", "initSpinner", "next", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "pos", "id", "", "onNothingSelected", "registerSetting", "app_debug"})
public final class Select extends androidx.appcompat.app.AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener {
    private com.example.touchtest.databinding.ActivitySelectBinding binding;
    private io.realm.Realm realm;
    private int csvID = 0;
    private int numQue = 0;
    
    public Select() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int pos, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void initSpinner() {
    }
    
    private final void getRadioButtonIndex() {
    }
    
    private final boolean checkError() {
        return false;
    }
    
    private final void registerSetting() {
    }
    
    private final void next() {
    }
}