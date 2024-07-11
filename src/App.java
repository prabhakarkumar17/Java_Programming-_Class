import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
             
       read();
       insert();

    }
    public static void read(){
        try{
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "1234";

            Class.forName("com.mysql.cj.jdbc.Driver"); //Load Driver

            Connection conn = DriverManager.getConnection(url, username, password); //Get Connection
            Statement st = conn.createStatement(); //Create Connection

            String query = "select * from customer"; //Create Query
            ResultSet rs = st.executeQuery(query); //Execute Query

            while(rs.next()){ //Display Result
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String address = rs.getString("address");

                System.out.println("ID : "+id);
                System.out.println("Name : "+name);
                System.out.println("Address : "+address);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void insert(){
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            
            String query = "Insert into customer values(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, 6);
            ps.setString(2, "Rohit Sharma");
            ps.setString(3, "Mumbai");
            int rowsAffected = ps.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Data inserted successfully");
                read();
            } else {
                System.out.println("Data not inserted");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
