package com.company.Serialization_Deserialization;

import java.io.*;

public class UserService {

    public static final String USER_FILE_NAME = "user";

    public static void serializeUser(User user) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(USER_FILE_NAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static User deSerializeUser() {
        FileInputStream fis = null;
        ObjectInputStream oos = null;
        User user = null;
        try {
            fis = new FileInputStream(USER_FILE_NAME);
            oos = new ObjectInputStream(fis);
            user = (User) oos.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return user;
    }
}
