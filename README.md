# COMP373_P4_MEDIATOR

Project 4: Implementing Mediator Pattern

## Inspiration 

For this real-world example of the Mediator pattern, we used a simple implementation of a food delivery service program. In our implementation, the Mediator is the FoodDeliveryService which is implemented by the Concrete Mediator FoodDeliveryServiceImpl. The Colleagues in this application are the Restaurant, the Customer, and the DeliveryDriver. For this project, there is no Main but you can test the program with the Junit test in the Test folder. 

## How To Run the Code

Clone the repository to your own development environment and run the Junit test (in Test folder). When run, the tests are successful and the console shows the testing of the Mediator communicating with the Colleagues without having the Colleagues communicating with each other directly. Junit 5 has been added to the repo but if the test is not successful, then you need to add it as a dependency and to the build path.

## What Is The Problem Identified In This Project? 

Before implementing the Mediator pattern, the problem that the program would have encountered would have been maintainability and testability. While this program only shows one Customer, in a real-world example the Food Delivery Service could have hundreds of customers and it would be up to the application (such as Grubhub) to be able to communicate effectively with all the players (customers, restaurants, and delivery drivers). 

## Solution

In this case, the customer does not need to directly communicate with the restaurant, it would be up to the mediator, the delivery service, to make that communication. The intent of the Mediator Pattern then would be to "reduce the complexity and dependencies between tightly coupled objects communicating directly with one another".

## UML
![](VisitorUML.png)

## Applications Used 

* Draw.IO (UML Model)
* Eclipse IDE For Java 

## Credit 

Anissa Cristerna,
Henry Espinoza, and
Irfan Poljak
