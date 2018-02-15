package com.example.hakee.shapp;

import android.os.AsyncTask;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLInput;
import java.sql.SQLOutput;

/**
 * Created by hakee on 2/15/2018.
 */

public class DBHandler extends AsyncTask<Void,Void,Void> {


    private static final String url="jdbc:mysql://sql9.freesqldatabase.com";
    private static final String user= "sql9220284";
    private static final String pass= "rDJ5KIuZgX";
    private static final String DATABASE_NAME="sql9220284";
    private static  String TABLE_NAME="";
    public static String dbString;
    public static SQLInput sqlInput;
    public static SQLOutput sqlOutput;

    //retrieves dbString
    public static String getDBString(){
        return dbString;
    }

    //Prints database results in string format
    public String dataBaseToString(){

        String query= "SELECT * from "+ DATABASE_NAME +" WHERE 1 ";
        return dbString;
    }

    //Creates a connection to the database and uses a resultSet and it's metaData to get info from the table
    @Override
    protected Void doInBackground(Void... voids) {
        try{
            TABLE_NAME="basic_user_info";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,pass);
            String queryString= "SELECT * FROM "+ DATABASE_NAME + "."+TABLE_NAME+" WHERE 1";
            Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

           // ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
          //  boolean searchable= resultSetMetaData.isSearchable(1);

            String loginQuery="INSERT INTO `"+DATABASE_NAME+"`.`"+TABLE_NAME+"` (`email`, `password`) " +
                    "VALUES ('"+Account.getEmailEditText()+"', '"+Account.getPasswordEditText()+"')";

             statement.executeUpdate(loginQuery);
            String currentEmail="";
            String currentPassword="";
            

            final ResultSet resultSet=statement.executeQuery(queryString);
            while (resultSet.next()){
                currentEmail=resultSet.getString(1);
                currentPassword=resultSet.getString(4);
            }
            dbString="Your email: "+currentEmail+"\n"+"Your password: "+currentPassword+"\n";
            resultSet.close();
            statement.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
            dbString= "Database connection failure"+"\n"+e.toString();
        }
        return null;
    }
    protected void onPostExecute(Void aVoid) {


        Account.getLoginResultView().setText(DBHandler.getDBString());
    }



}
