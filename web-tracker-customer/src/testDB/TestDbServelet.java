package testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDbServelet
 */
@WebServlet("/TestDbServelet")
public class TestDbServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestDbServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup connection variable 
		String user = "springstudent";
		String password = "Anirudh@tha1";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker";
		
		String driver = "com.mysql.jdbc.Driver";
		
		Connection con = null;
		//Get connection 
		try
		{
			PrintWriter out = response.getWriter();
			out.println("Connecting to db:"+jdbcUrl);
			
			Class.forName(driver);
			con = DriverManager.getConnection(jdbcUrl,user,password);
			out.println("Connection Successful..............");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
