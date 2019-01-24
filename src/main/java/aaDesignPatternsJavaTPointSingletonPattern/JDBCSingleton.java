package aaDesignPatternsJavaTPointSingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSingleton {

  //Step 1
  //create a JDBCSingleton class.
  //static member holds only one instance of JDBCSingleton class
  private static JDBCSingleton jdbc;

  //JDBCSingleton prevents instantiation from any other class
  private JDBCSingleton(){}

  //Now provide a global point of access
  public static JDBCSingleton getInstance(){
    if(jdbc ==null){
      jdbc=new JDBCSingleton();
    }
    return jdbc;
  }

  //to get the connection from methods like insert, view etc.
  private static Connection getConnection()throws ClassNotFoundException, SQLException{
    Connection con = null;
    Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
    return con;
  }

  //to insert the record into the database
  public int insert(String name, String pass)throws SQLException
  {
    Connection c=null;
    PreparedStatement ps = null;
    int recordCounter = 0;

    try{
      c=this.getConnection();
      ps=c.prepareStatement("insert into userdata(uname, upassword)values(?,?)");
      ps.setString(1,name);
      ps.setString(2, pass);
      recordCounter=ps.executeUpdate();

    }catch(Exception e){e.printStackTrace(); } finally{
      if(ps!=null){
        ps.close();
      }if(c!=null){
        c.close();
      }

    }
    return recordCounter;
  }

}
