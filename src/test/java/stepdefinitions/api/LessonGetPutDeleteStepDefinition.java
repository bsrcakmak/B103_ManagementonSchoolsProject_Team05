package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.LessonObjectPojo;
import utilities.BaseURL;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static utilities.BaseURL.spec;

public class LessonGetPutDeleteStepDefinition extends BaseURL {
    LessonObjectPojo expectedData;

    JsonPath actualData;
    @Given("Lesson goruntuleyebilmek icin endpoint hazirlanir US09_TC01")
    public void lesson_goruntuleyebilmek_icin_endpoint_hazirlanir_us09_tc01() {
        spec.pathParams("first","lessons","second","getAll");

    }
    @Then("Get request gonderilir US09_TC01")
    public void get_request_gonderilir_us09_tc01() {
        response=given().spec(spec).when().get("/{first}/{second}");
    }
    @Given("Lesson List bilgilerini silebilmek icin endpoint hazirlanir US09_TC02")
    public void lesson_list_bilgilerini_silebilmek_icin_endpoint_hazirlanir_us09_tc02() {
    spec.pathParams("first","lessons","second","delete","third",688);
    }
    @Then("Endpoint'e delete request gonderilir US09_TC02")
    public void endpoint_e_delete_request_gonderilir_us09_tc02() {
    response=given().spec(spec).when().delete("/{first}/{second}/{third}");
    }

}

