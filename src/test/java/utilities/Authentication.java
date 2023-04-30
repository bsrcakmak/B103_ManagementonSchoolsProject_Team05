package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

//    public static String generateToken() {
//        String url = "https://restful-booker.herokuapp.com/auth";
//        Map<String, String> token = new HashMap<>();
//        token.put("username", "admin");
//        token.put("password", "password123");
//        Response response = given().contentType(ContentType.JSON).when().body(token).post(url);
//        return response.jsonPath().getString("token");
//    }

    public static String generateAdminToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", "wc0sivmd1yc");
        token.put("username", "charlott.bruen");
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateDeanToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", "hxp90et59iy");
        token.put("username", "hosea.braun");
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateViceDeanToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", "ejj95hpsu5rqth");
        token.put("username", "judson.parisian");
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateTeacherToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", "ye7aflbz1a");
        token.put("username", "johnna.denesik");
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateStudentToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", "3u1bd7s4ggil");
        token.put("username", "elin.murazik");
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

}
