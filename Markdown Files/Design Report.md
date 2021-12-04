## Updated Specification

Additonal Functionality between Phase 0 and Phase 1

> 1. Users
> 2. Gateway.History
> 3. RREF
> 4. Inverse
> 5. Determinants
> 6. Trignomerty 
> 7. Exponents
> 8. Row Swap
> 9. Scalar Multiplication
> 10. Entity.Matrix Addition 
> 11. Entity.Matrix Subtraction
> 12. Updated UI.WalkthroughCustomInput


## Major Design Decisions

Users

> When deciding on Users, we had a hard time deciding what type of users we should have. Initially we thought of having a basic user, linear algebra user, and a user which had access to both. From a design point, we agreed this did not make sense since a lot of excess methods and classes would have to be made, when in a calculator a user should have access to everything. We moved to having a Calculator user, and an Admin user. This made more sense to us since we could make an Entity class for users, then implement a design pattern to differentiate between the two types of users. Alongside, this will help us shorten our code and prevent unnecessary functions and classes which would make our code overcrowded.

## Clean Architecture

> Our project adheres to Clean Architecture by ensuring Entities do not know about outside classes such as controllers. For example, the Entity.User class is an Entity class and to ensure using it does not violate clean architecture we called Entity.User in UI.WalkthroughCustomInput. This ensures the Entity.User class is not calling UI.WalkthroughCustomInput. Another idea we had was implementing a database for Gateway.History using MySQL. However, doing this would break Clean Architecture since we were taking the user input and storing it into a database at the same time. To fix this, we could make a interface for the history part of our program. But, we decided on using a text file approach which does not break clean architecture.

## SOLID

> Clean architecture is a set of rules that define how programs can run efficiently, looking at our program we utilize and take advantage of a multitude of these concepts. SRP or Single Responsibility Principle is used numerous times throughout our program from Entity.Matrix determinants to RREF, basic operations and processing inputs. Our code follows this principle logically as it is divided up such that each function accomplishes solely their task. Another huge concept we utilize is the Dependency Inversion Principle which allows us to split our objects from their handlers. The handler acts as an abstraction to the object since it is not constructed anywhere and each object inherits the functions and properties of it. Through this principle we create architectural boundaries between objects and their manipulators enabling the formation of abstract Factories. Evidently, we send information from our front-end, to our Java File Handlers and our InputHandlers to create concrete representations of data that can be computed. Moreover, the Open/Closed principle is used in each of our handlers to allow objects to contain functions and operations extensively. Extensionality is a key aspect of our program because the field of mathematics is vast, meaning functionality can always be added on, because of this, it is essential that we use this principle. Violations are something my team and I looked out for, we made sure to closely follow these SOLID principles so that our ideas can guide themselves through design. One of the violations we wanted to keep an eye out for was the LSP Violation or Liskov Substitution Principle. Thankfully since we use handlers for our objects that are purely abstract even when substituting one class for the other we lose no functionality of our program.

## Packaging Strategies

> Our group explored and inspected all of the packaging strategies but only considered one. The one packaging strategy we considered and decided to implement was the "Inside/Outside" packaging strategy. We decided on this strategy because we found it very easy to implement and understand. It allowed us to separate our code into three folders, one for front-end, one for back-end, and one for our history. This strategy seemed the most reasonable to us so we focused on it and built our code structure accordingly. A packaging strategy that we considered but didn't implement is the "By Feature" packaging strategy. As we were exploring this strategy, we seemed to find it too unorganized and instead looked for another strategy to follow.

## Design Patterns

> I plan on implementing the Template Method design patterns to implement Users. The reason this pattern will make modifying code easier is because I can add restrictions between a Calculator Entity.User, and an Admin. For example, Admims will be able to access the history of all calculations. Also, they will be able to look at the list of users with their passwords in the event a Calculator Entity.User requests to see their password because they forgot it. In regards to the Template Method, Calculator Users will be presented with a message which will prevent them from accessing the list of users. While Admins will be able to log in and access the list of users. This is still a work in progress, however this is how I plan to implement the Template Method design pattern to our code.
