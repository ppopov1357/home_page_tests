#Strypes Home Page tests

In this simple project, I have created several automated tests for the home page of the Strypes website

## Used technologies
 - Java
 - maven 
 - jUnit
 - Selenium
 - Serenity
 
For these tests I have chosen to implement the Serenity Screenplay pattern
because it helps the creation of readable and easily maintainable tests. Every class and method is written
in such a way that when combined they represent a readable sentence.
Serenity also helps us to generate a beautiful report with step logging, screenshots, etc...

## Implemented test cases
I have implemented simple test cases for the following features of the serenity website
 - Navigation between pages
 - Subscribe
 - Home page video
 - Cookie banner
 
## Test cases which I think are relevant to ensure the quality of the Strypes home page
1. Navigation
 - Navigation between pages from the navigation bar
 - Navigation between pages in mobile view
2. Subscribe
 - Successful subscription
 - Attempt to subscribe with invalid data
3. Board Members carousel
 - Clicking on board member makes him active in the carousel
 - Does the carousel spins
4. Cookie banner
 - Can you close the cookie banner
 - Is the cookie banner present after page refresh
5 Back on top
 - Clicking on the back on the top button scrolls the content to the top
6. Footer
 - Does the links in the footer works


## Running the tests
### Prerequisites
To run the tests you need java, maven and a chrome driver available in your system path

### Command for running the tests
`mvn verify` 

### Passing parameters
#### Different driver 

`mvn verify -Dwebdriver.driver=firefox`

#### Different Strypes website url

`mvn verify -Denvironments.default.webdriver.base.url=https://testing.strypes.eu`

All these config options can be changed in the `serenity.config` file
