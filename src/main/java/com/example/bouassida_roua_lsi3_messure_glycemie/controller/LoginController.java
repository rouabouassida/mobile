package com.example.bouassida_roua_lsi3_messure_glycemie.controller;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.bouassida_roua_lsi3_messure_glycemie.model.User;

public class LoginController {
    private static final String  SHERED_PRES = "sharedPrefs";
    private static User user ;
    private static LoginController instance = null;
    private LoginController(){
        super();
    }
    public static final LoginController getInstance(Context context){
        if(LoginController.instance == null)
            instance=new LoginController();
        recapUser(context );
        return LoginController.instance;
    }
    private static void recapUser(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHERED_PRES,Context.MODE_PRIVATE);
        String userName =sharedPreferences.getString("userName","");
        String password =sharedPreferences.getString("password","");
        user =new User(userName,password);
    }
    public void createUser(String userName , String password , Context context ){
        //creation de l'utilisateur
        user =new User (userName ,password);
        //persistance de l'utilisateur
        SharedPreferences sharedPreferences =context.getSharedPreferences( SHERED_PRES ,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("userName",userName);
        editor.putString("password",password);
        //pour faire reellement l'etape
        editor.apply();


    }
    public String getUserNom() {
        return user.getUserNom();
    }

    public String getPassword() {
        return user.getPassword();
    }


}
