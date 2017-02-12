package web.dao;

import web.models.Visitor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public class VisitorDAOImp implements VisitorDAO {

    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/clinic";
    static final String USER = "root";
    static final String PASS = "13624qq";

    public Visitor getVisitorById(Long visitor_id) {
        return null;
    }

    public List<Visitor> getAllVisitor()  {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute SQL query
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM visitor";
            ResultSet rs = stmt.executeQuery(sql);
            List<Visitor> result = new ArrayList<Visitor>();
            // Extract data from result set
            while(rs.next()){
                result.add(new Visitor(rs.getLong("visitor_id"),
                        rs.getString("visitor_name"),
                        rs.getString("visitor_second_name")));

            }
            conn.close();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }
}
