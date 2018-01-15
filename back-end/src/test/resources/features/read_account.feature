Feature: read account

Scenario: a customer should be able to read his account
    Given I am a customer with "100.0" on my account "TEST_002" 
    When I check my account "TEST_002"
    Then my balance should be "100.0"
