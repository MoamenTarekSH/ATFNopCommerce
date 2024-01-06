Feature: user can create a new account and add item to cart then make checkout

  Scenario Outline: Checkout for an item
    Given i open home page
    When i click on Register link
    And i entered "<FirstName>" , "<LastName>" , "<Email>" , "<Password>"
    And i searche for "<ItemName>"
    And Add item to cart
    And i make checkout for item
    And confirm Cridet card
    Then I print pdf Innvoice

    Examples: 
      | FirstName | LastName | Email           | Password | ItemName                          |
      | demo4     | demoo4   | demo5@gmail.com |  0123456 | HTC One M8 Android L 5.0 Lollipop |
