package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.AddTeacherPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostAddTeacherStepDefinition extends BaseURL {
    AddTeacherPojo expectedData;
    JsonPath actualData;

    @Given("Vice Dean ogretmen olusturmak icin end pointe gider US13_TC01")
    public void vice_dean_ogretmen_olusturmak_icin_end_pointe_gider_us13_tc01() {
        spec.pathParams("pp1","teachers","pp2","save");
    }
    @When("Request’te gönderilecek olan data hazırlanır US13_TC01")
    public void request_te_gönderilecek_olan_data_hazırlanır_us13_tc01() {

        expectedData=new AddTeacherPojo(
                "2001-12-12",
                ReusableMethods.createBirthPlace(),
                "snmzc@gmail.com",
                "FEMALE",
                true,
                new ArrayList<>(Arrays.asList(1)),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName()
        );
    }
    @When("Endpoint’e post request gönderilir US13_TC01")
    public void endpoint_e_post_request_gönderilir_us13_tc01() {
       response= given().spec(spec).when().body(expectedData).post("/{pp1}/{pp2}");
       response.prettyPrint();
        actualData = response.jsonPath();
    }
    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US13_TC01")
    public void request_data_sı_ile_response_data_sının_aynı_olduğu_doğrulanır_us13_tc01() {

        assertEquals(expectedData.getBirthDay(),actualData.getString("object.birthDay"));
        assertEquals(expectedData.getBirthPlace(),actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getEmail(),actualData.getString("object.email"));
        assertEquals(expectedData.getGender(),actualData.getString("object.gender"));
        assertEquals(expectedData.getName(),actualData.getString("object.name"));
        assertEquals(expectedData.getSurname(),actualData.getString("object.surname"));
        assertEquals(expectedData.getUsername(),actualData.getString("object.username"));
        assertEquals(expectedData.getSsn(),actualData.getString("object.ssn"));
        assertEquals(expectedData.getPhoneNumber(),actualData.getString("object.phoneNumber"));
        assertEquals("Teacher saved successfully",actualData.getString("message"));
        assertEquals("CREATED",actualData.getString("httpStatus"));
    }

    @And("Request’te gönderilecek olan data hazırlanır US13_TC02")
    public void requestTeGönderilecekOlanDataHazırlanırUS13_TC02() {

        expectedData=new AddTeacherPojo(
                "2001-12-12",
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                "FEMALE",
                true,
                new ArrayList<>(Arrays.asList(1)),
                null,
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

}
