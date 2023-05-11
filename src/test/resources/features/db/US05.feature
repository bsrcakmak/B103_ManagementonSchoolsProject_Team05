@us05_db
Feature:Admin dean ekleyebilmeli

  @db_smoke_test
  Scenario: Olusturulan Dean'i dogrula
    Given Database baglantisi kurulur
    And Dean username bilgisi ile cagrilir
    Then Dean'in bilgileri dogrulanir
    Then Database baglantisi kesilir
      #Then Database baglantisi kesilir
