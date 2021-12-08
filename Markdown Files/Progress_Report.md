# Progress Report

Our domain is a math calculator utility hosted on a website, and below are the contents of the progress report!


## Specification

In short, our goal for phase 0 was to narrow down onto a specific goal so that we could have a strong starting point. Currently, our calculator is able to compute basic operations such as addition, subtraction, divistion and multiplication using a custom input, recursion and outputs the correct answer!

## CRC Model

#### Entity Classes

1. Entity.User - Input user data and sends to other classes
2. Gateway.History - Stores user inputs
3. Entity.Expression - Defines an expression
4. Entity.Equation - Defines an equation

#### Use Case Classes

1. UseCase.InputProcessor - Process input
2. UseCase.BasicOperations.ExpressionHandler - Error handling
3. EquationHandler - Error handling for equations
4. LinIndepHandler (Future Goal)
5. RREFHandler (Future Goal)

#### Controller Classes

1. UserHandler - Handles user information such as their input
2. UI.WalkthroughCustomInput - Accepts custom user input and outputs the answer

#### Basic Command Line

1. UI.WalkthroughCustomInput Class - Allows users to type in the console, and the output will be printed in the console
2. Calculator HTML (Future Goal)

## Scenario Walk-through

To keep it simple, first the user types in a mathematical expression, such as ```2 + 2```. Then, the input is processed to make sure it is in the valid form, sent to the UseCase.InputProcessor class where it is split up, checked for any errors, and computed. Finally, the UI.WalkthroughCustomInput class prints the computed answer.



## Skeleton Code

For our skeleton code, we focused on getting the 4 basic operations to work correctly with order of operations. We also made a controller class which can take in a custom input, and output the correct answer.

## Questions

1. Should we focus on backend for Phases 1 & 2, or is it better to have a frontend and a good enough backend?
2. How "complex" should the frontend be? Is a basic and simple design enough?

## What has worked well for our design

Several things have worked well for our design. Firstly, breaking up mathematical objects into different categories allowed us to write much cleaner and design-friendly code using handlers. With the object as our entity class and the handler holding our use cases for that object, we were able to separate the complex properties of the object from the operations that it can do. Another part that helped us was having an input processor that grabs data from our [to be] website and parses it into different objects. This controller will help bridge the gap between the user and the backend. Lastly, breaking up complicated functions and methods into interfaces or classes helped simplify the code writing process. For example, we dedicated an interface to simplify expressions. There are several ways that a mathematical expression can be broken down and simplified depending on the objects it contains. Keeping that in a single function would be far too complicated and arguably wouldn't align clean architecture designs.

## Group Member Contributions

Mohtashim

> I have been working on organzing the Github repo so it is organized, alongside creating the walkthrough class which allows for custom inputs from the console. I also worked on the specification, and the steps on how to use the calculator since I wrote the class for it. Test case file was created, alongside the formatting to make adding new test cases easier.I plan on working on adding website implementation, and allowing the user to keep on asking expressions in the walkthrough class.

Nofel

> Some of my contribution consists of writing some code in the expression and expressionHandler file while suggesting ideas on how the calculator will be formatted. I have contributed ideas about potential feature and flaws the calculator may have in the future. My primary contribution was making the CRC models. I made the CRC into a google slides presentation format while adding and removing stuff from the presentation as we went along. Me and my teammates removed and added stuff based on the feedback given by the TA and Professor. After each new method is implemented I added some test cases I thought would be necessary incase we wanted to change our design/code.

Kyle 

> Algorithms, design structure and group coordination were my significant additions to The Basis group. Core design ideas were based on the work that I creatively and professionally drew out for the team. I consistently optimized structures and functions across our entire program and wrote some of my own to aid us in parsing strings into mathematical expressions. I designed unique exceptions to object classes to prevent unforeseen errors and wrote Javadocs and tests for every method I created. Many slides to describe our CRC cards were completed by me, and I took the initiative to coordinate group meetings and assign tasks and corresponding deadlines to team members.  In code, some of my major pieces were 
>* Input Processor
>    * processInput()
>    * listInput()
>* UseCase.BasicOperations.ExpressionHandler
>* Entity.Expression
>* Several tests in TrigonometryTest

Achraf

> My contributions mainly came from the implementations of the code, as well as some design choices. I also constructed the Entity.Fraction class which is responsible for creating the fractions in our calculator. To the overall project i made changes which improved functionality of the calculator.

Hamza

> I contributed by assisting with ideas in the InputProccesor class, as well as making the validateInput method. I also added multiple test cases for various methods to ensure our code was in the best shape possible. I additionally helped with making the CRC models as well as gathering ideas for it.
