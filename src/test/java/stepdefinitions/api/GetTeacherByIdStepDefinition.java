package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseURL;

import static io.restassured.RestAssured.given;

public class GetTeacherByIdStepDefinition extends BaseURL {

    @Given("End point hazirlanir US14_TC01")
    public void end_point_hazirlanir_us14_tc01() {
        spec.pathParams("pp1","teachers","pp2","getSavedTeacherById","pp3",268);

    }
    @When("Get request gönderilir US14_TC01")
    public void get_request_gönderilir_us14_tc01() {

        response = given().spec(spec).when().get("/{pp1}/{pp2}/{pp3}");
    }




}