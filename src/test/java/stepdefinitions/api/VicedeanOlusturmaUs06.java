package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.RegisterObjectPojo;
import pojos.RegisterPojo;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.ui.RegisterStepDefinition.ssnFormat;
import static utilities.BaseURL.*;

public class VicedeanOlusturmaUs06 {



    RegisterObjectPojo expectedData;

    JsonPath actualData ;

/*
* {
    "object": {
        "userId": 206,
        "username": "hsnc",
        "name": "hasan",
        "surname": "aktas",
        "birthDay": "1986-08-16",
        "ssn": "321-22-4545",
        "birthPlace": "amasya",
        "phoneNumber": "456-123-1236",
        "gender": "MALE"
    },
    "message": "Vice dean Saved",
    "httpStatus": "CREATED"
}*/

    @Given("Vice Dean oluşturmak için endpoint hazırlanır")
    public void vice_dean_oluşturmak_için_endpoint_hazırlanır() {
        spec.pathParams("first","vicedean","second","save");
    }
    @Then("Body olarak gönderilecek data hazırlanır US06_TC01")
    public void body_olarak_gönderilecek_data_hazırlanır_us06_tc01() {
        expectedData=new RegisterObjectPojo("1986-08-16",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());


    }
    @Then("Post request gönderilir US06_TC01")
    public void post_request_gönderilir_us06_tc01() {
    response=given(spec).when().body(expectedData).post("/{first}/{second}");
    response.prettyPrint();
    actualData=response.jsonPath();

    }
    @Then("ViceDean ın data'daki bilgilerle oluşturulduğu doğrulanır US06_TC01")
    public void vice_dean_ın_data_daki_bilgilerle_oluşturulduğu_doğrulanır_us06_tc01() {
    assertEquals(200,response.statusCode());
        assertTrue(actualData.getString("message").contains("Vice dean Saved"));
        assertTrue(actualData.getString("httpStatus").contains("CREATED"));

    }
    @Then("Body olarak gönderilecek data name bilgisine yer verilmeden hazırlanır US06_TC02")
    public void body_olarak_gönderilecek_data_name_bilgisine_yer_verilmeden_hazırlanır_us06_tc02() {

       expectedData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                "",
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());



    }
    @Then("Body olarak gönderilecek data surname bilgisine yer verilmeden hazırlanır US06_TC03")
    public void body_olarak_gönderilecek_data_surname_bilgisine_yer_verilmeden_hazırlanır_us06_tc03() {
        expectedData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                "",
                ReusableMethods.createUserName());

    }
    @Then("Body olarak gönderilecek data birth Place bilgisine yer verilmeden hazırlanır US06_TC04")
    public void body_olarak_gönderilecek_data_birth_place_bilgisine_yer_verilmeden_hazırlanır_us06_tc04() {
        expectedData = new RegisterObjectPojo("1995-06-01",
                "",
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());

    }
    @Then("Body olarak gönderilecek data Gender bilgisine yer verilmeden hazırlanır US06_TC04")
    public void body_olarak_gönderilecek_data_gender_bilgisine_yer_verilmeden_hazırlanır_us06_tc04() {
        expectedData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }
    @Then("Body olarak gönderilecek data Telefon no bilgisine yer verilmeden hazırlanır")
    public void body_olarak_gönderilecek_data_telefon_no_bilgisine_yer_verilmeden_hazırlanır() {
      expectedData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                "",
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }
}
