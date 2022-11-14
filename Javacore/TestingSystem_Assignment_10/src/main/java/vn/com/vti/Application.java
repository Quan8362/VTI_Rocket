package vn.com.vti;

import vn.com.vti.front_end.Function;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        Function function = new Function();
        function.menu();
    }

}
