  Feature: osCommerce Signup features testing

  Scenario Outline: User will provide all the real informations to signup in the website
    Given User will on the Signup page
    When User will click on MyAccount button
    And User will click Continue button
    And User will select Male radio button 
    And User will put Date of Birth
    And User will enter "<FirstName>"  "<LastName>"  "<EMail>"  "<Street>"  "<PostCode>"  "<City>"  "<State>"  "<Telephone>" 
    And User will select country name
    And User will put "<Password>"  "<CPassword>" 
    And User will click on continue
    And User will varify
    
    
    Then User will quit the Browser

    Examples: 
      | FirstName  | LastName |  EMail            | Street           | PostCode | City     |State| Telephone |  Password | CPassword    |
      | test2      | test@2   |  r478545344@gmail.com| 142 w 7th street | 11204    | Brooklyn |NY   | 123456784 |  test234  | test234      |
