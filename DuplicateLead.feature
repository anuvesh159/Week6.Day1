Feature: DeleteLead Functionality

Scenario Outline: TC112233 Deleted lead functionality - positive

Given Enter username as Demosalesmanager
And Enter the password as crmsfa
When Click on Login button
When Click on Crmsfa
When Click Leads link
When Click Find leads
When Click on Email
Given Enter Email
When Click find leads button
Then Capture name of First Resulting lead	
When Click First Resulting lead		
When Click Duplicate Lead		
Then Verify the title as Duplicate Lead		
When Click Create Lead	
Then Duplicte Lead is displayed