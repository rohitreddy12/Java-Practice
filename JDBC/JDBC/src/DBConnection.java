import java.sql.*;
public class DBConnection{
    public static void main() {
        try{
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "1234";
            String insertQuery = "insert into public.\"Students\"\n" +
                    "values (3,'Rohit')";
            String getQuery = "select * from public.\"Students\"\n";
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Susccessful");
            Statement st = con.createStatement();
            ResultSet rowsReturned = st.executeQuery(getQuery);
            while (rowsReturned.next()){
                System.out.println(rowsReturned.getString("stname"));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}


