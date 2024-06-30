package Polyaeva;

import java.util.List;

public enum AllowedMethod {
    GET,
    POST;

    public static boolean isValidMethod(String method) {
        return List.of("GET", "POST").contains(method);
    }
}
