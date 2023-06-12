package ExceptionHandling;

import java.sql.SQLException;

public class ExceptionPropagtionThrows {
    void m() throws SQLException {
        throw new SQLException("SQL Problem");
    }
    void n() throws SQLException{
        m();
    }
    void p(){
        try{
            n();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ExceptionPropagtionThrows obj= new ExceptionPropagtionThrows();
        obj.p();
    }
}
