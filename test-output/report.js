$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/API.feature");
formatter.feature({
  "name": "This feature would be used to test the API Requests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.scenario({
  "name": "Get All Products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8082/medicare/json/data/all/products\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APIstepdef.the_base_uri_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Perform the Get Operation",
  "keyword": "When "
});
formatter.match({
  "location": "APIstepdef.i_perform_the_get_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "APIstepdef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get Analgesics Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8082/medicare/json/data/category/2/products\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APIstepdef.the_base_uri_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Perform the Get Operation",
  "keyword": "When "
});
formatter.match({
  "location": "APIstepdef.i_perform_the_get_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "APIstepdef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get Most Viewed Medicines",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8082/medicare/json/data/mv/products\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APIstepdef.the_base_uri_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Perform the Get Operation",
  "keyword": "When "
});
formatter.match({
  "location": "APIstepdef.i_perform_the_get_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "APIstepdef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get Most Purchased Medicines",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8082/medicare/json/data/mp/products\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APIstepdef.the_base_uri_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Perform the Get Operation",
  "keyword": "When "
});
formatter.match({
  "location": "APIstepdef.i_perform_the_get_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "APIstepdef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});