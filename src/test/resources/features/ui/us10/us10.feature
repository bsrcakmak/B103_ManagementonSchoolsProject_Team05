
Feature: uS_10 test Case Vice Dean ders programi olusturabilmelidir.

Scenario: Vice Dean ders programi olusturmasi.
  Given Kullanici Vice Dean olrak giris yapar.
  When Kullanici Lesson Program tiklar.
  When Kullanici ders secimi yapar.
  And Kullanici egitim donemi secimi yapar.
  And Kullanici ders gunu secer.
  And Kullanici dersin baslangic saatini girer.
  And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
  Then Kullanici Submit butonuna tiklar.
  And "Created Lesson Program" mesaji cikartigini dogrular..


