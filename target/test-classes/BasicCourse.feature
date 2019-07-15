@BasicCourseTest
Feature: Basic Course Fuctionality

  Scenario: Verification of Basic Course
    Given Open browser and launch application on chrome
    When I click on basic course
    Then verify basic grid gate page appears
    When I click on green box
    Then verify frame dungeon page appears
    When I goto main frame
    And I get color of box1 and box2 until they have same color
    Then I verify drag page appears
    When I put drag me into drop box
    And I click on proceed link
    Then verify windows page appears
    When I launch popup window
    And I fill the name "mukul varshney" into the form and perform click
    Then verify windows page appears
    And I click on proceed
    Then I verify cookie handling page appears
    When I generate token by clicking on generate token link
    And I add this token as a cookie
    And perform click on proceed
    Then I verify End of Tatoc appears