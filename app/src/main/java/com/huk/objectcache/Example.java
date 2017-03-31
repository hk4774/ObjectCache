package com.huk.objectcache;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huk on 1/4/17.
 */

public class Example extends AppCompatActivity {

    private static final String KEY = "objectsave.huk";
    private static final String TAG = Example.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            String userName = "user1";
            DataCache.writeObject(this, KEY, userName);

            String getString = (String) DataCache.readObject(this, KEY);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Data> datas = new ArrayList<Data>();
            datas.add(new Data("User1"));
            datas.add(new Data("User2"));
            datas.add(new Data("User3"));

            DataCache.writeObject(this, KEY, datas);
            List<Data> cachedEntries = (List<Data>) DataCache.readObject(this, KEY);

            for (Data data : cachedEntries) {
                Log.d(TAG, data.getData());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
