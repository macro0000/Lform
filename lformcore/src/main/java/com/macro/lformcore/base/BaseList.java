package com.macro.lformcore.base;

import android.util.Log;

import com.macro.lformcore.dom.DomTemplate;

import java.util.ArrayList;
import java.util.List;

public class BaseList {
    final String TAG = "BaseList";

    private List<DomTemplate> templates ;
    public BaseList(List<DomTemplate> templates) {
        this.templates = templates == null ? new ArrayList<DomTemplate>():templates;
    }
    public void build(){
        Log.d(TAG, "build: ");
    }
}
