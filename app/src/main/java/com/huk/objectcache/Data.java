package com.huk.objectcache;

import java.io.Serializable;
import java.util.List;

/**
 * Created by huk on 1/4/17.
 */

public class Data implements Serializable {

    private String mData;

    public Data(String mListObject) {
        this.mData = mListObject;
    }

    public String getData() {
        return this.mData;
    }
}
