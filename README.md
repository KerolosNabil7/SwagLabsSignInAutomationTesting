# SwagLabsSignInAutomationTesting

Test Swaq Lab Website Using Selenium With Java Covering The following Test Cases
This automation task was built by using TestNg, POM Design Pattern, Data Providers and Assertions
    
1. Check if the given valid credentials work:
    - Use credentials (Username: standard_user ,Password: secret_sauce).
    - After a successful login attempt, a div containing text: Products is visible.

2. Check if the given wrong credentials work:
    - Use invalid credentials
    - After an unsuccessful login attempt, a div with class error-message-container error and
      containing a message Epic sadface: Username and password do not match any user in
      this service is visible.

3. Check for empty credentials:
    - After an unsuccessful login attempt, a div with class error-message-container error and
    containing a message Epic sadface: Username is required is visible.
    - After an unsuccessful login attempt, a div with class error-message-container error and
    containing a message Epic sadface: Password is required is visible.

