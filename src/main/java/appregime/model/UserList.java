package appregime.model;

import appregime.Main;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class UserList {
    private static ArrayList<UserModel> userList = initializeUserList();

    private static ArrayList<UserModel> initializeUserList() {
        ArrayList<UserModel> listTest = new ArrayList<>();
        String path = Main.class.getResource("/appregime/json/users.json").getPath();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            ArrayList json = gson.fromJson(bufferedReader, ArrayList.class);
            for (Object obj : json) {
                String str = gson.toJson(obj);
                UserModel user = gson.fromJson(str, UserModel.class);
                listTest.add(user);
                System.out.println("Added --> " + user.toString());
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return listTest;
    }

    public static ArrayList<UserModel> getUserList() {
        return userList;
    }
}
