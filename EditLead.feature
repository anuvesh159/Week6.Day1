Feature: Edit Lead Functionality



Scenario Outline: TC_12345 Edit Lead Functionality positive

Given Enter the username as DemoSalesManager
Given Enter the password as crmsfa
When Click Login
When Click crm/sfa link
When Click Leads link
When Click Find leads
Given Enter first name
When Click Find leads button
When Click on first resulting lead
Then Verify title of the page
When Click Edit
Given Change the company name
When Click Update
Then Confirm the changed name appears