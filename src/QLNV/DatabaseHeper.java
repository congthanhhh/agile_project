/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author THANH NGUYEN
 */
public class DatabaseHeper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN;"
                    +"encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        String user = "sa";
        String pass = "123456";
        Connection con = DriverManager.getConnection(connectionUrl, user, pass);
        return con;
    }
}
