package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeanOlusturmaStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Database ile baglanti kurulur")
    public void database_ile_baglanti_kurulur() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42:5432", "school_management", "select_user", "43w5ijfso");
    }
    @Given("Dean {string} bilgisi ile cagrilir")
    public void dean_bilgisi_ile_cagrilir(String username) throws SQLException {
        statement = JDBCUtils.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE username = "+ username +";");
        resultSet.next();
    }

    @Then("Dean'in bilgileri dogrulanir: userId={string}, username={string}, name={string}, surname={string}, birthDay={string}, ssn={string}, birthPlace={string}, phoneNumber={string}, gender={string}")
    public void deanBilgileriDogrulanir(String id, String username, String name, String surname, String birthday, String birthPlace, String phone, String ssn, String gender) {

    }

}
