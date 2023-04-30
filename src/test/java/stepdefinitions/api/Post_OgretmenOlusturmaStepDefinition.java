package stepdefinitions.api;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseURL;

public class Post_OgretmenOlusturmaStepDefinition extends BaseURL {

    @Given("Vice Dean ogretmen olusturmak icin end pointe gider US13_TC01")
    public void vice_dean_ogretmen_olusturmak_icin_end_pointe_gider_us13_tc01() {

        spec.pathParams("pp1","teachers","pp2","save");
    }
    @When("Request’te gönderilecek olan data hazırlanır US13_TC01")
    public void request_te_gönderilecek_olan_data_hazırlanır_us13_tc01() {
        
    }
    @When("Endpoint’e post request gönderilir US13_TC01")
    public void endpoint_e_post_request_gönderilir_us13_tc01() {
        
    }
    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US13_TC01")
    public void request_data_sı_ile_response_data_sının_aynı_olduğu_doğrulanır_us13_tc01() {
        
    }

    @And("Request’te gönderilecek olan data hazırlanır US{int}_TC{int}")
    public void requestTeGönderilecekOlanDataHazırlanırUS_TC(int arg0, int arg1) {
        
    }

    @And("Endpoint’e post request gönderilir US{int}_TC{int}")
    public void endpointEPostRequestGönderilirUS_TC(int arg0, int arg1) {
        
    }

    @Then("Request data’sı ile response data’sının aynı olduğu doğrulanır US{int}_TC{int}")
    public void requestDataSıIleResponseDataSınınAynıOlduğuDoğrulanırUS_TC(int arg0, int arg1) {
    }
}
