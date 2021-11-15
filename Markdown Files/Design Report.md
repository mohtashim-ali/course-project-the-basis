## Updated Specification

Briefly highlight any additional functionality that you have implemented between phase 0 and the end of phase 1.

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

Optionally, include a well-formatted diagram of your code. This is called a class diagram (Links to an external site.), and there is an international standard called the Unified Modelling Language (Links to an external site.) (UML) that describes them in detail. However! Please don't worry about the details, just use boxes and arrows like we do in the slides. If you're curious, you can create a full UML class diagram for all or part (at your group's discretion) of your program.
NOTE 1: This can really help your TA understand what you did, but if presented poorly it won't be of much use.
NOTE 2: If you have access to the Pro version of IntelliJ, it can generate class diagrams for you, but make sure it is well formatted if you hand one in!

## Major Design Decisions
A description of any major design decisions your group has made (along with brief explanations of why you made them).

Users

> When deciding on Users, we had a hard time deciding what type of users we should have. Initially we thought of having a basic user, linear algebra user, and a user which had access to both. From a design point, we agreed this did not make sense since a lot of excess methods and classes would have to be made, when in a calculator a user should have access to everything. We moved to having a Calculator user, and an Admin user. This made more sense to us since we could make an Entity class for users, then implement a design pattern to differentiate between the two types of users. Alongside, this will help us shorten our code and prevent unnecessary functions and classes which would make our code overcrowded.

## Clean Architecture
A brief description of how your project adheres to Clean Architecture (if you notice a violation and aren't sure how to fix it, talk about that too!)

## SOLID
A brief description of how your project is consistent with the SOLID design principles (if you notice a violation and aren't sure how to fix it, talk about that too!)

## Packaging Strategies
A brief description of which packaging strategies you considered, which you decided to use, and why. (see slide 7 from the packages slides)

## Design Patterns

> Mohtashim: I plan on implementing the Template Method design patterns to implement Users. The reason this pattern will make modifying code easier is because I can add restrictions between a Calculator User, and an Admin. For example, Admims will be able to access the history of all calculations. Also, they will be able to look at the list of users with their passwords in the event a Calculator User requests to see their password because they forgot it. In regards to the Template Method, Calculator Users will be presented with a message which will prevent them from accessing the list of users. While Admins will be able to log in and access the list of users. This is still a work in progress, however this is how I plan to implement the Template Method design pattern to our code.

## Progress Report
A progress report

## Questions
1. How should we implement user log in and sign up from a backend standpoint? I tried to use Spring however it seems too complicated for what we want, so is it okay to implement something simple?
2. Is having a database necessary for our program even if our program does not necessarily require it? We have already somewhat implemented a database but it necessary we keep it for the next phase?

## Summary of what each group member is working on and plans on working on next

Mohtashim

> For Phase 1, I initially worked on implementing a Spring boot web app to allow users to log in, and receive confirmation emails. However, I found it very confusing so initially we decided to remove users, however I had an idea for users which would work well with our calculator. Essentially, there will be a Calculator user, and an Admin user. A Calculator user will be able to log in, use the calculator, access their history, and send a request to see their password in case they forgot it. An Admin user will be able to log in to use the calculator for testing purposes, see password requests, alongside view the database which contains the list of User information and past calculations. In Phase 2, I hope to get the login and sign up working on our website by connecting the front end to our backend. 

Nofel

> My contribution in this phase was mostly focused on the backend. My first task was to test the compute method in the Expression class and extend it with more basic operands. So far, I have implemented addition, subtraction, muliplication, divition, and preforming exponential operations. My second task in this phase was to implement trigonometry. A separate class was made for trigonometry, and I implemented all trigonometry operations sin, cos, tan, sec, and so on. Another task I was working on in this phase was the inverse of a matrix. In the RREF handler file, I was working on implementing an inverse of a given matrix. I hade to modify a lot of my code so it can be more freindly and compatable with the frontend for phase 2.

Achraf

> The majority of my contributations came from implementing a data base. At first, I tried using a mySQL database using a jdbc connector however I ran into too many problems and found that it was generally overkill for how we wanted our project to work. So instead, we decided to just go with simply writing/reading to a txt file. I also helped with the linear Algebra side of things and some of the user features.

Hamza

> My contributions for this phase of the project consisted of making methods in the MatrixHandler class. The MatrixHandler class is a class consisting of various Linear Algebra methods that compute Linear Algebra computations. I was tasked with coding multiple functions in this class as well as making as many test cases as possible to ensure our code's validity. The methods I was tasked with were the addMatrix method, the subtractMatrix method, the scalMult method, the rowOfZeros method, the moveZerosToBottom method, the zeroMatrix method and the RREF method. I also edited and fixed the code of the other methods in the MatrixHandler class as well as various methods in other classes in order for the code to run and collaborate together without error. 

Kyle

> My tasks consisted of front-end work with our website and aiding in back-end frameworks/code. Lots of functions and algorithms such as determinant/RREF in MatrixHandler were designed by me or with the aid of my knowledge. Several test cases were created for MatrixHandler that helped us debug issues though we are still facing issues with code generality. Furthermore our website was created purely by me and will aid much of my team members in creating users and calculator history. In the future, I hope to put more effort into flushing out our backend designs and creating efficient systems in our calculator.
