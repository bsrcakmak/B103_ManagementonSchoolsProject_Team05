package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class DeanOlusturmaStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Dean {string} bilgisi ile cagrilir")
    public void dean_bilgisi_ile_cagrilir(String username) throws SQLException {
        statement = JDBCUtils.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE username = "+ username +";");
        resultSet.next();
    }


    @Then("Dean'in bilgileri dogrulanir: id={string}, username={string}, name={string}, surname={string}, birthDay={string}, ssn={string}, birthPlace={string}, phoneNumber={string}, gender={string}")
    public void deanInBilgileriDogrulanirIdUsernameNameSurnameBirthDaySsnBirthPlacePhoneNumberGender(String id, String username, String name, String surname, String birthDay, String birthPlace, String ssn, String phoneNumber, String gender) throws SQLException {
        assertEquals(id, resultSet.getString("id"));
        assertEquals(username,resultSet.getString("username"));
        assertEquals(name,resultSet.getString("name"));
        assertEquals(surname,resultSet.getString("surname"));
        assertEquals(birthDay,resultSet.getString("birthDay"));
        assertEquals(ssn,resultSet.getString("ssn"));
        assertEquals(birthPlace,resultSet.getString("birthPlace"));
        assertEquals(phoneNumber,resultSet.getString("phoneNumber"));
        assertEquals(gender,resultSet.getString("gender"));
    }
}
