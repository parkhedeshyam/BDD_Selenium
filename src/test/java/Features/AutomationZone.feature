Feature: Guru99 login
 
  Scenario Outline: Login with different credentials.
    Given User is on Guru99 demo application
    When USer enter the "<un>" and "<pwd>"
    And User clicks on the login button..
    Then User is on the home page

    Examples:
    |  un    |  pwd  |
    | amit1  | amit1 |
    | amit2  | amit3 |
   
    