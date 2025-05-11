package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    public Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // Class.forName("com.mysql.jdbc.Driver");

            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "7396"
            );
            s = c.createStatement();
        } catch(Exception e) {
            System.out.println("Connection failed: " + e);
             e.printStackTrace();
        }
    }
}



/*
package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");// FOR MYSQL**************
            
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "root");
            s=c.createStatement();
            
            
            
        }catch(Exception e){
            System.err.println("Error connecting to the database.");
            e.printStackTrace();
// Optionally, you might want to exit the application here:
// System.exit(1);
        }
    }
}
*/