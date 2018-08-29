$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/prakashd/New_Workspace_Automation/Chif/src/test/java/ChifProj/chif.feature");
formatter.feature({
  "line": 1,
  "name": "Chif Automation Test",
  "description": "",
  "id": "chif-automation-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open chif url",
  "description": "",
  "id": "chif-automation-test;open-chif-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open chif url",
  "keyword": "Given "
});
formatter.match({
  "location": "ChifUsersModule.Chif_url()"
});
formatter.result({
  "duration": 8004521316,
  "status": "passed"
});
formatter.after({
  "duration": 132569,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login using username and password",
  "description": "",
  "id": "chif-automation-test;login-using-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I login with excel row \"1\" dataset",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "ChifUsersModule.Chif_login(String)"
});
formatter.result({
  "duration": 6903662811,
  "status": "passed"
});
formatter.after({
  "duration": 80967,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Create New Case",
  "description": "",
  "id": "chif-automation-test;create-new-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@NewCase"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Create New Case with excel row \"3\" dataset",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 32
    }
  ],
  "location": "ChifUsersModule.Create_Case(String)"
});
formatter.result({
  "duration": 122687315883,
  "status": "passed"
});
formatter.after({
  "duration": 27370,
  "status": "passed"
});
});