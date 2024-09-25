Feature: Swag Labs Catalog

  Scenario: Successful loading of the product list page
    Given  the user is on the product list page
    Then the system displays the title “Product List”
    And the system displays at least one product


  Scenario: Navigating to product details
    Given the user is on the product list page
    When the user clicks on the product labeled “Sauce Labs Backpack”
    Then The system redirects the user to the product details page


  Scenario: Adding a product into cart
    Given the user is on the product list page
    When the user clicks the "Add to cart" button
    Then the product is added to the user's cart

  Scenario: Returning to the product list page
    Given the user is on the product details page
    When the user clicks the "Back to products" button
    Then the system redirects the user to the product list page








# Додайте сюди сценарії, які перевіряють сторінку зі списком товарів, а також сторінку з деталями товару
# Подумайте, які з них ви покрили б в першу чергу, що важливо користувачу інтенет-магазину? Що важливо власнику інтернет-магазину?
