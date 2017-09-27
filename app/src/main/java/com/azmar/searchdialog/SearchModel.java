package com.azmar.searchdialog;

import ir.mirrajabi.searchdialog.core.Searchable;

/**
 * Created by Rocky on 6/10/2017.
 */

public class SearchModel implements Searchable {

    private String mTitle;

    public SearchModel(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }
}
