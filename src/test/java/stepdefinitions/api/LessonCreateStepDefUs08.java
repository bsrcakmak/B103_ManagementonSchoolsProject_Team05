package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonObjectPojo;
import pojos.LessonPojo;
import pojos.RegisterObjectPojo;
import pojos.RegisterPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.BaseURL.spec;

public class LessonCreateStepDefUs08 extends BaseURL {


    LessonObjectPojo expectedData ;

    JsonPath actualData ;

    /*

   {
    "object": {
        "lessonId": 549,
        "lessonName": "love",
        "creditScore": 55,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}
}*/


    @Given("Lesson oluşturmak için endpoint hazırlanır")
    public void lesson_oluşturmak_için_endpoint_hazırlanır() {
    spec.pathParams("first","lessons","second","save");

    }
    @Then("Body olarak gonderilecek data hazirlanir US08_TC01")
    public void body_olarak_gonderilecek_data_hazirlanir_us08_tc01() {

        expectedData = new LessonObjectPojo(true, 8, ReusableMethods.createName());

    }
    @Then("Post request gonderilir US08_TC01")
    public void post_request_gonderilir_us08_tc01() {
        response=given(spec).when().body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
        actualData=response.jsonPath();

    }

    @Then("Lesson ın olusturuldugu dogrulanir US08_TC01")
    public void lesson_ın_olusturuldugu_dogrulanir_us08_tc01() {
        assertEquals(200, response.statusCode());
        assertTrue(actualData.getString("message").contains("Lesson Created"));
        Integer id = actualData.getInt("object.lessonId");
        ReusableMethods.deleteRequest("lessons", id);
    }
    @Then("Body olarak gönderilecek data  Lesson Name bilgisine yer verilmeden hazırlanır US08_TC02")
    public void body_olarak_gönderilecek_data_lesson_name_bilgisine_yer_verilmeden_hazırlanır_us08_tc02() {
        expectedData=new LessonObjectPojo(true, 55, "");
//  yorum
    }
    @Then("Data Compulsory checkbox bilgisine yer verilmeden hazirlanir US08_{int}")
    public void data_compulsory_checkbox_bilgisine_yer_verilmeden_hazirlanir_us08(Integer int1) {
       expectedData=new LessonObjectPojo(false, 55, ReusableMethods.createName());
    }


    @Then("Body olarak gönderilecek data  Credit Score bilgisine yer verilmeden hazirlanir US")
    public void bodyOlarakGönderilecekDataCreditScoreBilgisineYerVerilmedenHazirlanirUS_TC() {
        expectedData=new LessonObjectPojo(false, 0, ReusableMethods.createName());
        //İNTEGER LARA NULL ATAYAMAYIZ
    }

   /* @Then("Status Code'unun 409 oldugu dogrulanir")
    public void status_kodunun_dortyuzdokuz_oldugu_dogrulanir() {
        assertEquals(409, response.statusCode());
    }*/
}
