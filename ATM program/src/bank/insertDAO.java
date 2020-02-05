package bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertDAO {

 public static void main(String[] args) {

 

 

 }

public static boolean create(DTO dto) throws Exception {

 

boolean flag = false;

Connection con = null;
Connection con2 = null;

PreparedStatement pstmt = null;
PreparedStatement pstmt2 = null; 



String name = dto.getname();

String Account = dto.getAccount();

String Rnum = dto.getRnum();

String phone = dto.getphone();

String address = dto.getaddress();

String password = dto.getPassword();
 

String sql = "INSERT INTO bank(name,Account,Rnum,phone,address,password) values(?,?,?,?,?,?) ";
String sql2 ="INSERT INTO bank_account(Account ,password, price) values(? ,?, '0')";

 

try {




Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection("jdbc:mysql://localhost:3307/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

pstmt = con.prepareStatement(sql);
pstmt2 = con2.prepareStatement(sql2);


pstmt.setString(1, dto.getname());

pstmt.setString(2, dto.getAccount());

pstmt.setString(3, dto.getRnum());

pstmt.setString(4, dto.getphone());

pstmt.setString(5, dto.getaddress());

pstmt.setString(6, dto.getPassword());

pstmt2.setString(1, dto.getAccount());

pstmt2.setString(2, dto.getPassword());




int r = pstmt.executeUpdate();
int b = pstmt2.executeUpdate();

 

flag = true;

} catch (SQLException e) {

System.out.println(e);

flag = false;

} finally {

 

try {
	

 

if (pstmt != null)

pstmt.close();

if (con != null)

con.close();

if (pstmt != null)

pstmt.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

}

 

return flag;

 

}

}