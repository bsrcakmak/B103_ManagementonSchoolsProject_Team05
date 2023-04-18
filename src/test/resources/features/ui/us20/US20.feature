@us20
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.

  Background:
    Given Site adresine gidilir
    When Teacher rolu ile login islemi gerceklestirilir
    And teacher menu butonuna tiklar
    And teacher Meet Management butonuna tiklar
    And teacher Meet List alanini gorur.

  @us20_tc01 @smoketest
  Scenario: TC_01 Teacher, toplantıların Date kismini görebilmeli
    And teacher Date bolumunu gorur.
    Then Sayfa kapatilir

  @us20_tc02 @smoketest
  Scenario: TC_02 Teacher, toplantıların Start time kismini görebilmeli
    And teacher Start Time bolumunu gorur
    Then Sayfa kapatilir

  @us20_tc03 @smoketest
  Scenario: TC_03 Teacher, toplantıların Stop Time kismini görebilmeli
    And teacher Stop Time bolumunu gorur.
    Then Sayfa kapatilir

  @us20_tc04 @smoketest
  Scenario: TC_04 Teacher, toplantıların Description kismini görebilmeli
    And teacher Description bolumunu gorur.
    Then Sayfa kapatilir

  @us20_tc05 @smoketest
  Scenario: TC_05 Teacher, toplantıları güncelleyebilmeli
    And teacher choose studentdan  ogrenci secer
    And teacher Date Of Meet bolumune gelecek bir tarih girer
    And teacher Start Time alanina gecerli bir deger girer
    And teacher Stop Time alaninagecerli bir deger girer
    And teacher description alanina gecerli  bir metin girer
    And teacher Submite tiklar.
    And teacher Meet List alani gorur.
    And teacher toplanti olusturdugunu dogrular.
    And teacher Edit alanina tiklar.
    And teacher  Start Time bolumde degisiklik yapar.
    And teacher description alanina anlamli bir metin girer
    And teacher Submit butonu tiklar.
    Then teacher "Updated Successful" popUp mesaji goruntuler.
    Then Sayfa kapatilir

  @us20_tc06 @smoketest
  Scenario: TC_06 Teacher, toplantıları güncelleyebilmeli
    And teacher choose student  bolumunden ogrenci secer
    And teacher Date_Of_Meet bolumune gelecek bir tarih girer
    And teacher Start Time kutucuguna gecerli bir deger girer
    And teacher Stop Time alanina gecerli bir deger girer
    And teacher description alanina_gecerli bir metin girer
    And teacher Submit butonuna  tiklar.
    And teacher Meet List  alanini  gorur.
    And teacher toplanti olusturdgunu dogrular.
    And  teacher Edit Butonuna  tiklar.
    And teacher Start_Time bolumde degisiklik yapar.
    And teacher  Description alanini bos birakir.
    Then teacher requared yazisinin  gorundugunu dogrular.
    Then Sayfa kapatilir

  @us20_tc07
  Scenario: TC_07 Teacher, toplantıları güncelleyebilmeli
    And teacher choose student bolumunden student secer
    And teacher Date Of Meete gelecek bir tarih girer
    And teacher Start Time a gecerli bir deger girer
    And teacher Stop Time a gecerli bir deger girer
    And teacher descriptiona gecerli  bir metin girer
    And teacher Submit butonuna  tiklar.
    And teacher Meet List alanini  gorur.
    And teacher toplanti  olusturdugunu dogrular.
    And  teacher Edit  Butonuna tiklar.
    And teacher Start Time bolumunde degisiklik yapar.
    And teacher  Description alanini bos birakir.
    Then teacher requared  yazisinin gorundugunu dogrular.
    Then Sayfa kapatilir

  @us20_tc08 @smoketest
  Scenario: TC_08 Teacher, toplantıları silebilmelidir.
    And teacher choose  student bolumunden ogrenci secer
    And teacher Date Of Meet alanina ileri bir tarih girer
    And teacher Start Time alanina ileri bir deger girer
    And teacher Stop Time kutuvuguna gecerli bir deger girer
    And teacher description kutucuguna gecerli  bir metin girer
    And teacher Submit butonna tiklar.
    And teacher Meet List alanni gorur.
    And teacher toplanti olusturdugnu dogrular.
    And teacher Delete  butonuna tiklar.
    Then teacher toplanti  bilgisinin basariyla silindi mesajinin gorundugunu dogrular
    Then Sayfa kapatilir