Feature: Swag Labs Checkout

  Scenario: Buying of one product
    Given the user is logged in
    And the user is on the cart page
    And the user added one product
    When the user clicks the "Checkout" button
    And the user fills in the "First name", "Last name" and "Zip/Postal Code" fields
    And the user clicks the "Continue" button
    Then the system redirects the user to the order's description page
    When the user clicks the "Finish" button
    Then the user sees a message about a successful order


  Scenario: Error when placing an order due to missing data
    Given the user is logged in
    And the user is on the cart page
    And the cart contains at least one product
    When the user clicks the "Checkout" button
    And The user does not fill in all the necessary fields
    And the user clicks the "Continue" button
    Then the system should display the message "Error: % is required"







# Додайте сюди сценарії які перевіряють так званий Checkout Flow, тобто процес оформлення замовлення
  # Вхідною точкою можна вважати момент, коли в корзину додано хоча б один товар, вихідна точка - оформлене замовлення
  # Приклади - можна купити один окремий товар, можна купити декілька товарів в одноиму замовленні
  # Можна додавати і видаляти товари з корзини
  # При успішному оформленні замовлення має відображатися повідомлення про успішне оформлення і т.п.