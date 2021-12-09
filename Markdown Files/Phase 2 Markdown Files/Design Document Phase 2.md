# Design Report

This is our design report for Phase 2!

## Updated Specification

> [Click Here](https://github.com/CSC207-UofT/course-project-the-basis/blob/main/Markdown%20Files/Phase%202%20Markdown%20Files/specification%20phase%202.md)

## Additonal Functionality between Phase 1 and Phase 2

- Users can now compute Linear Algebra operations with square matrices.

- History can be viewed for both Basic Operations and Linear Algebra Operations.


## Major Design Decisions

Splitting WalkthroughCustomInput

> In Phase 1, we had a class which was far too large. It contained many responities which did not adhere to SOLID and Clean Architecture. As a team, and with the provided feedback we were able to split this class into three separate layers. First, there is a UI which takes in the user input. Then, the input is sent to a controller where use cases are called upon to complete any necessary operations. This was a large step in changing our design as it allowed for making changes to our code easy to make.

Spliiting and improving ExpressionHandler

> In Phase 0 and 1, our computations in our program was done by a single method in expressionhandler called compute. This method uses if-statements to check the operand of type string then convert it into an actual expression. Although there was no issue with the method itself, the design of the code, however, was not particularly friendly to adding new features as it required a lot of the code to be changed. So in this Phase, we deiced to implement the strategy pattern design to fix this design issue. After implementing it, the Strategy pattern lets you indirectly alter the object’s behaviour at runtime by associating it with different sub-objects which can perform specific sub-tasks in different ways. To add on You can replace inheritance with composition. It also composes Open/Closed Principle. You can introduce new strategies without having to change the context.

## Clean Architecture

### Scenario WalkThrough:
1. First, the Main class is run, and the UI is created and called.
2. In the UI, it will first ask the User to log in or sign up. Let's assume they want to log in. 
3. Now, the UI will call the UserController, and send in “1”, which corresponds to log in.
4. In the UserController, the use cases for login and password validation are executed.
5. Once the user has successfully logged in, the controller will set the current user, so that the history is saved for the logged in user.
6. Now, the UI will take this result, and while the user is logged in, the below will happen.
7. The UI will present the user with 5 options, let's suppose they click compute. 
8. The CalculationController will be called, and the UseCase for building an Expression, Parser, will be called. Note, that the user's input will be saved to the history database, at the same time. 
9. Once Parser has processed the given string, the output will be an Expression object, from here, the Expression object will compute the answer using the Strategy Pattern implemented for single expressions or the SingleExpression class! 
10. Now, the output is sent back to the controller, and presented to the User through the UI!

### Clear Violations: 

> There are some violations with how Exceptions are called. Initially, Exceptions were called all the way to the Main class, but we were able to reduce that dependency to the Controller. The controller currently catches these errors, however that might be a violation since then the controller is dealing with the use cases errors. When the controller should deal with the user's input.


### Dependency Rule with details from the Outer Layer

> The UI presents the users the options, and takes in their input and sends it to the controller. Then the controller processes the input, saves the calculator to the database using the gateway, and then calls the correct use cases which will process, and present the final answer back to the UI. The only way the dependency rule is violated in the outer layer is how the password validate and username validate use cases take on the responsibility of a gateway. They are use cases, however making them gateways would work better design wise if we had more time to implement it.


## SOLID

### Single Responsibility:

SRP states that a class has one responsibility, and one reason to change. We adhered to this by ensuring any new features added were in its own separate class. Below is a breakdown of some examples of this!

#### Implementing Users: 
> At first, we had one class which was responsible for logging in a user and signing them up. However, this violated SRP. So, what we did was make separate use-cases for signing up a new user, logging in a new user, and validating the log-in of a new user.


#### Implementing Basic Operations:

> At first, we had a single class for every single operation, such as addition, subtraction, and division. But we found this violated SRP since a single class was responsible for more than one operation. We fixed this by implementing the Strategy Pattern, which will be explained later on in the report.


#### Implementing Matrix Operations:

> At first, we had every single matrix operation in one class called MatrixHandler, however this was a clear violation of SRP. To resolve this issue, we made interfaces which were implemented by the different operations such as determinant, and RREF. 


#### Controllers for Users and Calculation:

> Initially, there was one controller for both dealing with accounts, and calculations. This violates SRP since there is more than one responsibility on the controller. We split this into two controllers, this adhering to SRP. 

### Open/Closed:

Open Closed Principle principle allows for new features to be easily created, but closed is for modification. We adhered to this by ensuring we used interfaces which defined the methods. Below are some examples of this!

#### Implementing Gateway to Text Files:

> At first, we defined the two types of gateways, however this violated SRP since we would have to rely on making new classes and defining how it works. So instead, we made an interface called ReadWrite, which defined the two methods. One for reading the file, and one for writing to a file. Since a gateways responsibility consists of those two, it was a perfect interface to have. This allows for easy expansion of any possible databases in the future!


#### Implementing Operations

> As noted before, we used the strategy pattern to implement operations. In the event of a new operation, we can easily expand onto this since adding a new strategy is very easy to do, which will be explained below.


### Liskov Substitution:

Liskov’s states that a class should be easily replaceable with its subclasses. In other words, retain the contract with the main class. Below are some examples of how this was achieved. Do note, with interfaces the contract is implementing every single method in the interface as this also complies with interface segregation.

##### Gateways:
> Both gateways have implemented both the writetoFile and readfromFile methods defined in the ReadWrite interface. This does not void the contract of implementing all methods. And the parameters are the same for both gateways.


##### Computation:
> The computation interface has one method which takes in two doubles. This contract is agreed to by each operation (+, -, ^, /, *). Thus, LSP is used. 


### Interface Segregation:

Interface Segregation was implemented by splitting up interfaces so no classes are forced to implement methods it does not need. Below are some examples of this!

#### Matrix Operations:

> Addition and Subtraction: These two methods are very closely related to each other, so we created one interface which defines the method and its inputs. We were thinking about having one interface for every operation so we could use the strategy design pattern, but this would violate ISP since classes would be forced to implement methods it does not need since there are different return types, and parameter inputs for each operation. 

#### Interfaces are Short:
> Having short interfaces is important since we do not have to have too many methods forced upon classes. This can cause issues of dependency on methods classes do not need. Simply stating the necessary and shared methods is enough, and allows for unique methods to be moved into different interfaces.


### Dependency Inversion:

> Regarding DIP, it is when a class relies on another class. By creating an interface in the relied class and implementing the interface,i t doesn’t remove the dependency, but makes it more abstract. We did not get enough time to completely implement DIP, but one case where we could use it is when we validate the password of the user, and check if a username exists. Since there is a dependency on a gateway, by creating an interface in these use cases, the dependency would follow DIP by allowing it to rely on abstraction, and not directly. Another case where DIP could be implemented is how the username and password checker use cases read the databases, thus acting as a gateway. By implementing DIP, this direct dependency could become abstract by adding an interface in the use cases, and having the gateway method implement the interfaces methods.


## Packaging Strategies

> The packaging strategy used is “By Layers”. This approach allowed us to make adding features to our code much easier. It also makes it easy to see how the dependency rule is implemented in our project. Another strategy we considered is by feature, however there were far too many classes in one folder for storing the math related classes, so packaging by layers was the best one for us.
## Design Patterns

#### Strategy Pattern:
> We used the strategy pattern to define a family of operations. Since addition, subtraction, division, multiplication and powers all use two numbers, the strategy pattern helped us clean up the code. This was done by defining an interface for computation, and defining a compute method which took in two numbers. We then created a specific strategy object and passed it to the context. The context exposes a setter which lets clients replace the strategy associated with the context at runtime. The context in this example would be addition, subtraction, division, multiplication and exponents. Finally we have a class single expression, this class implements different variations of an algorithm the context uses. we check the context by the associated string operand. For example, when we have "+", the resultant method in single operation checks it and calls the Addition class. After it finds out the appropriate class, it uses the method setStrategy in the calculator class. After being set the method resultant then calls upon getStrategy in calculator class to get the result. 

#### Observer: 

> The observer design pattern is implemented by having a gateway for our text files. Since we want to be able to store users and user history, having a gateway will allow us for our code to adhere to clean architecture, alongside making it easy to read and store information to the txt files. The gateways communicate to the database and either add information such as when a user signs up, and when the user wants to read their history the gateway will read the database.

#### Facade: 
> The facade design pattern is implemented through our controllers. First, we had one large facade then we split it up to adhere to SRP, alongside ensuring we follow the facade design pattern. Having the facade design pattern improved functionality of our code since we could have the controller take in the user input, log in/sign up the user by calling the corresponding use cases, then the operation Controller is called where it will take in the users choice and call the corresponding operation use case.


#### Builder:
> We have tried to attempt at implementing the builder design pattern for building a matrix, however due to time constraints it is not perfect. For instance, there is not a single class which acts as the middleman which calls on the classes for building a matrix. There is a use case which takes in the users string, builds the matrix, and then in the controller the matrix is built and sent off into the correct operations.

#### Memento:
> We could have implemented Memento, if we had more time, to restore a matrix or expression from history. The pattern would have helped us add a feature for returning the answer from something a user computed in the past. Currently, the user can only view the history and the time they computed it. But in the future having this feature would be easier using the memento design pattern.


## GitHub Features

#### Pull Requests

> We have extensively used Pull Requests throughout development to ensure any new changes are reviewed by all group members. This allows other members to potentially catch any errors, or simply provide feedback. Pull Requests also prevent any code from being overwritten and allows members to test changes before they make a pull request.

#### Issues

> We used issues to keep a checklist of changes we need to make, or any reviews of the code. For example, keeping track of changes which could improve the design of our code, or fixing bugs in use cases for operations. Overall, issues were nice to use as it kept a easy to access checklist everyone could view, and comment on.

#### Actions:

> We did not use actions for development, instead as a group we would join Discord calls, and someone would go live. From here, we would test out their code, and make sure it does not break any functionality. 

## Refactoring

- A major refractor done was splitting up WalkThroughCustomInput. This really helped in conforming to SOLID and Clean Architecture properties. As a result, it was also easier to see any design pattern we implemented, or can implement.
- Creating Packages helped clean up file organization.
- Renaming classes to help understand the responsibility of each class.
- Implementing the Strategy Pattern to clean up executing operations.

## Testing

> Every member of our group made various test cases for most, if not all, of the aspects we implemented in our project. We made effective test cases by having the maker of a given method get other group members to give him edge cases so that we could ensure that our test cases weren't just made from the creators mindset. We tried our best to make sure that the test cases for each method covered as many edge cases as possible to ensure our code's validity.


