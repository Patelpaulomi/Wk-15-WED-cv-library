
Feature: Home Page Test
  As a User I want to verify job search result using different data sets
 @sanity @regression
  Scenario Outline: User should verify the job search result using different data provided
    Given  I am on homepage
    When   I accept cookies
    And    I enter job title "<jobTitle>"
    And    I enter Location "<Location>"
    And    I select distance "<Distance>"
    And    I click on moreSearchOptionsLink
    And    I enter salaryMin "<SalaryMin>"
    And    I enter salaryMax "<SalaryMax>"
    And    I select salaryType "<Salary Type>"
    And    I select jobType "<JobType>"
    And    I click on 'Find Jobs' button
    Then   I verify the result "<VerifyMessage>"

    Examples:
      | jobTitle               | Location | Distance | SalaryMin | SalaryMax | Salary Type | JobType   | VerifyMessage                                  |
      | Tester                 | Harrow   | 5 miles  | 40000     | 60000     | Per annum   | Permanent | Permanent Tester jobs in Harrow                |
      | Accountant             | Harrow   | 5 miles  | 30000     | 60000     | Per annum   | Permanent | Permanent Accountant jobs in Harrow            |
      | Account Manager        | Wembley  | 7 miles  | 2500      | 5000      | Per month   | Permanent | Permanent Account Manager jobs in Wembley      |
      | Software Engineer      | Harrow   | 10 miles | 40000     | 100000    | Per annum   | Permanent | Permanent Software Engineer jobs in Harrow      |
      | Software Test Engineer | Harrow   | 15 miles | 50000     | 80000     | Per annum   | Permanent | Permanent Software Test Engineer jobs in Harrow |
      | Bank Manager           | Harrow   | 7 miles  | 40000     | 60000     | Per annum   | Permanent | Permanent Bank Manager jobs in Harrow           |


