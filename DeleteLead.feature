Feature: DeletedLead Functionality

Scenario Outline: TC_123456 Delete Functionality Test Case - positive

Given Enter the username as DemoSalesManager
Given Enter the password as crmsfa
When Click Login
When Click crm/sfa link
When Click Leads link
When Click Find leads
When Click on Phone
Given Enter phone number
When Click find leads button
When Click first resulting lead
When Click Delete