package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.CreateMessagePojo;
import utilities.BaseURL;

public class ContactMessageStepDefinition extends BaseURL {

    public static Faker faker;
    CreateMessagePojo expectedData;
    Response response;
    JsonPath actualData;
    @Given("Mesaj gonderebilmek icin endpoint hazirlanir US{int}")
    public void mesajGonderebilmekIcinEndpointHazirlanirUS(int arg0) {
    }

    @When("Data hazirlanir US{int}")
    public void dataHazirlanirUS(int arg0) {
    }

    @And("Post request gonderilir US{int}")
    public void postRequestGonderilirUS(int arg0) {
    }

    @Then("Hazirlanan data ile mesaj gonderildigi dogrulanir US{int}")
    public void hazirlananDataIleMesajGonderildigiDogrulanirUS(int arg0) {
    }

    @When("Name alani bos birakilarak data hazirlanir US{int}")
    public void nameAlaniBosBirakilarakDataHazirlanirUS(int arg0) {
    }

    @Then("Hazirlanan data ile mesaj gonderilemedigi dogrulanir US{int}")
    public void hazirlananDataIleMesajGonderilemedigiDogrulanirUS(int arg0) {
    }

    @When("Email alani bos birakilarak data hazirlanir US{int}")
    public void emailAlaniBosBirakilarakDataHazirlanirUS(int arg0) {
    }

    @When("Email alanina invalid deger girilerek data hazirlanir US{int}")
    public void emailAlaninaInvalidDegerGirilerekDataHazirlanirUS(int arg0) {
    }


    @Given("Mesajlari gorebilmek icin endpoint hazirlanir US{int}")
    public void mesajlariGorebilmekIcinEndpointHazirlanirUS(int arg0) {
    }

    @And("Get request gonderilir US{int}")
    public void getRequestGonderilirUS(int arg0) {
    }
}
