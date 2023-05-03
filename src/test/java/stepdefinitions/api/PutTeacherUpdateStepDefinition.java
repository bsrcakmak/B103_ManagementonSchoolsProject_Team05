package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.AddandUpdateTeacherPojo;
import utilities.BaseURL;

import java.util.ArrayList;
import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PutTeacherUpdateStepDefinition extends BaseURL {

    AddandUpdateTeacherPojo expectedData;

    JsonPath actualData;


    @And("Request’te gönderilecek olan data hazırlanır US14_TC02")
    public void requestTeGönderilecekOlanDataHazırlanırUS14_TC02() {

        expectedData=new AddandUpdateTeacherPojo(
                "2001-12-12","Izmir",
                "s.izr@gmail.com",
                "FEMALE",
                true,new ArrayList<>(Arrays.asList(1)),
                "senem",
                "senem00654",
                "417-018-2305",
                "881-01-7971",
                "ozctin",
                "ozcetsenem");
    }

    @And("Hazırlanan endpoint’e put request gönderilir US14_TC02")
    public void hazırlananEndpointEPutRequestGönderilirUS14_TC02() {

        response = given().spec(spec).when().body(expectedData).put("/{pp1}/{pp2}/{pp3}");
        actualData = response.jsonPath();
    }

    @Given("End point hazirlanir US14_TC02")
    public void endPointHazirlanirUS14_TC02() {
        spec.pathParams("pp1","teachers","pp2","update","pp3",268);
    }

    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır")
    public void request_data_sı_ile_response_data_sının_aynı_olduğu_doğrulanır() {

        assertEquals(expectedData.getBirthDay(),actualData.getString("object.birthDay"));
        assertEquals(expectedData.getBirthPlace(),actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getEmail(),actualData.getString("object.email"));
        assertEquals(expectedData.getGender(),actualData.getString("object.gender"));
        assertEquals(expectedData.getName(),actualData.getString("object.name"));
        assertEquals(expectedData.getSurname(),actualData.getString("object.surname"));
        assertEquals(expectedData.getUsername(),actualData.getString("object.username"));
        assertEquals(expectedData.getSsn(),actualData.getString("object.ssn"));
        assertEquals(expectedData.getPhoneNumber(),actualData.getString("object.phoneNumber"));
        assertEquals("Teacher updated Successful",actualData.getString("message"));
        assertEquals("OK",actualData.getString("httpStatus"));
    }
}
