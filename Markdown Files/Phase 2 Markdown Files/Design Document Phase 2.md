## Updated Specification

Additonal Functionality between Phase 1 and Phase 2

> Blank


## Major Design Decisions

Splitting WalkthroughCustomInput

> In Phase 1, we had a class which was far too large. It contained many responities which did not adhere to SOLID and Clean Architecture. As a team, and with the provided feedback we were able to split this class into three separate layers. First, there is a UI which takes in the user input. Then, the input is sent to a controller where use cases are called upon to complete any necessary operations. This was a large step in changing our design as it allowed for making changes to our code easy to make.

## Clean Architecture

> Our project adheres to Clean Architecture by ensuring we follow the dependency rule. First, there are Entity classes for Users, and defining any mathematical property such as expressions, matrix, and equations. Next, our use cases use entities to provide functionality to our code. For example, there are use cases for logging in and signing up the user, building and computing an expression, alongside accessing the database through a gateway. Controllers are present and use the use cases to process user input from the UI and send back results from presenters. The UI calls the controller, and does not know about any other layers. Thus, adhering to the dependency rule.
## SOLID

> Clean architecture is a set of rules that define how programs can run efficiently, looking at our program we utilize and take advantage of a multitude of these concepts. SRP or Single Responsibility Principle is used numerous times throughout our program from Entity.Matrix determinants to RREF, basic operations and processing inputs. Our code follows this principle logically as it is divided up such that each function accomplishes solely their task. Another huge concept we utilize is the Dependency Inversion Principle which allows us to split our objects from their handlers. The handler acts as an abstraction to the object since it is not constructed anywhere and each object inherits the functions and properties of it. Through this principle we create architectural boundaries between objects and their manipulators enabling the formation of abstract Factories. Evidently, we send information from our front-end, to our Java File Handlers and our InputHandlers to create concrete representations of data that can be computed. Moreover, the Open/Closed principle is used in each of our handlers to allow objects to contain functions and operations extensively. Extensionality is a key aspect of our program because the field of mathematics is vast, meaning functionality can always be added on, because of this, it is essential that we use this principle. Violations are something my team and I looked out for, we made sure to closely follow these SOLID principles so that our ideas can guide themselves through design. One of the violations we wanted to keep an eye out for was the LSP Violation or Liskov Substitution Principle. Thankfully since we use handlers for our objects that are purely abstract even when substituting one class for the other we lose no functionality of our program.

## Packaging Strategies

> The packaging strategy used is “By Layers”. This approach allowed us to make adding features to our code much easier. It also makes it easy to see how the dependency rule is implemented in our project. Another strategy we considered is by feature, however there were far too many classes in one folder for storing the math related classes, so packaging by layers was the best one for us.
## Design Patterns

> Strategy: We used the strategy pattern to implement operations. Since computing an operation is very similar, the strategy pattern allows for two input numbers to be computing according to the operand. This helps clean up calling operations as new "strategies'' can be called.


> Facade: Our controller uses the Facade design pattern by contatning the use cases and calling the correct one depending on the user input. The facade class is called in our UI. Implementing the facade pattern helps us make sure the UI is not directly communicating with our use cases.


Observer: The observer design pattern is implemented by having a gateway for our text files. Since we want to be able to store users and user history, having a gateway will allow us for our code to adhere to clean architecture, alongside making it easy to read and store information to the txt files.
> (will add more later)
