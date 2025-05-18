//1.create package with your project name
package bank.management.system;

//2.import SQL in your con class
import java.sql.*;

//3.create public class
public class Con {

//    4.create connection & statement
    Connection connection;

    Statement statement;


//5. create exception block try & catch
    public Con(){
//        6. connect project with localhost & with your SQL using password
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Samruddha321@");
            statement = connection.createStatement();


//7.    create exception block to avoid any exception
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
//8. Check and Run SQL workbench