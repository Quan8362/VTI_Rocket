package vn.com.vti.utils;
import org.apache.commons.lang3.StringUtils;
import vn.com.vti.entity.Position;

public class Utils {
    public static boolean validatePosition(String action, Position position) {
        if (action.equalsIgnoreCase("add")) {
            return !StringUtils.isBlank(position.getName().name());
        } else if (action.equalsIgnoreCase("update")) {
            if (position.getId() == null) {
                return false;
            } else {
                return !StringUtils.isBlank(position.getName().name());
            }
        } else if (action.equalsIgnoreCase("delete")) {
            return position.getId() != null;
        }
        return true;
    }

}
