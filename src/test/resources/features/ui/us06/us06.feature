Feature: Dean_Vice_Dean_hesabi_olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Kullanaıc Menu butonuna tıklar.
    Then Kullancı açılan menüden Dean Management e tıklar.
  @US06_TC01
  Scenario:Dean_Olusturma
    Then Kullancı Name alanına isim girer.
    Then Kullanıcı Surname alanına soyisim girer.
    Then Kullanıcı Birth Place alanına doğum yeri girer.
    Then Kullanıcı Gender alanından cinsiyet seçer.
    Then Kulancı Date Of Birth alanına doğum tarihi girer.
    Then Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    Then Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And Kullancı User Name alanına user name girer
    And Kullancı Password alanına uygun formatta şifre girer.
    And Kullanıcı Submit butonuna tıklar.



