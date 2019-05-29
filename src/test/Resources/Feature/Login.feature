
@login
  Feature: LoginPage
    Scenario Outline: user should not be able to login with invalid credential
      Given user is on Login Page
      When user enters invalid "<Email>" and/or "<Password>"
      Then user should able to see the "<error message>"

      Examples:
      |Email               |Password    |error message|
      |shivangip1@test.com  |shivangi123 |Login was unsuccessful. Please correct the errors and try again.No customer account found|
      |shivangip@test.com   |shivangi123 |Login was unsuccessful. Please correct the errors and try again.No customer account found|
      |shivangip1@test.com  |shivangi12  |Login was unsuccessful. Please correct the errors and try again.No customer account found|
      |shivangip1@test.com  |            |Login was unsuccessful. Please correct the errors and try again.No customer account found|
      |                    |shivangi123 |Please enter your email|
      |shivangip12@test.com |shivangi1234|Login was unsuccessful. Please correct the errors and try again.No customer account found|

