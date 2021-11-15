## Updated Specification

Additonal Functionality between Phase 0 and Phase 1

> 1. Users
> 2. History
> 3. RREF
> 4. Inverse
> 5. Determinants
> 6. Trignomerty 
> 7. Exponents
> 8. Row Swap
> 9. Scalar Multiplication
> 10. Matrix Addition 
> 11. Matrix Subtraction
> 12. Updated WalkthroughCustomInput


## Major Design Decisions

Users

> When deciding on Users, we had a hard time deciding what type of users we should have. Initially we thought of having a basic user, linear algebra user, and a user which had access to both. From a design point, we agreed this did not make sense since a lot of excess methods and classes would have to be made, when in a calculator a user should have access to everything. We moved to having a Calculator user, and an Admin user. This made more sense to us since we could make an Entity class for users, then implement a design pattern to differentiate between the two types of users. Alongside, this will help us shorten our code and prevent unnecessary functions and classes which would make our code overcrowded.

## Clean Architecture
A brief description of how your project adheres to Clean Architecture (if you notice a violation and aren't sure how to fix it, talk about that too!)

## SOLID
A brief description of how your project is consistent with the SOLID design principles (if you notice a violation and aren't sure how to fix it, talk about that too!)

## Packaging Strategies
A brief description of which packaging strategies you considered, which you decided to use, and why. (see slide 7 from the packages slides)

## Design Patterns

> I plan on implementing the Template Method design patterns to implement Users. The reason this pattern will make modifying code easier is because I can add restrictions between a Calculator User, and an Admin. For example, Admims will be able to access the history of all calculations. Also, they will be able to look at the list of users with their passwords in the event a Calculator User requests to see their password because they forgot it. In regards to the Template Method, Calculator Users will be presented with a message which will prevent them from accessing the list of users. While Admins will be able to log in and access the list of users. This is still a work in progress, however this is how I plan to implement the Template Method design pattern to our code.
