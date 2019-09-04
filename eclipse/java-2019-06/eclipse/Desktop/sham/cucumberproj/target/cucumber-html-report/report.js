$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_b6b.01.07/eclipse/java-2019-06/eclipse/Desktop/sham/cucumberproj/Features99/demo1.feature");
formatter.feature({
  "name": "BDC validation on demoshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registerd user access to cart in demowebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user launched demowebshop app in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "BDC_Demo1_definnations.user_launched_demowebshop_app_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the item of his choice",
  "keyword": "Then "
});
formatter.match({
  "location": "BDC_Demo1_definnations.user_searches_for_the_item_of_his_choice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds that item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "BDC_Demo1_definnations.adds_that_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Rgisterd user acess track the orderd item in demo shop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has already placed an order for his favourite item",
  "keyword": "Given "
});
formatter.match({
  "location": "BDC_Demo1_definnations.user_has_already_placed_an_order_for_his_favourite_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User tries to access the order trackling dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "BDC_Demo1_definnations.user_tries_to_access_the_order_trackling_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies the login status",
  "keyword": "Then "
});
formatter.match({
  "location": "BDC_Demo1_definnations.verifies_the_login_status()"
});
formatter.result({
  "status": "passed"
});
});