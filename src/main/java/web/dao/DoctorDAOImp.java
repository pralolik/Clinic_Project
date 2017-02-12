package web.dao;

import web.models.Doctor;
import web.models.Visitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public class DoctorDAOImp implements DoctorDAO {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/clinic";
    static final String USER = "root";
    static final String PASS = "13624qq";


    public Doctor getDoctorById(Long doctor_id) {
        return null;
    }

    public List<Doctor> getAllDoctors() {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute SQL query
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM doctor";
            ResultSet rs = stmt.executeQuery(sql);
            List<Doctor> result = new ArrayList<Doctor>();
            // Extract data from result set
            while(rs.next()){
                result.add(new Doctor(rs.getLong("doctor_id"),
                        rs.getString("doctor_name"),
                        rs.getString("doctor_second_name")));

            }
            conn.close();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
