package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseURL {

    public static RequestSpecification spec;
    public static Response response;

    public static void setupBeforeAPI() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("http://164.92.252.42:8080").
                build();
    }

//    public static void setupBeforeAPI() {
//        spec = new RequestSpecBuilder().
//                addHeader("Cookie", "token=" + generateToken()).
//                setContentType(ContentType.JSON).
//                setBaseUri("https://restful-booker.herokuapp.com").
//                build();
//    }

}
