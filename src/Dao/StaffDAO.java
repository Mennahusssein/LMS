package Dao;

import DB.DBConnection;
import Model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {

    public void addStaff(Staff staff) {

        String sql =
                "INSERT INTO STAFF(NAME,CONTACT) VALUES(?,?)";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, staff.getName());
            ps.setString(2, staff.getContact());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Staff> getAllStaff() {

        List<Staff> staffList = new ArrayList<>();

        String sql = "SELECT * FROM STAFF";

        try (
                Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {

                Staff staff = new Staff(
                        rs.getString("NAME"),
                        rs.getString("CONTACT")
                );

                staffList.add(staff);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return staffList;
    }

    public void deleteStaff(int id) {

        String sql = "DELETE FROM STAFF WHERE STAFF_ID=?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}