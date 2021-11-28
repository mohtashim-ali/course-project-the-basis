# Progress Report

## Questions
1. How should we implement user log in and sign up from a backend standpoint? I tried to use Spring however it seems too complicated for what we want, so is it okay to implement something simple?
2. Is having a database necessary for our program even if our program does not necessarily require it? We have already somewhat implemented a database but is it necessary we keep it for the next phase?

## What has worked well for your design?
> For our design, what worked well was the way each task in the program was divided. To be more precise, each class with complex operations has a handler for it. The handler of each class holds the method or rules for said class, while the other class holds all the properties. This design method helped us a lot with our program, especially when processing the input. It helped us by splitting our large/complex classes into two more comprehensible ones. Because of this it was more easier to find and locate bugs while at the same time making the code more readable. In essence, splitting our classes into different two classes, one with methods and the other one with property helped us significantly when implementing the program itself 

## Summary of what each group member is working on and plans on working on next

Mohtashim

> For Phase 1, I initially worked on implementing a Spring boot web app to allow users to log in, and receive confirmation emails. However, I found it very confusing so initially we decided to remove users, however I had an idea for users which would work well with our calculator. Essentially, there will be a Calculator user, and an Admin user. A Calculator user will be able to log in, use the calculator, access their history, and send a request to see their password in case they forgot it. An Admin user will be able to log in to use the calculator for testing purposes, see password requests, alongside view the database which contains the list of Entity.User information and past calculations. In Phase 2, I hope to get the login and sign up working on our website by connecting the front end to our backend. 

Nofel

> My contribution in this phase was mostly focused on the backend. My first task was to test the compute method in the Entity.Expression class and extend it with more basic operands. So far, I have implemented addition, subtraction, muliplication, divition, and preforming exponential operations. My second task in this phase was to implement trigonometry. A separate class was made for trigonometry, and I implemented all trigonometry operations sin, cos, tan, sec, and so on. Another task I was working on in this phase was the inverse of a matrix. In the RREF handler file, I was working on implementing an inverse of a given matrix. I hade to modify a lot of my code so it can be more freindly and compatable with the frontend for phase 2.

Achraf

> The majority of my contributations came from implementing a data base. At first, I tried using a mySQL database using a jdbc connector however I ran into too many problems and found that it was generally overkill for how we wanted our project to work. So instead, we decided to just go with simply writing/reading to a txt file. I also helped with the linear Algebra side of things and some of the user features.

Hamza

> My contributions for this phase of the project consisted of making methods in the UseCase.MatrixHandler class. The UseCase.MatrixHandler class is a class consisting of various Linear Algebra methods that compute Linear Algebra computations. I was tasked with coding multiple functions in this class as well as making as many test cases as possible to ensure our code's validity. The methods I was tasked with were the addMatrix method, the subtractMatrix method, the scalMult method, the rowOfZeros method, the moveZerosToBottom method, the zeroMatrix method and the RREF method. I also edited and fixed the code of the other methods in the UseCase.MatrixHandler class as well as various methods in other classes in order for the code to run and collaborate together without error. 

Kyle

> My tasks consisted of front-end work with our website and aiding in back-end frameworks/code. Lots of functions and algorithms such as determinant/RREF in UseCase.MatrixHandler were designed by me or with the aid of my knowledge. Several test cases were created for UseCase.MatrixHandler that helped us debug issues though we are still facing issues with code generality. Furthermore our website was created purely by me and will aid much of my team members in creating users and calculator history. In the future, I hope to put more effort into flushing out our backend designs and creating efficient systems in our calculator.
