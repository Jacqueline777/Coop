Feature:  Get All Locations
 @sanral
  Scenario: Verify successful get all locations
    Given I access the endpoint "https://qamobileapp.sanral.co.za/TransitAPI/api/v1/FairPay/locations" "getalllocations"
    And headers are "accept, application/json:Content-Type, application/json:Authorization,Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJGYWlyUGF5IiwiYXVkIjoiVHJhbnNpdEFQSSIsIm5iZiI6MTcxNDcyMTY0OCwiZXhwIjoxNzE0ODIyNjQ4LCJpYXQiOjE3MTQ3MjI2NDh9.zXj29UD6vUe8AKTdZVX3BxRE0w7u6KHUJQZHZGoAoPE" "sendotp"
   When I send the request ":" "getalllocations"
   Then I should be able to get status code of 200 "getalllocations"
    And my body should have the right response body
