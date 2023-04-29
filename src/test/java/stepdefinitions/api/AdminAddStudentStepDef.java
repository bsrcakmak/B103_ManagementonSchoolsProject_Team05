package stepdefinitions.api;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.AddStudentPojo;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.BaseURL.spec;


public class AdminAddStudentStepDef {
    /*
        {
    "advisorTeacherId": 0,
    "birthDay": "yyyy-MM-dd",
    "birthPlace": "string",
    "email": "string",
    "fatherName": "string",
    "gender": "MALE",
    "motherName": "string",
    "name": "string",
    "password": "string",
    "phoneNumber": "string",
    "ssn": "string",
    "surname": "string",
    "username": "string"
  }
  {
    "object": {
        "userId": 4,
        "username": "serkan",
        "name": "Serkan",
        "surname": "yalcin",
        "birthDay": "2010-02-02",
        "birthPlace": "Samsun",
        "phoneNumber": "321-656-9087",
        "gender": "MALE",
        "studentNumber": 1003,
        "motherName": "Selma",
        "fatherName": "Sedat",
        "email": "samsun@gmail.com",
        "active": true
    },
    "message": "Student saved Successfully"
}
         */
    public static Faker faker;
    AddStudentPojo expectedData;
    Response response;
    JsonPath actualData;

    @Given("Admin rolu ile student olusturmak icin endpoint hazırlanır US25")
    public void admin_rolu_ile_student_olusturmak_icin_endpoint_hazırlanır_US25() {
        spec.pathParams("first", "students", "second", "save");
    }

    @When("Data hazirlanir US25")
    public void data_hazirlanir() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());

    }

    @When("Post request gonderilir US25")
    public void post_request_gonderilir_US25() {
        response = given().spec(spec).
                when().body(expectedData).post("/{first}/{second}");

        response.prettyPrint();

        actualData = response.jsonPath();


    }

    @Then("Status code`unun {int} oldugu dogrulanir US25")
    public void status_code_unun_oldugu_dogrulanir_US25(Integer int1) {
        assertEquals(200, response.statusCode());
    }

    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US25")
    public void request_data_sı_ile_response_data_sının_aynı_olduğu_doğrulanır_US25() {
        assertEquals(expectedData.getUsername(), actualData.getString("object.username"));
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getSurname(), actualData.getString("object.surname"));
        assertEquals(expectedData.getBirthDay(), actualData.getString("object.birthDay"));
        assertEquals(expectedData.getBirthPlace(), actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getPhoneNumber(), actualData.getString("object.phoneNumber"));
        assertEquals(expectedData.getGender(), actualData.getString("object.gender"));
        assertEquals(expectedData.getMotherName(), actualData.getString("object.motherName"));
        assertEquals(expectedData.getFatherName(), actualData.getString("object.fatherName"));

    }
    //tc02

    @When("Admin rolu ile token olusturulur US{int}")
    public void adminRoluIleTokenOlusturulurUS(int arg0) {
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Sadece name bilgisi girilmeden data hazirlanir US{int}")
    public void sadeceNameBilgisiGirilmedenDataHazirlanirUS(int arg0) {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                "",
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());

    }
    @Then("Status code`un {int} oldugu dogrulanir US{int}")
    public void statusCodeUnOlduguDogrulanirUS(int arg0, int arg1) {
        assertEquals(400, response.statusCode());

    }
    //tc03
    @And("Sadece surname bilgisi girilmeden data hazirlanir US{int}")
    public void sadeceSurnameBilgisiGirilmedenDataHazirlanirUS(int arg0) {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                "",
                ReusableMethods.createUserName());

    }
//tc04
    @And("Sadece birthplace bilgisi girilmeden data hazirlanir US{int}")
    public void sadeceBirthplaceBilgisiGirilmedenDataHazirlanirUS(int arg0) {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                "",
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }
}