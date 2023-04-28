@US01_API
Feature: Register
  Background:
    Given Register için endpoint hazırlanır
    When  Admin rolü ile token oluşturulur

  @API_US01_TC01
  Scenario: Register
    And Data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 200 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulduğu doğrulanır US01

  @API_US01_TC02
  Scenario: Herhangi bir karakter içeren ve boş bırakılamayan "Name" olmalıdır.
    And Yalnızca "name" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC03
  Scenario: Herhangi bir karakter içeren ve boş bırakılamayan "Surname" olmalıdır.
    And Yalnızca "surname" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC04
  Scenario: Herhangi bir karakter içeren ve boş bırakılamayan "Birth Place" olmalıdır.
    And Yalnızca "birthPlace" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC05
  Scenario: Kullanıcı telefon numarasını girebilmelidir.
    And Yalnızca "phoneNumber" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC06
  Scenario: Kullanıcı telefon numarasını girebilmelidir.
    And Yalnızca "phoneNumber" alanına 12 karakterden az deger girerek data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC07
  Scenario: Kullanıcı cinsiyetini seçebilmelidir.
    And Yalnızca "gender" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC08
  Scenario: Kullanıcı doğum tarihini girebilmelidir.
    And Yalnızca "birthDay" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC09
  Scenario: Kullanıcı doğum tarihini girebilmelidir.
    And Yalnızca "birthDay" alanına gecersiz formatta data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC10
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    And Yalnızca "ssn" alanı SSN alanina gecersiz formatta deger girerek data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC11
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    And Yalnızca "username" alanı boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01

  @API_US01_TC12
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Yalnızca "password" alanına 7 karakter girerek boş bırakılarak data hazırlanır US01
    And Post request gönderilir US01
    Then Status Code’unun 400 olduğu doğrulanır
    Then Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01





