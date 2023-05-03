package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import pojos.StudentInfoPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;


public class Post_StudentInfoStepDefinition_US17 extends BaseURL{

/*
{
  "absentee": 1,
  "educationTermId": 2,
  "finalExam": "45",
  "infoNote": "Her gun tekrarr yapmali",
  "lessonId": "17",
  "midtermExam": "67",
  "studentId": "2"
}
 */

        StudentInfoPojo expectedData;
        JsonPath actualData;


        @Given("Teacher ogrenciye not verebilmek icin endpoint hazirlar US17_TC01")
        public void teacher_ogrenciye_not_verebilmek_icin_endpoint_hazirlar_us17_tc01() {
            spec.pathParams("first", "studentInfo", "second", "save");

        }

        @When("Data hazirlar US17_TC01")
        public void data_hazirlar_us17_tc01() {
            expectedData = new StudentInfoPojo(1, 2, 45, "Her gun tekrar yapmali", 17, 67, 2);
        }
        @When("Post request gonderilir US17_TC01")
        public void post_request_gonderilir_us17_tc01() {
            response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
            actualData = response.jsonPath();
        }

        @Then("Hazirlanan data ile ogrenciye not verildigi dogrulanir US17_TC01")
        public void hazirlanan_data_ile_ogrenciye_not_verildigi_dogrulanir_us17_tc01() {
            Integer absentee = Integer.valueOf(actualData.getString("object.absentee"));
            assertEquals(expectedData.getAbsentee(), absentee);

            Assert.assertEquals(expectedData.getInfoNote(), actualData.getString("object.infoNote"));

            String expectedMidtermExamString = ""+ expectedData.getMidtermExam()+".0";
            String actualMidtermExamString = "" + actualData.getDouble("object.midtermExam");
            assertEquals(expectedMidtermExamString, actualMidtermExamString);

            String expectedFinalExamString = ""+ expectedData.getFinalExam()+".0";
            String actualFianlExamString = "" + actualData.getDouble("object.finalExam");
            assertEquals(expectedFinalExamString, actualFianlExamString);


            Integer id = response.jsonPath().getInt("object.id");
            ReusableMethods.deleteRequest("studentInfo", id);
        }


        @And("Data hazirlanir US17_TC02")
        public void dataHazirlanirUS_TC() {
            expectedData = new StudentInfoPojo(null, 2, 45, "Her gun tekrar yapmali", 17, 67, 2);
        }}

