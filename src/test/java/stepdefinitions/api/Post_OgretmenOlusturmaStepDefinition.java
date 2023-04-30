package stepdefinitions.api;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.AddTeacherObjectPojo;
import pojos.AddTeacherPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post_OgretmenOlusturmaStepDefinition extends BaseURL {

    AddTeacherObjectPojo objectData;
    AddTeacherPojo expectedData;

    JsonPath actualData ;
    /*
    [
  {
    "object": {
      "userId": 195,
      "username": "Senemzc",
      "name": "Senem",
      "surname": "Ozcetinn",
      "birthDay": "1884-11-01",
      "ssn": "604-24-7813",
      "birthPlace": "Izmir",
      "phoneNumber": "450-636-0258",
      "gender": "FEMALE",
      "email": "sizr@gmail.com"
    },
    "message": "Teacher saved successfully",
    "httpStatus": "CREATED"
  }
]
     */

    @Given("Vice Dean ogretmen olusturmak icin end pointe gider US13_TC01")
    public void vice_dean_ogretmen_olusturmak_icin_end_pointe_gider_us13_tc01() {

        spec.pathParams("pp1","teachers","pp2","save");
    }
    @When("Request’te gönderilecek olan data hazırlanır US13_TC01")
    public void request_te_gönderilecek_olan_data_hazırlanır_us13_tc01() {

        objectData= new AddTeacherObjectPojo(
                ReusableMethods.createUserName(),
                ReusableMethods.createName(),
                ReusableMethods.createSurname(),
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createSSN(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createPhone(),
                "FEMALE",
                ReusableMethods.createEmail());
        expectedData=new AddTeacherPojo(objectData,"Teacher saved successfully","CREATED");
    }
    @When("Endpoint’e post request gönderilir US13_TC01")
    public void endpoint_e_post_request_gönderilir_us13_tc01() {

        response = given().spec(spec).when().body(objectData).post("/{pp1}/{pp2}");
        response.prettyPrint();
        actualData=response.jsonPath();
    }
    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US13_TC01")
    public void request_data_sı_ile_response_data_sının_aynı_olduğu_doğrulanır_us13_tc01() {

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getObject().getUsername(),actualData.getString("object.username"));
        assertEquals(expectedData.getObject().getName(),actualData.getString("object.name"));
        assertEquals(expectedData.getObject().getSurname(),actualData.getString("object.surname"));
        assertEquals(expectedData.getObject().getBirthDay(),actualData.getString("object.birthDay"));
        assertEquals(expectedData.getObject().getSsn(),actualData.getString("object.ssn"));
        assertEquals(expectedData.getObject().getBirthPlace(),actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getString("object.phoneNumber"));
        assertEquals(expectedData.getObject().getGender(),actualData.getString("object.gender"));
        assertEquals(expectedData.getObject().getEmail(),actualData.getString("object.email"));
        assertEquals(expectedData.getMessage(),actualData.getString("message"));
        assertEquals(expectedData.getHttpStatus(),actualData.getString("httpStatus"));
    }

    @And("Request’te gönderilecek olan data hazırlanır US13_TC02")
    public void requestTeGönderilecekOlanDataHazırlanırUS13_TC02() {
        
    }

    @And("Endpoint’e post request gönderilir US13_TC02")
    public void endpointEPostRequestGönderilirUS13_TC02() {
        
    }

    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US13_TC02")
    public void requestDataSıIleResponseDataSınınAynıOlduğuDoğrulanırUS13_TC02() {
    }
}
