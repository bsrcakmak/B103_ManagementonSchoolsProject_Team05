package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.ToplantiDuzenlemeGuncellemePojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post_ToplantiDuzenlemeStepDefinition_US19 extends BaseURL {

    ToplantiDuzenlemeGuncellemePojo expectedData;
    JsonPath actualData;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Post Request Positive Scenario

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Toplanti duzenlemek icin endpoint hazirlanir US19_TC01")
    public void toplanti_duzenlemek_icin_endpoint_hazirlanir_US19_TC01() {
        spec.pathParams("first", "meet", "second", "save");
    }

    @And("Data hazirlanir US19_TC01")
    public void data_hazirlanir_US19_TC01() {
        expectedData = new ToplantiDuzenlemeGuncellemePojo("yyyy-MM-dd", "string", "HH:mm", "HH:mm", new ArrayList<>(Arrays.asList(0)));
    }

    @When("Post request gonderilir US19_TC01")
    public void post_request_gonderilir_US19_TC01() {
        response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
        actualData = response.jsonPath();
    }

    @Then("Hazirlanan data ile toplanti olusturuldugu dogrulanir US19_TC01")
    public void hazirlanan_data_ile_toplanti_olusturuldugu_dogrulanir_US19_TC01() {
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
//        Integer id = response.jsonPath().getInt("object.id");
//        System.out.println(id);
//        ReusableMethods.deleteRequest("meet", id);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Post Request Negative Scenario

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @And("Data hazirlanir US19_TC02")
    public void data_hazirlanir_US19_TC02() {
        // expectedData = new ToplantiDuzenlemeGuncellemePojo("string", "HH:mm", "HH:mm", new ArrayList<>(Arrays.asList(0)));
        expectedData = new ToplantiDuzenlemeGuncellemePojo(null, "string", "HH:mm", "HH:mm", new ArrayList<>(Arrays.asList(0)));
    }

}
