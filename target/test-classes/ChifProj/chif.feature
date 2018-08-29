Feature:Chif Automation Test

Scenario:Open chif url
Given I open chif url

@Login
Scenario:Login using username and password
When I login with excel row "1" dataset

@NewCase
Scenario:Create New Case
Given Create New Case with excel row "3" dataset


@Logout
Scenario:Logout the Application
Then Logout the Application
