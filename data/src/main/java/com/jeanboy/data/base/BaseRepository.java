package com.jeanboy.data.base;

/**
 * Created by jeanboy on 2017/3/13.
 */

public class BaseRepository {

    boolean mCacheIsDirty = false;

    public void refresh() {
        mCacheIsDirty = true;
    }

}
