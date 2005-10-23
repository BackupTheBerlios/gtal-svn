package prueba;

import java.sql.*;

public class Conexion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
	
	public String conecta(){
		// TODO Auto-generated method stub

		Connection conn = null;
		String resultado = null;

        try
        {
            String userName = "usuprueba";
            String password = "pruebapass";
            String url = "jdbc:mysql://kn0t.sytes.net/pruebas";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
            resultado = "Database connection established \n";
            Statement select = conn.createStatement();
           
            ResultSet result = select.executeQuery("SELECT * FROM usuarios");
            resultado += "Tengo el resultado: \n\n";
            
            while (result.next()){
            	resultado += "Usu: " + result.getString("nombre");
            	resultado += "    Pass:  " + result.getString("nick") + "\n";
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
                    resultado += "Database connection terminated\n";
                    ProbandoSubVersion.Yuju();
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
        
        return resultado;
	} 

}
