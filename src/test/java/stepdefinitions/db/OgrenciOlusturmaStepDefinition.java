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

public class OgrenciOlusturmaStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42:5432", "school_management", "select_user", "43w5ijfso");
    }

    @When("Vice Dean rolu ile olusturulmus ogrenci student tablosunda username ile bulunur US15")
    public void deanRoluIleOlusturulmusOgrenciStudentTablosundaIleBulunurUS() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student WHERE username = username;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }

    @Then("Ogrencinin bilgileri dogrulanir US15")
    public void ogrencininBilgileriDogrulanirUS() throws SQLException {
        // assertEquals(0, resultSet.getInt("advisor_teacher_id"));
        assertEquals("", resultSet.getString("birth_day"));
        assertEquals("", resultSet.getString("birth_place"));
        assertEquals("", resultSet.getString("email"));
        assertEquals("", resultSet.getString("father_name"));
        assertEquals("", resultSet.getString("gender"));
        assertEquals("", resultSet.getString("mother_name"));
        assertEquals("", resultSet.getString("name"));
        // assertEquals("", resultSet.getString("password"));
        assertEquals("", resultSet.getString("phone_number"));
        assertEquals("", resultSet.getString("ssn"));
        assertEquals("", resultSet.getString("surname"));
        assertEquals("", resultSet.getString("username"));
    }

    @Then("Database baglantisi kesilir")
    public void databaseBaglantisiKesilir() {
        JDBCUtils.closeConnectionAndStatement();
    }

}
