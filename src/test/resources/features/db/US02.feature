@US02_DB
Feature: Admin Guest User List

  @db_smoke_test @db_smoke_test
  Scenario: Admin, olusturulan Guest User bilgilerini gorebilmeli ve dogrulamali
    Given Database baglantisi kurulur
    When Guest User id bilgisi ile cagrilir
    Then Guest User'in bilgileri dogrulanir
    Then Database baglantisi kesilir

