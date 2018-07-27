## Pega QA Assigment - Lucas Germani

### Tech Stack

- Selenium
- Gauge
- Maven
- Gauge Maven Plugin

### Design Patterns Used
- **Page Factory**: Design pattern main used to avoid code duplication, specially locators, using @FindBy anotation is possible to locate and interact with webelements without the need of keeping the locator explicit on the code. This is possible through internal PageFactory logic.
- **PageObjectModel (POM)**: Complementary patern to PageFactory, POM means that each page and it own locators and behaviours should be represented in a single object (based on SRP principle) in order to improve reusability and manutenaility.
- **Test specification in plain text**: Test cenarios and specifications are written in plain text in gauge *.spec files, has similar benefits to BDD (ex: Cucumber), but without the need to use keywords like Given, When, Then. This helps to show and discuss test scenarios with business persons (ex: Product Owners and Business Analysts).

### Test Scenarios
Test scenarios are described also in /specs folder inside this project.
The test scenarios are executable through gauge runner or gauge maven plugin.

Example:

````
Login Test
=====================
Created by Lucasgermani on 27/07/2018

This is an executable specification file which follows markdown syntax.
This specification should test the login feature at http://testing-ground.scraping.pro/login

* Given user is at the login page


Sucesfull Login
----------------
* Perform login with username = "admin" and password "12345"
* Verify if login result is equals to "WELCOME"

Wrong username
----------------
* Perform login with username = "normaluser" and password "12345"
* Verify if login result is equals to "ACCESS_DENIED"

Wrong password
----------------
* Perform login with username = "admin" and password "01hf32f2"
* Verify if login result is equals to "ACCESS_DENIED"

Empty Credentials
----------------
* Perform login with username = "" and password ""
* Verify if login result is equals to "ACCESS_DENIED"

No password
----------------
* Perform login with username = "admin" and password ""
* Verify if login result is equals to "ACCESS_DENIED"

No username
----------------
* Perform login with username = "" and password "12345"
* Verify if login result is equals to "ACCESS_DENIED"
````

### How to run it:
To run the specification that contains the test in this case you can execute
a maven comand to execute the maven gauge runner plugin:
> mvn gauge:execute -DspecsDir=specs/LoginTest.spec


### Notes
- This project is based on a framework created by myself in order to develop the tests using the design patterns listed above.
- It was not possible to reproduce scenarios with missing cookies or 'redirecting', so they were not implemented.