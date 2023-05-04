@us04_db
  Feature:Admin dean ekleyebilmeli
    Scenario: Olusturulan Dean'i dogrula
      Given Database ile baglanti kurulur
      And Dean "<username>" bilgisi ile cagrilir
      Then Dean'in bilgileri dogrulanir: userId="<userId>", username="<username>", name="<name>", surname="<surname>", birthDay="<birthDay>", ssn="<ssn>", birthPlace="<birthPlace>", phoneNumber="<phoneNumber>", gender="<gender>"

      Examples:
        | userId | username  | name | surname | birthDay   | ssn | birthPlace | phoneNumber  | gender |




