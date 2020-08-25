/*
 * To change this license header, choose License Headers in Project Properties.
 */
package javadatabaseconnection;

//import java.sqlCallableStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dinamo
 */
public class StoredProcedures {

    /**
     *
     * @param sCodJudet
     * @param sDenumireJudet
     * @throws SQLException
     */

    public static void insertJudet(String sCodJudet, String sDenumireJudet) throws SQLException {
        String user = "test";
        String password = "1234";
        String url = "jdbc:derby://localhost:1527/persoane;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement pstmnt = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
//statement = connection.createSyayement();
            String DML = "INSERT INTO JUDETE VALUES(?,?)";
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setShort(1, Short.parseShort(sCodJudet));
            pstmnt.setString(2, sDenumireJudet);
            pstmnt.execute();

        } catch (ClassNotFoundException | SQLException | NumberFormatException ex) {
            System.out.println("SQL exception:" + ex.getMessage());
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    System.out.println("SQL exception:" + ex.getMessage());
                }
            }
            if (null != pstmnt) {
                try {
                    pstmnt.close();
                } catch (SQLException ex) {
                    System.out.println("SQL exception:" + ex.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("SQL exception:" + ex.getMessage());
                }
            }
        }
    }

}
