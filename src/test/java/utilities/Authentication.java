package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password", "12345678");
        bodyMap.put("username", "AdminB103");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post("https://school-management-v1.herokuapp.com/auth/login");
        return response.jsonPath().getString("token");
    }

}
