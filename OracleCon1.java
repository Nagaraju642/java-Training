 import java.sql.*;
class OracleCon1
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcaa2226","mtcaa2226");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
