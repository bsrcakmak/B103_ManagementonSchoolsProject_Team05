Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir

  @us16_tc01 @Smoke_test
  Scenario: Vice Dean'in kullanicilarin gonderdigi mesaj yazarlarini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesaj yazarlarinin goruntulendigini dogrular

  @us16_tc02 @Smoke_test
  Scenario: Dean'in kullanicilarin gonderdigi mesaj yazarlarina ait emailleri gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular

  @us16_tc03 @Smoke_test
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin gonderilme tarihini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular

  @us16_tc04 @Smoke_test
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin subject bilgisini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular

  @us16_tc05 @Smoke_test
  Scenario: Dean'in kullanicilarin gonderdigi mesajlari gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin goruntulendigini dogrular

