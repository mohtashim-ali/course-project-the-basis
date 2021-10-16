# Scenario Walkthrough

The program beings with the WalksthroughCustomInput class which acts as a controller. It's role is to recieve the user's expression, alongside ensuring the input is valid for the InputProcessor class.

In InputProcessor, the input string is converted recursively into the most basic type of expression which will allow for the ExpressionHandler class to compute the answer. In the Expression class, the answer is computed using the rules from ExpressionHandler. These rules include addition, subtraction, multiplication, division alongside order of operation rules.

Finally, the WalkthroughCustomInput class recieves the computed calcualtion, and prints it into the console.

