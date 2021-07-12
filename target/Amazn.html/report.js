$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon.feature");
formatter.feature({
  "name": "Validating Amazon Add to cart page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "vaidating product product from addTOcart is removed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on Amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_am_on_Amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to enter userName and Password and Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_need_to_enter_userName_and_Password_and_Click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to validate MY username is present on right side header page of Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_need_to_validate_MY_username_is_present_on_right_side_header_page_of_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to search for a product",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_need_to_search_for_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to click a particular product from search list and add to card",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.i_need_to_click_a_particular_product_from_search_list_and_add_to_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to verify Product is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_need_to_verify_Product_is_added_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "GO back to cart page and remove product from cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.go_back_to_cart_page_and_remove_product_from_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to verify that product is removed from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_need_to_verify_that_product_is_removed_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
});