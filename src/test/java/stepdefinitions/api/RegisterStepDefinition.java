package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.RegisterObject;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static stepdefinitions.ui.RegisterStepDefinition.*;

public class RegisterStepDefinition {
    RegisterObject expectedData;
    String url = "http://209.38.244.227/guestUser/register";
    Response response=given().when().get(url);



  //  spec.pathParams("first", "guestUser", "second", "register");

    @Given("aday ogrenci data icin name alani bos birakarak post request gönder")
    public void aday_ogrenci_data_icin_name_alani_bos_birakarak_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE","",ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),ReusableMethods.createUserName());

        response.prettyPrint();
    }
    @Then("statusCode dortyuz olmalidir")
    public void status_code_dortyuz_olmalidir() {
      assertEquals(400,response.statusCode());

    }
    @Then("validations.name alaninda Your name should be at least {int} characters oldugunu dogrula")
    public void validations_name_alaninda_your_name_should_be_at_least_characters_oldugunu_dogrula(Integer int1) {


    }

    @Given("aday ogrenci data icin surname alani bos birakarak post request gönder")
    public void aday_ogrenci_data_icin_surname_alani_bos_birakarak_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,"",ReusableMethods.createUserName());

    }

    @Then("validations.surname alaninda Your surname should be at least {int} characters oldugunu dogrula")
    public void validations_surname_alaninda_your_surname_should_be_at_least_characters_oldugunu_dogrula(Integer int1) {

    }

    @Given("aday ogrenci data icin birth place alani bos birakarak post request gönder")
    public void aday_ogrenci_data_icin_birth_place_alani_bos_birakarak_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),"","MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),ReusableMethods.createUserName());

    }

    @Then("validations.birthPlace alaninda Your birth place must consist of the characters . oldugunu dogrula")
    public void validations_birth_place_alaninda_your_birth_place_must_consist_of_the_characters_oldugunu_dogrula() {

    }

    @Given("aday ogrenci data icin phone number alani bos birakarak post request gönder")
    public void aday_ogrenci_data_icin_phone_number_alani_bos_birakarak_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),"",ssnFormat,ReusableMethods.createSurname(),ReusableMethods.createUserName());

    }

    @Then("validations.phoneNumber alaninda Please enter valid phone number oldugunu dogrula")
    public void validations_phone_number_alaninda_please_enter_valid_phone_number_oldugunu_dogrula() {

    }

    @Given("aday ogrenci data icin phone number alanina omikiden az deger girerek post request gönder")
    public void aday_ogrenci_data_icin_phone_number_alanina_omikiden_az_deger_girerek_post_request_gönder() {

    }

    @Then("validations.phoneNumber alaninda Phone number should be exact {int} characters oldugunu dogrula")
    public void validations_phone_number_alaninda_phone_number_should_be_exact_characters_oldugunu_dogrula(Integer int1) {

    }

    @Given("aday ogrenci data icin birtday alanina gecersiz formatta deger girerek post request gönder")
    public void aday_ogrenci_data_icin_birtday_alanina_gecersiz_formatta_deger_girerek_post_request_gönder() {

    }

    @Then("message JSON parse error icermelidir")
    public void message_json_parse_error_icermelidir() {

    }

    @Given("aday ogrenci data icin SSN alanina gecersiz formatta deger girerek post request gönder")
    public void aday_ogrenci_data_icin_ssn_alanina_gecersiz_formatta_deger_girerek_post_request_gönder() {

    }

    @Then("validations.ssn Please enter valid SSN number oldugunu dogrula")
    public void validations_ssn_please_enter_valid_ssn_number_oldugunu_dogrula() {

    }

    @Given("aday ogrenci data icin username alani bos birakarak post request gönder")
    public void aday_ogrenci_data_icin_username_alani_bos_birakarak_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),"");


    }

    @Then("validations.name alaninda Your username should be at least {int} characters oldugunu dogrula")
    public void validations_name_alaninda_your_username_should_be_at_least_characters_oldugunu_dogrula(Integer int1) {

    }

    @Given("aday ogrenci data icin username alanina uc karakter deger girerek post request gönder")
    public void aday_ogrenci_data_icin_username_alanina_uc_karakter_deger_girerek_post_request_gönder() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),"abc");

    }

    @Given("aday ogrenci data icin password alanina {int} karakter deger girerek post request gönder")
    public void aday_ogrenci_data_icin_password_alanina_karakter_deger_girerek_post_request_gönder(Integer int1) {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),numberYediHane,ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),ReusableMethods.createUserName());

    }

    @Then("validations.password alaninda Please enter your password as at least {int} characters oldugunu dogrula")
    public void validations_password_alaninda_please_enter_your_password_as_at_least_characters_oldugunu_dogrula(Integer int1) {

    }


    @Given("sends post request for user data")
    public void sends_post_request_for_user_data() {
        expectedData = new RegisterObject(ReusableMethods.createDateOfBirth(),fakerCity,"MALE",ReusableMethods.createName(),ReusableMethods.createPassword(),ReusableMethods.createPhone(),ssnFormat,ReusableMethods.createSurname(),ReusableMethods.createUserName());
        //  response = given(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("gets the user data and assert")
    public void gets_the_user_data_and_assert() {

    }




}
