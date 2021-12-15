$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5329019100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should able to see \"Welcome, Please Sign In!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 77102400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1115494300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 22
    }
  ],
  "location": "LoginPageSteps.iShouldAbleToSee(String)"
});
formatter.result({
  "duration": 38793700,
  "status": "passed"
});
formatter.after({
  "duration": 727247800,
  "status": "passed"
});
});