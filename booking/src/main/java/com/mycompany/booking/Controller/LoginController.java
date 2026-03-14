package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.DBConnection;
import model.Employee;

public class LoginController {

    public boolean login(Employee emp){

        boolean status = false;

        try{

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM employees WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, emp.getUsername());
            pst.setString(2, emp.getPassword());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                status = true;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return status;
    }
}