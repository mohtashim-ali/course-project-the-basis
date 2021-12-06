## Updated Specification

> [Click Here](https://github.com/CSC207-UofT/course-project-the-basis/blob/main/Markdown%20Files/Phase%202%20Markdown%20Files/specification%20phase%202.md)

## Additonal Functionality between Phase 1 and Phase 2

> Users can now compute Linear Algebra operations with square matrices.


> History can be viewed for both Basic Operations and Linear Algebra Operations.


## Major Design Decisions

Splitting WalkthroughCustomInput

> In Phase 1, we had a class which was far too large. It contained many responities which did not adhere to SOLID and Clean Architecture. As a team, and with the provided feedback we were able to split this class into three separate layers. First, there is a UI which takes in the user input. Then, the input is sent to a controller where use cases are called upon to complete any necessary operations. This was a large step in changing our design as it allowed for making changes to our code easy to make.

Spliiting and improving ExpressionHandler

> In Phase 0 and 1, our computations in our program was done by a single method in expressionhandler called compute. This method uses if-statements to check the operand of type string then convert it into an actual expression. Although there was no issue with the method itself, the design of the code, however, was not particularly friendly to adding new features as it required a lot of the code to be changed. So in this Phase, we deiced to implement the strategy pattern design to fix this design issue. After implementing it, the Strategy pattern lets you indirectly alter the object’s behaviour at runtime by associating it with different sub-objects which can perform specific sub-tasks in different ways. To add on You can replace inheritance with composition. It also composes Open/Closed Principle. You can introduce new strategies without having to change the context.

## Clean Architecture

> Our project adheres to Clean Architecture by ensuring we follow the dependency rule. First, there are Entity classes for Users, and defining any mathematical property such as expressions, matrix, and equations. Next, our use cases use entities to provide functionality to our code. For example, there are use cases for logging in and signing up the user, building and computing an expression, alongside accessing the database through a gateway. Controllers are present and use the use cases to process user input from the UI and send back results from presenters. The UI calls the controller, and does not know about any other layers. Thus, adhering to the dependency rule.


## SOLID

#### Single Responsibility:

> We followed SR by ensuring a class does not have more than one responsibility. This was done by creating many classes to separate features from each other. For example, before we had log-in and sign-up in one use case class, but this violated SR, so it was split into two use case classes. More examples include different classes for adding to history to users list and  to history of calculations done by the user. There are also many entity classes to separate the types of math we have in our code including: Matrix, Trig, Expression, Equation, Fraction.

#### Open/Closed:

> We followed O/C by making interfaces for features which could be expanded. For example, we created an interface for the ReadWrite class since there could be more databases in our code. But, will include the same methods. This shows that it is Open for adding new databases, but closed for changing the structure of databases. Another example is the Operations interface. Since a calculator can have many operations, we do not want to limit the number of possible operations. The methods used by operations are always the same format, so it is closed for modification. 

#### Liskov Substitution:

> Liskov was followed by ensuring input parameters for objects of the same type are the same. In the History and UserList classes, both methods overridden input the same parameters. This ensures if the class were to be replaced by one another, then no exceptions would occur.

#### Interface Segregation:

> Interface Segregation was followed by having Interfaces just for computation errors. For example, addition and subtraction do not have errors when adding any two numbers.  But, division by zero is something that is unique to dividing. So, by creating a new interface which the division will implement, we follow interface segregation. We also decided to formulate an interface for the history part of your program, which could then be implemented either using files or a database. We did this because with this design, if we wanted to change the way we store our information, we wouldn't need to modify anything in the code that we already have. Instead, we could just use the interface we created. On top of this, all of our interfaces are short which also aligns with the principles of interface segregation

#### Dependency Inversion:

> Directly calling a gateway in a use case violates DIP. So to fix this, we made an interface for the gateways which read and write to our text files. Thus, by implementing the interface in the History and UserList classes, we can call them in the use cases and adhere to DIP.


## Packaging Strategies

> The packaging strategy used is “By Layers”. This approach allowed us to make adding features to our code much easier. It also makes it easy to see how the dependency rule is implemented in our project. Another strategy we considered is by feature, however there were far too many classes in one folder for storing the math related classes, so packaging by layers was the best one for us.
## Design Patterns

#### Strategy:

> We used the strategy pattern to implement operations. Since computing an operation is very similar, the strategy pattern allows for two input numbers to be computing according to the operand. This helps clean up calling operations as new "strategies'' can be called.

#### Facade:

> Our controller uses the Facade design pattern by contatning the use cases and calling the correct one depending on the user input. The facade class is called in our UI. Implementing the facade pattern helps us make sure the UI is not directly communicating with our use cases.

#### Observer:

> The observer design pattern is implemented by having a gateway for our text files. Since we want to be able to store users and user history, having a gateway will allow us for our code to adhere to clean architecture, alongside making it easy to read and store information to the txt files.

> (will add more later)

## GitHub Features

#### Pull Requests

> Text

#### Issues

> Text


## Refactoring

> Text

## Testing

> Text


