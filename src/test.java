	import java.sql.Connection;
	import java.sql.DriverManager;

	import java.sql.SQLException;
	import java.sql.Statement;

public class test {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		System.out.println("haha");
		System.out.println("haha");
        String url = "jdbc:sqlserver://10.175.13.170:1433;databaseName=TSQLFundamentals2008";
        Connection conn = DriverManager.getConnection(url,"sa","P@swrd");
        Statement stmt = conn.createStatement();
        
        
        stmt.executeUpdate("  BEGIN TRAN;  UPDATE Sales.OrderDetails    SET unitprice = unitprice + 1.00  WHERE productid = 2;");

        conn.close();
	}

}
