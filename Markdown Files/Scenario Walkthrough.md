# Scenario Walkthrough

The program beings with the WalksthroughCustomInput class which acts as a controller. It's role is to receive the user's expression, alongside ensuring the input is valid for the UseCase.InputProcessor class.

In UseCase.InputProcessor, the input string is converted recursively into the most basic type of expression which will allow for the UseCase.BasicOperations.ExpressionHandler class to compute the answer. In the Entity.Expression class, the answer is computed using the rules from UseCase.BasicOperations.ExpressionHandler. These rules include addition, subtraction, multiplication, division alongside order of operation rules.

Finally, the UI.WalkthroughCustomInput class receives the computed calculation, and prints it into the console.
