@Regression
Feature: Export Grid Buttons Feature
  User Story:As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


 Background:
   Given the user is on the Dashboard page
   When the user is on the All Cars page

  @TC001 @chrome @smoke
  Scenario: User should be able to see Export Grid dropdown
    Then the Export Grid dropdown is displayed

  @TC002 @chrome @smoke
  Scenario: User should be able to see CSV and XLSX options under Export Grid dropdown
    And the user clicks on Export Grid dropdown
    Then CSV option is displayed
    And XLSX option is displayed

  @TC003 @chrome @smoke
  Scenario: User should be able to see Refresh Button
    Then the Refresh button is displayed


