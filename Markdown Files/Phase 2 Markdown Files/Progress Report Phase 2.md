# Progress Report

This is our progress report for Phase 2!

## What has worked well for your design?

> What worked well was splitting up our code into Use Cases, and having a controller. This made is a lot easier to see how we can implement features such as user log-in and sign-up. Alongside, packaging by layers to see how our classes interact with each other. Another design choice which worked well was having a gateway to communicate with our txt files for Users and History. The design patterns implemented are discussed in our Design Report and were all helpful in our design as described in the report.
## Summary of what each group member is working on and plans on working on next

Mohtashim

> For Phase 2, my main responsibility was converting our code to follow SOLID, Clean Architecture and use Design Patterns. In Phase 1 we did not pay attention to this as much as we should have, so I took the responsibility of implementing these into our code and guiding our group in implementing these properties. For example, I split up the WalkThroughCustomInput into use cases, made a controller for our calculator, and implemented design patterns. I also packaged our code as mentioned in the Design Report. I also completed the design report, and created the layout for the Phase 2 homepage section on our Github page. A change I made which was very impactful was [allowing the user to type in a matrix](https://github.com/CSC207-UofT/course-project-the-basis/pull/66/files). This change was difficult to do at first but once it was completed it made computing operations with matrices a lot easier and made it faster to input a matrix.


Nofel

> In this Phase, I looked at the feedback given form phase 1 and implemented the stratgey pattern for our comupte method in our program. Making an interface then implementing it in each operation with its own class such as additon, subtraction, muliplication, etc. I then made a class that checks the operand then assign's its functionaily based on the operand that was given. Esenitally, this is the backbone of our program as everything else needs it in order for our program to work so the deign must be very friendly. I also made modifed test cases to fit our new design as the old cases did not cover this. I also designed and did some of the accessibilty report.


Achraf

> The bulk of my work came from implementing the new UI as well as the controller of our program. I also implemented the login and signup features and fixed the issues we had with implementation of our database (how we saved a user's calculation, as well as they're username/password).
>[This](https://github.com/CSC207-UofT/course-project-the-basis/commit/43b457b91c2ee54c493684c51a950dc770df02f4) is where I created a database for the history part of our program and implemented it. This helped us resolve some of the big issues we were having in phase 1 when trying to set up a proper database without breaking any clean architecture principles.  


Hamza

> My most significant contribution in this phase was implementing the Parser class under the use case package. The Parser class is a fundamental aspect of our project as it holds the basis of how every expression is computed. I worked on this class along side Kyle and we worked together to tackle most of the Parser class' methods. I also made various test cases in the ParserTest file to ensure that the fundamental part of our compute section worked exceptionally. Another thing I worked on in phase 2 was working alongside Kyle to fix our RREF method. We ran some tests on the RREF method and found some bugs, so we spent time fixing the bug so that the RREF section of our calculator also worked without error.
> [This](https://github.com/CSC207-UofT/course-project-the-basis/commit/30d1fdde95994c227015bf755ad9c51daa53a323) commit contains fundamental code that essentially allows our calculator to compute expressions.

Kyle

> text
