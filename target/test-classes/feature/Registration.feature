@dev
Feature: User Registration

  Scenario: Register multiple users to Formy
    Given user is on Formy Registration page
    When user register below users as list
      | Aravinda | HB  | IT-Employee    | High School | Male   | 10+ | 03/22/2024 |
      | Basava   | Raj | NonIT-Employee | Grad School | Male   | 5-9 | 03/22/2024 |
      | Harry    | L   | Business       | College     | Male   | 10+ | 03/22/2024 |
      | Sneha    | L   | IT-Employee    | High School | Female | 10+ | 03/22/2024 |
      | Raksha   | L   | IT-Employee    | High School | Female | 0-1 | 03/22/2024 |
    And close the Browser

  Scenario: Register multiple users to Formy
    Given user is on Formy Registration page
    When user register below users as Map
      | firstname | lastname | jobtitle       | edu         | sex    | exp | date       |
      | Aravinda  | HB       | IT-Employee    | High School | Male   | 10+ | 03/22/2024 |
      | Basava    | Raj      | NonIT-Employee | Grad School | Male   | 5-9 | 03/22/2024 |
      | Harry     | L        | Business       | College     | Male   | 10+ | 03/22/2024 |
      | Sneha     | L        | IT-Employee    | High School | Female | 10+ | 03/22/2024 |
      | Raksha    | L        | IT-Employee    | High School | Female | 0-1 | 03/22/2024 |
    And close the Browser