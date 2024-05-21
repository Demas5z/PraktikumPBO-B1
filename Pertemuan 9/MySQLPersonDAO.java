import java.sql.*;
/*
 * File : MySQLPersonDAO.java
 * Deskripsi : Implementasi Person DAO pada SQL
 * 
 */

 public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi, nama db, user, password, menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/pbo", "root", "PHW#84#jeor"
        );
        String query ="INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
 }