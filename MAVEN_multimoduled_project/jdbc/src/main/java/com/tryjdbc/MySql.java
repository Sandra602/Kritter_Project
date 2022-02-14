package com.tryjdbc;

import java.sql.*;
import java.util.Scanner;

public class MySql {
        String cust_name,place;
        double phone_number;
        /* int lengthOfphone =
        String.valueOf(phone_number).length();*/
        boolean count = true;
        public boolean customerDetails() throws SQLException {
            Scanner insert = new Scanner(System.in);
            System.out.println("Enter the Name of The User : ");
            cust_name = insert.nextLine();
            System.out.println("Enter the Place of The User : ");
            place = insert.nextLine();


            System.out.println("Enter the phone-number of The User : ");
            phone_number = insert.nextDouble();

            Connection myconnection = null;
            try {
                String dbUrl = "jdbc:mysql://localhost:3306/customer?autoReconnect=true&useSSL=false";
                String password = "sandra";

                Class.forName("com.mysql.jdbc.Driver");
                String username = "root";
                myconnection = DriverManager.getConnection(dbUrl, username, password);

                //
                myconnection.setAutoCommit(false);
                Statement myStatement = myconnection.createStatement();

                String sql = "INSERT INTO customers (name,place,phone_number) VALUES(?,?,?)";
                PreparedStatement statement = myconnection.prepareStatement(sql);
                statement.setString(1, cust_name);
                statement.setString(2, place);
                statement.setDouble(3, phone_number);
                int rows = statement.executeUpdate();
                myconnection.commit();


                if (rows > 0) {
                    System.out.println("Customer Data Inserted");
                }
                ResultSet myresultset = myStatement.executeQuery("Select * from customers");
                System.out.println("success");
                System.out.println("");

                while (myresultset.next()) {
                    System.out.println("Customer :" + myresultset.getString("name") + " " +
                            myresultset.getString("place") + " " + myresultset.getString("phone_number"));

                }

                String sql1 = "UPDATE customers SET place='mno' WHERE name='sandhya'";
                Statement statement1 = myconnection.createStatement();
                int rows1 = statement1.executeUpdate(sql1);
                if (rows1 > 0) {
                    System.out.println("VALUE UPDATED");
                }
                System.out.println("");

                ResultSet myresultset1 = myStatement.executeQuery("Select * from customers");
                System.out.println("success");
                System.out.println("");
                while (myresultset1.next()) {
                    System.out.println("Customer :" + myresultset1.getString("name") + " " +
                            myresultset1.getString("place") + " " + myresultset1.getString("phone_number"));

                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                myconnection.close();
            }
            return true;
        }
}
