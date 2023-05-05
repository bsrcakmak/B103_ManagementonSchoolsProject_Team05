package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class MesajOlusturmaStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Database baglantisi kurulur US03")
    public void databaseBaglantisiKurulurUS03() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42:5432", "school_management", "select_user", "43w5ijfso");
    }

    @When("{string} bilgisi ile mesaj alinir")
    public void bilgisiIleMesajAlinir(String email) throws SQLException {

        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM contact_message WHERE email = '"+email+"';";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }

    @Then("Mesaj bilgileri dogrulanir: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void mesajBilgileriDogrulanirNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) throws SQLException {

        assertEquals(resultSet.getString("name"),name);
        assertEquals(resultSet.getString("email"),email);
        assertEquals(resultSet.getString("subject"),subject);
        assertEquals(resultSet.getString("message"),message);
        assertEquals(resultSet.getString("date"),date);
    }


}
