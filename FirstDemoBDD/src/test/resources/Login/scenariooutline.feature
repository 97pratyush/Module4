Feature: Display Welcome Message to User

  Scenario Outline: Display welcome message on login to user
    Given User is on log in page
    When user enters <uname> and <password>
    Then Display  <msg> <uname>

    Examples: 
      | uname   | password | msg   |
      | Varsha  | Pass123  | Hi    |
      | Manisha | Pass234  | Hello |
