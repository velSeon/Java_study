

package com.common.util;

import java.sql.*;


public class JdbcTemplate {

	public static String driver="oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static String userid = "scott";
	public static String passwd = "tiger";
	
	public JdbcTemplate() {
		//드라이버로딩
	}
    /**
     * Connection을 연결한 후 멤버 attribute 인 conn 에 Connection 객체를 세팅한 후 리턴한다.
     * 
     * @return Connection
     */
    public static Connection getConnection() {
       // connect연결 후 tx를 false로 설정 리턴 
        return conn;
    }

    /**
     * DB와 Connect되었는지 여부를 Return 한다.
     * 
     * @return DB와 Connect 되었는지 여부.
     */
    public static boolean isConnected(Connection conn) {

        boolean validConnection = true;
//conn 이 null 이거나   conn.isClose()가 참이면  validConnection을 false 로 설정 
        return validConnection;
    }

    /**
     * Connection 객체를 시스템에 반환한다.
     */
    public static void close(Connection conn) {

       isConnected()이용 검사후 close
    }

    /**
     * Statement를 Close 한다.
     * 
     * @param stmt
     *            Statement 객체.
     */
    public static void close(Statement stmt) {

       //stmt close()
    }

    /**
     * ResultSet을 Close 한다.
     * 
     * @param result
     *            ResultSet 객체.
     */
    public static void close(ResultSet rset) {

      //rset close
    }

    /**
     * 지금까지의 트랜잭션을 Commit 처리한다.
     */
    public static void commit(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.commit();
                System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 지금까지의 트랜잭션을 Rollback 처한다.
     */
    public static void rollback(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.rollback();
                System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
