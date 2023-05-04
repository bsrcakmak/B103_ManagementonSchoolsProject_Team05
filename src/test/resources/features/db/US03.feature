@US03_DB
  Feature: Kullanici mesaj gonderebilmeli
    Scenario Outline: Kullanicinin mesaj gonderebildiginin dogrulanmasi US03_DB
      Given Database baglantisi kurulur US03
      When "<email>" bilgisi ile mesaj alinir
      Then Mesaj bilgileri dogrulanir: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

      Examples:
        | name    | email                | subject | message                      | date       |
        | student | firstclass@gmail.com | Lesson  | Have is going your lesson!!! | 2023-05-16 |