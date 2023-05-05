@US07_DB
Feature: US02 Admin Guest User List

  Scenario Outline: US02 AC01 Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli

    Given Database baglantisi kurulur US07
    Given Send query to get guest user by id "<id>"
    Then body should be like: username="<username>" ssn="<ssn>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>"

    Examples:
      | id  | username   | ssn         | name | surname | birthDay   | birthPlace | phoneNumber  | gender |
      | 150 | johndoe123 | 111-11-1114 | John | Doe     | 2023-04-01 | New York   | 333-333-9876 | MALE   |