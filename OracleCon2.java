 import java.sql.*;
class OracleCon2
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcaa2226","mtcaa2226");
Statement stmt=con.createStatement();
String s;
s="insert into student "+"(rollno,sname,age)"+"values(26,'test23',32)";
ResultSet rs=stmt.executeQuery(s);
stmt.executeUpdate(s);
System.out.println("one record inserted");
con.close();
}
catch(Exception e){System.out.println(e);}
}
}
