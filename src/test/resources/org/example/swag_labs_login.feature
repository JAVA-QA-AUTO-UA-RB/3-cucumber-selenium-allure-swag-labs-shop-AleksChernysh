Feature: Swag Labs User Login

  Scenario: Successful log in with correct credentials
    Given the user is on the log in page
    When the user enters valid username and password
    And the user clicks the "login" button
    Then the user should be redirected to the homepage


  Scenario: Unsuccessful log in with non-existent username
    Given the user is on the login page
    When the user enters a non-existent username and password
    And the user clicks the "login" button
    Then there should appear the text "Non-existent username! Please enter valid username and password" on the page


  Scenario: Unsuccessful log in of locked out user with correct credentials
    Given the user is on the login page
    And user is locked out
    When the user enters valid username and password
    And the user clicks the "login" button
    Then there should appear the text "The user is locked out" on the page

  Scenario: Successful log out of authorized user
    Given the user is logged
    And the user is on the home page
    When the user clicks the "logout" button
    Then the system displays a message "Are you sure you want to log out?"

    Given the user sees the confirmation message,
    When the user selects the "Yes" button,
    Then the system logs out the user, clears the session data, and redirects the user to the login page.

    Given the user sees the confirmation message,
    When the user selects the "No" button,
    Then the system closes the confirmation message, and the user remains on the homepage.




    # Перший сценарій дано як приклад
    # Допишіть сюди свої сценарії як відповідають фічі, що зараз тестується (можуть бути як позитивні так і негативні)
    # Приклади сценаріїв: логінізація з існуючим валідним користувачем, логінізація з кредами неіснуючого користувача,
    # логінізація з кредами користувача, який є заблокованим (locked_out_user)
  # Сюди має також увійти сценарії (вилогінювання/виходу/Log out) з сайту, бо ми маємо переконатися що при бажанні користувач може вийти