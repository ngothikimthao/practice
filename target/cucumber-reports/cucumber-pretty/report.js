$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login customer page",
  "description": "",
  "id": "login-page;login-customer-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open website https://www.phptravels.net/admin",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I input email as thao.ngopn@gamil.com and password as kimthao",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click submit",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.phptravels.net/admin",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 12986745400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thao.ngopn@gamil.com",
      "offset": 17
    },
    {
      "val": "kimthao",
      "offset": 54
    }
  ],
  "location": "LoginTest.setUserInformation(String,String)"
});
formatter.result({
  "duration": 2507264000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clickLogin()"
});
formatter.result({
  "duration": 151231700,
  "status": "passed"
});
});