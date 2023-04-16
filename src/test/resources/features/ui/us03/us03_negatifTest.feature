Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc07
  Scenario: Kullanici mail gonderme bolumune Name girebilmeli
    And kullanici Your Name alanini bos birakir
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc08
  Scenario: Kullanici mail gonderme bolumune Name girebilmeli
    And kullanici Your Name alanina space karakteri girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc10
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina . icermeyen bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc11
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina @ icermeyen bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc12
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina "." sonrasi bos deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc14
  Scenario: Kullanici mail gonderme bolumune Subject girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanini bos birakir
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc15
  Scenario: Kullanici mail gonderme bolumune Message girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanini bos birakir
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir
