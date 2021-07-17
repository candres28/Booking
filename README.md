# **Prueba Tecnica Devco Booking WebSite

## Introduction

Booking.com, fundada en Ámsterdam en 1996, Booking.com apuesta por la tecnología para que viajar sea más fácil. 
Booking.com conecta a millones de viajeros con experiencias únicas, diversas opciones de transporte y alojamientos increíbles, desde casas hasta hoteles, pasando por otros muchos sitios más.

## Pre requirements

- Gradle version 5.5.0 or higher (environment variables configured).
- Cucumber for Java Plugin (updated version).
- Gherkin Plugin (updated version).
- ChromeDriver version 90.0.4430.24 for local runs of automations.
- IntelliJ IDEA (version 2021 or higher).
- Java version 1.8, update 191 or higher and JDK (environment variables configured).
- Google Chrome Versión 91.0.4472.100 (Build oficial) (64 bits)

## Installation
- To clone this repository locally, the following command must be run: 
```git clone https://github.com/candres28/Booking.git```
- Import the project from Eclipse or IntelliJ IDE under the structure of an existing Gradle project. 
- Configure JRE System Library with JavaSE-1.8.
- Configure the encoding to UTF-8 to the project once it is imported.

## Compile the project and generate Wrapper
- To build the project you must run the command:
```gradle clean build -x test```.

## Command for execution
- The project can be run from the console, being in the project folder with the following command:
```gradle clean test --tests=* aggregate --info```.
- The Serenity report will be generated in the folder ``/target/site/serenity/`` located in the root folder of the project.

## Building
Automation is developed with:
 - BDD (Behavior-Driven Development) - Development strategy
 - Screenplay pattern - Design pattern that applies SOLID principles
 - Gradle - Project and Dependency manager
 - Selenium Web Driver - Tool to automate actions in web browsers
 - Cucumber - Framework to automate BDD tests
 - Serenity BDD - Framework, Open source library for report generation
 - Gherkin - Business-readable domain specific language (DSL)

## "Documentos de Pruebas" folder 
---
It is the folder that contains an evidence file, about a defect found on the website.

## Booking folder 
---
It is the folder that contains the automated testing project

## BookingManual folder 
---
It is the folder that contains the manual testing project

## Vocabulary
---
### BDD
BDD is used as an automation framework for the automation of test scenarios, the idea is to write the tests before writing the source code, but instead of unit tests, what is done is to write tests that verify that the behavior of the Application is correct from a business point of view. After writing the tests, the source code of the functionality that makes these tests pass is written.

### Gherkin
Gherkin is used as a language for the development of functionalities since it is a language understandable by humans and computers, with it the behavior of the page to be automated is defined. It is an easy to read, easy to understand and easy to write language. Using Gherkin allows you to create a live documentation while automating the tests, also doing it with a language that can be understood from the business point of view.

To build BDD with Gherkin it is only necessary to know 5 words. With which the sentences that describe the functionalities are made:

- **Feature:** Indicates the name of the functionality to be tested. It must be a clear and explicit title. In addition, a description in the form of a user story is included: “As [role] I want [feature] so that [benefits]”. According to this description, the test scenarios are constructed.
- **Scenario:** Describe each scenario to be tested.
- **Given:** Provides context for the scenario in which the test will be executed, such as the point where the test is carried out, or data prerequisites. It includes the steps necessary to put the system in the desired state to run the test.
- **When:** Specifies the set of actions that launch the test. The user interaction that triggers the functionality to be tested.
- **Then:** Specifies the expected result in the test. It is validated if the changes observed in the system are the desired ones.

In addition to these five words, it can be used **Background** to group the same steps that are executed before each scenario in order to avoid code repetition.

### Cucumber
Cucumber is used as a tool to automate testing in BDD. Cucumber allows it to run functional descriptions in plain text like automated software tests. Fully compatible with the Gherkin language.

### Compiler
The project is created with Gradle, which is a project and dependency manager, it is the improved version of Maven, but it tries to take it one step further. For starters, it relies on Groovy and a DSL (Domain Specific Language) to work with a simple and clear language when constructing the build compared to Maven. On the other hand, it has great flexibility which allows to work using other languages and not just Java.

### IntelliJ
The IntelliJ IDE is used for automation development. IntelliJ is a development platform, designed to be extended indefinitely through plug-ins. It was conceived from its origins to become a platform for integrating development tools.

It does not have a specific language in mind, but is a generic IDE, although it is very popular among the Java language developer community using the JDT plug-in that is included in the standard distribution of the IDE.

It provides tools for managing workspaces, writing, deploying, running, and debugging applications.

## Author
* **Carlos Andrés Garcia Grisales** - [c.andres1349@gmail.com](#github #candres28)

