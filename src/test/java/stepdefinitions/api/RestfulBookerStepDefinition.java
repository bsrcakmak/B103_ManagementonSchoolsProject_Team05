package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.RestfulBookerBookingDatesPojo;
import pojos.RestfulBookerRequestPojo;
import pojos.RestfulBookerResponsePojo;
import utilities.BaseURL;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class RestfulBookerStepDefinition extends BaseURL {

    RestfulBookerRequestPojo expectedData;
    Response response;
    RestfulBookerResponsePojo actualData;

    @Given("Endpoint hazirlanir")
    public void endpoint_hazirlanir() {
        spec.pathParam("first", "booking");
    }

//    @When("Token uretilir")
//    public void token_uretilir() {
//        spec.header("Cookie", "token=" + generateToken());
//    }

    @And("Data hazirlanir")
    public void data_hazirlanir() {
        RestfulBookerBookingDatesPojo bookingDates = new RestfulBookerBookingDatesPojo("2018-01-01", "2019-01-01");
        expectedData = new RestfulBookerRequestPojo("Jim", "Brown", 111, true, bookingDates, "Breakfast");
    }

    @When("Request gonderilip response alinir")
    public void request_gonderilip_response_alinir() {
        response = given().spec(spec).when().body(expectedData).post("/{first}");
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), RestfulBookerResponsePojo.class);
    }

    @Then("Assertion yapilir")
    public void assertion_yapilir() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getFirstname(), actualData.getBooking().getFirstname());
        assertEquals(expectedData.getLastname(), actualData.getBooking().getLastname());
        assertEquals(expectedData.getTotalprice(), actualData.getBooking().getTotalprice());
        assertEquals(expectedData.getDepositpaid(), actualData.getBooking().getDepositpaid());
        assertEquals(expectedData.getBookingdates().getCheckin(), actualData.getBooking().getBookingdates().getCheckin());
        assertEquals(expectedData.getBookingdates().getCheckout(), actualData.getBooking().getBookingdates().getCheckout());
        assertEquals(expectedData.getAdditionalneeds(), actualData.getBooking().getAdditionalneeds());
    }

}
