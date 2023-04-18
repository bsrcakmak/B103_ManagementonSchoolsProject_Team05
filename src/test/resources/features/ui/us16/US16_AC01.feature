@us16
Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir

  @us16_tc01 @smoketest
  Scenario: Vice Dean'in kullanicilarin gonderdigi mesaj yazarlarini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesaj yazarlarinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us16_tc02 @smoketest
  Scenario: Dean'in kullanicilarin gonderdigi mesaj yazarlarina ait emailleri gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us16_tc03 @smoketest
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin gonderilme tarihini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us16_tc04 @smoketest
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin subject bilgisini gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us16_tc05 @smoketest
  Scenario: Dean'in kullanicilarin gonderdigi mesajlari gorebilmeli
    And Vice Dean Menu butonuna tiklar
    And Vice Dean Contact Get All yazisina tiklar
    Then Vice Dean sayfada mesajlarin goruntulendigini dogrular
    Then Sayfa kapatilir

