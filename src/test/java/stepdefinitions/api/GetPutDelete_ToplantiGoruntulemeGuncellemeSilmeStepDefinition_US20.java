package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.ToplantiDuzenlemeGuncellemePojo;
import utilities.BaseURL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GetPutDelete_ToplantiGoruntulemeGuncellemeSilmeStepDefinition_US20 extends BaseURL {

    ToplantiDuzenlemeGuncellemePojo expectedData;
    JsonPath actualData;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Get Request

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Toplanti goruntulemek icin endpoint hazirlanir US20_TC01")
    public void toplanti_goruntulemek_icin_endpoint_hazirlanir_US20_TC01() {
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 0);
        // spec.pathParams("first", "meet", "second", "getMeetById");
        // spec.queryParam("third", 0);
    }

    @And("Get request gonderilir US20_TC01")
    public void get_request_gonderilir_US20_TC01() {
        response = given().spec(spec).when().get("/{first}/{second}/{third}");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Put Request

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Toplanti guncellemek icin endpoint hazirlanir US20_TC02")
    public void toplanti_guncellemek_icin_endpoint_hazirlanir_US20_TC02() {
        spec.pathParams("first", "meet", "second", "update", "third", 0);
        // spec.pathParams("first", "meet", "second", "update");
        // spec.queryParam("third", 0);
    }

    @And("Data hazirlanir US20_TC02")
    public void data_hazirlanir_US20_TC02() {
        expectedData = new ToplantiDuzenlemeGuncellemePojo("yyyy-MM-dd", "string", "HH:mm", "HH:mm", new ArrayList<>(Arrays.asList(0)));
    }

    @When("Put request gonderilir US20_TC02")
    public void put_request_gonderilir_US20_TC02() {
        response = given().spec(spec).when().body(expectedData).put("/{first}/{second}/{third}");
        actualData = response.jsonPath();
    }

    @Then("Hazirlanan data ile toplantinin guncellendigi dogrulanir US20_TC02")
    public void hazirlanan_data_ile_toplantinin_guncellendigi_dogrulanir_US20_TC02() {
        assertEquals(expectedData.getDate(), actualData.getString("object.date"));
        assertEquals(expectedData.getDescription(), actualData.getString("object.description"));
        assertEquals(expectedData.getStartTime() + ":00", actualData.getString("object.startTime"));
        assertEquals(expectedData.getStopTime() + ":00", actualData.getString("object.stopTime"));
        ArrayList<Integer> studentIds = new ArrayList<>();
        List<Map> studentList = response.jsonPath().getList("object.students", Map.class);
        for (Map w : studentList) {
            studentIds.add((Integer) (w.get("id")));
        }
        assertEquals(expectedData.getStudentIds(), studentIds);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Delete Request

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Toplanti silmek icin endpoint hazirlanir US20_TC03")
    public void toplanti_silmek_icin_endpoint_hazirlanir_US20_TC03() {
        spec.pathParams("first", "meet", "second", "delete", "third", 0);
        // spec.pathParams("first", "meet", "second", "delete");
        // spec.queryParam("third", 0);
    }

    @And("Delete request gonderilir US20_TC03")
    public void delete_request_gonderilir_US20_TC03() {
        response = given().spec(spec).when().delete("/{first}/{second}/{third}");
    }

}
