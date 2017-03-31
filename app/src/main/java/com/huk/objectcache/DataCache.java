package com.huk.objectcache;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by huk on 1/4/17.
 */

public class DataCache {

    public DataCache() {
    }

    public static void writeObject(Context context, String key, Object object) throws IOException {
        FileOutputStream fileOutputStream = context.openFileOutput(key, Context.MODE_PRIVATE);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(object);
        oos.close();
        fileOutputStream.close();
    }

    public static Object readObject(Context context, String key) throws IOException,
            ClassNotFoundException {
        FileInputStream fileInputStream = context.openFileInput(key);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Object object = ois.readObject();
        return object;
    }

}
