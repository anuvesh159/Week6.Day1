Feature: MergeLead functionality

Scenario Outline: TC001234_MergeLead Functionality - positive

Given Enter username as DemoSalesManager
Given Enter password as crmsfa
When Click on Login Button
When Click on CRMSFA Link
When Click on Leads Link
When Click MergeLeads
When Click From
Then Get  LeadID
When click FindLead
Given Enter the value
When Click FindLeads
