Feature: Leaftaps Login functionality

Background:
//Given Launch the browser
And load the url



Scenario Outline: TC1_Testing Positive Condition

Given Enter the username as DemoSalesManager
Given Enter the password as crmsfa
When I was clicking the Login button
Then Home page was showing
When click on crmsfa 
When click on createlead
Given Enter the Company name
And Enter the FirstName
And Enter the LastName
And Enter the MailId
When Click the Submit button
Then Lead page should be displayed