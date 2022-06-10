Feature: Login functionality
@tag1
  Scenario Outline: Login
    Given I have browser opened and url is navigated
    When User Navigate to LogIn Page
    Then User enters email and password in signin page
    |    Email                    | Password      |  
    |  singhraushan0000@gmail.com |   rajput      | 
    |  ajinkepensalwar@gmail.com  | 8073198885@aAb|
    |  biswojit@gmail.com         |   biswojit8888|
    | Kshitij@gmail.com           |  kshitij@123  | 
    
  
