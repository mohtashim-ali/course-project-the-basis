# Scenario Walkthrough

The program beings with the WalksthroughCustomInput class which acts as a controller. It's role is to receive the user's expression, alongside ensuring the input is valid for the Input.InputProcessor class.

In Input.InputProcessor, the input string is converted recursively into the most basic type of expression which will allow for the Expression.ExpressionHandler class to compute the answer. In the Expression.Expression class, the answer is computed using the rules from Expression.ExpressionHandler. These rules include addition, subtraction, multiplication, division alongside order of operation rules.

Finally, the Input.WalkthroughCustomInput class receives the computed calculation, and prints it into the console.
