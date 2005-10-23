package prueba;

import java.sql.*;

public class Conexion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

        try
        {
            String userName = "usuprueba";
            String password = "pruebapass";
            String url = "jdbc:mysql://localhost/pruebas";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Database connection established");
            Statement select = conn.createStatement();
           
            ResultSet result = select.executeQuery("SELECT * FROM usuarios");
            System.out.println("Tengo el resultado");
            
            while (result.next()){
            	System.out.print("Usu: " + result.getString("nombre"));
            	System.out.println("    Pass:  " + result.getString("nick"));
            }
        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            e.printStackTrace();
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
	}

}
