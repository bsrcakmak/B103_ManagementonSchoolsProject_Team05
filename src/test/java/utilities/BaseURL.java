package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.generateToken;

public class BaseURL {

    public static RequestSpecification spec;

    public static void setUpBeforeAPI() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateToken()).
                setBaseUri("https://school-management-v1.herokuapp.com").
                build();
    }

}
