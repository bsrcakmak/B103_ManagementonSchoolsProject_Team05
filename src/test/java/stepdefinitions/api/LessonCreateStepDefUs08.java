package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonPojo;
import pojos.RegisterObjectPojo;
import pojos.RegisterPojo;

public class LessonCreateStepDefUs08 {


    Response response;

    LessonPojo lessonPojo;

    JsonPath actualData ;



    /*{
    "object": {
        "lessonId": 433,
        "lessonName": "kumar",
        "creditScore": 55,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}*/


    @Given("Lesson oluşturmak için endpoint hazırlanır")
    public void lesson_oluşturmak_için_endpoint_hazırlanır() {


    }
    @Then("Body olarak gonderilecek data hazirlanir US08_TC01")
    public void body_olarak_gonderilecek_data_hazirlanir_us08_tc01() {

    }
    @Then("Post request gonderilir US08_TC01")
    public void post_request_gonderilir_us08_tc01() {

    }
    @Then("Lesson ın olusturuldugu dogrulanir US08_TC01")
    public void lesson_ın_olusturuldugu_dogrulanir_us08_tc01() {

    }
    @Then("Body olarak gönderilecek data  Lesson Name bilgisine yer verilmeden hazırlanır US08_TC02")
    public void body_olarak_gönderilecek_data_lesson_name_bilgisine_yer_verilmeden_hazırlanır_us08_tc02() {

    }
    @Then("Data Compulsory checkbox bilgisine yer verilmeden hazirlanir US08_{int}")
    public void data_compulsory_checkbox_bilgisine_yer_verilmeden_hazirlanir_us08(Integer int1) {

    }
    @Then("Lesson ın olusturulamadigi dogrulanir US08_{int}")
    public void lesson_ın_olusturulamadigi_dogrulanir_us08(Integer int1) {

    }
    @Then("Body olarak gönderilecek data  Credit Score bilgisine yer verilmeden hazirlanir US08_{int}")
    public void body_olarak_gönderilecek_data_credit_score_bilgisine_yer_verilmeden_hazirlanir_us08(Integer int1) {

    }
}
