package Dao;

import DB.DBConnection;
import Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    public void addBook(Book book) {

        String sql =
                "INSERT INTO BOOKS " +
                "(CATEGORY,TITLE,AUTHOR,COPIES) " +
                "VALUES (?,?,?,?)";

        try (
                Connection conn =
                        DBConnection.getConnection();

                PreparedStatement ps =
                        conn.prepareStatement(sql)
        ) {

            ps.setString(1, book.getCategory());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setInt(4, book.getCopies());

            ps.executeUpdate();

            System.out.println("Book added successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
