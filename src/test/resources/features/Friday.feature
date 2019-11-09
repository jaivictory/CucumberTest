Feature: is_it_friday_yet?
  Everybody want to know is it's friday
  @friday
  Scenario Outline: Today is or is not friday
    Given today is "<day>"
    When i ask wheter it's friday yet
    Then  i should be told "<answer>"
    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |
