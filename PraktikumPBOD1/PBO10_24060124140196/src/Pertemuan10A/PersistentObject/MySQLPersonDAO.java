/*
 *  File        : MySQLPersonDAO.java
 *  Deskripsi   : implementasi PersonDAO untuk MYSQL
*/
package Pertemuan10A.PersistentObject;
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
