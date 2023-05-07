@us04_db
  Feature:Admin dean ekleyebilmeli
    Scenario: Olusturulan Dean'i dogrula
      Given Database baglantisi kurulur
      And Dean "<username>" bilgisi ile cagrilir
      Then Dean'in bilgileri dogrulanir: id="<id>", username="<username>", name="<name>", surname="<surname>", birthDay="<birthDay>", ssn="<ssn>", birthPlace="<birthPlace>", phoneNumber="<phoneNumber>", gender="<gender>"
      #Then Database baglantisi kesilir

      Examples:
        | id | username  | name | surname | birthDay   |     ssn     | birthPlace | phoneNumber  | gender |
        #|402 |   emmaB   | emma |  brown  | 1999-06-12 | 543-57-9753 |   london   | 123-343-6549 | FEMALE |
        | 301    | johndoe11 | John | Doe     | 2023-05-01 | 333-87-3456 | New York   | 333-908-0964 | MALE   |

