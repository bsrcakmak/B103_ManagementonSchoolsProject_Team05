package stepdefinitions.db;

import io.cucumber.java.en.Then;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.Statement;


public class VicedeanOlusturmaStepDef {
    Statement statement;
    ResultSet resultSet;

    @Then("Dean rolu ile belirlenmis Vicedean Vicedean tablosunda username ile bulunur")
    public void dean_rolu_ile_belirlenmis_vicedean_vicedean_tablosunda_username_ile_bulunur() {
        statement= JDBCUtils.createStatement();

    }

    @Then("Vicedean bilgileri dogrulanir")
    public void vicedean_bilgileri_dogrulanir() {

    }
}
