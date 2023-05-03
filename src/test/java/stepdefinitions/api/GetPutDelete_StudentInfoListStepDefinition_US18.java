package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import pojos.StudentInfoPojo;
import utilities.BaseURL;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class GetPutDelete_StudentInfoListStepDefinition_US18 extends BaseURL {

        StudentInfoPojo expectedData;
        JsonPath actualData;

        //////////////////////////////////////////////////////////////////////
        // GET
        /////////////////////////////////////////////////////////////////////

    //http://164.92.252.42:8080/studentInfo/getByStudentId/2
       @Given("Student Info List goruntulemek icin endpoint hazirlanir US18_TC01")
        public void student_ınfo_list_goruntulemek_icin_endpoint_hazirlanir_us18_tc01() {
            spec.pathParams("first", "studentInfo", "second", "getByStudentId", "third", 2);

        }

        @When("Get request gonderilir US18_TC01")
        public void get_request_gonderilir_us18_tc01() {
            response = given().spec(spec).when().get("/{first}/{second}/{third}");
            response.prettyPrint();
            actualData = response.jsonPath();
        }
        ////////////////////////////////////////////////////////////////////////////////
        // PUT
        /////////////////////////////////////////////////////////////////////////////////

        // http://164.92.252.42:8080/studentInfo/update/331
        @Given("Student Info List guncellemek icin endpoint hazirlanir US18_TC02")
        public void student_ınfo_list_guncellemek_icin_endpoint_hazirlanir_us18_tc02() {
            spec.pathParams("first", "studentInfo", "second", "update", "third", 759);

        }

        @When("Data hazirlanir US18_TC02")
        public void data_hazirlanir_us18_tc02() {
            expectedData = new StudentInfoPojo(1, 2, 45, "Her gun tekrar yapmali", 17, 67, 2);
        }

        @When("Put request gonderilir US18_TC02")
        public void put_request_gonderilir_us18_tc02() {
            response = given().spec(spec).when().body(expectedData).put("/{first}/{second}/{third}");
            actualData = response.jsonPath();
        }

        @Then("Hazirlanan data ile Student Info Listin guncellendigi dogrulanir US18_TC02")
        public void hazirlanan_data_ile_student_ınfo_listin_guncellendigi_dogrulanir_us18_tc02() {
            Integer absentee = Integer.valueOf(actualData.getString("object.absentee"));
            assertEquals(expectedData.getAbsentee(), absentee);


            Assert.assertEquals(expectedData.getInfoNote(), actualData.getString("object.infoNote"));

            String expectedMidtermExamString = "" + expectedData.getMidtermExam() + ".0";
            String actualMidtermExamString = "" + actualData.getDouble("object.midtermExam");
            assertEquals(expectedMidtermExamString, actualMidtermExamString);


            String expectedFinalExamString = "" + expectedData.getFinalExam() + ".0";
            String actualFianlExamString = "" + actualData.getDouble("object.finalExam");
            assertEquals(expectedFinalExamString, actualFianlExamString);

        }


        ///////////////////////////////////////////////////////////////////////////////////////
        // DELETE
        ////////////////////////////////////////////////////////////////////////
        @Given("Student Info List  silmek icin endpoint hazirlanir US18_TC03")
        public void student_ınfo_list_silmek_icin_endpoint_hazirlanir_us18_tc03() {
            spec.pathParams("first", "studentInfo", "second", "delete", "third", 759);
        }

    }






