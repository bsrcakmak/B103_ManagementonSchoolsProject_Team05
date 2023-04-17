Feature: Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Dean rolu ile login islemi gerceklestirilir

    # BUG -> Delete butonu yok
  @us07_tc06
  Scenario: Dean'in kullanicilarin gonderdigi mesajlari silebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    And Dean Delete butonuna tiklar
    Then Dean sayfada istedigi mesajin silindigini dogrular
