package com.tundem.aboutlibraries.sample;

import android.content.Intent;
import android.os.Bundle;

import com.tundem.aboutlibraries.Libs;
import com.tundem.aboutlibraries.ui.LibsActivity;


public class ExtendActivity extends LibsActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Intent intent = new Intent();
        intent.putExtra(Libs.BUNDLE_FIELDS, Libs.toStringArray(R.string.class.getFields()));
        intent.putExtra(Libs.BUNDLE_LIBS, new String[]{"activeandroid", "caldroid"});
        setIntent(intent);

        super.onCreate(savedInstanceState);
    }
}
