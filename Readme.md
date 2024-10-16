# JavaFX Login Page Application Documentation

## Table of Contents

1. [Introduction](#introduction)
2. [Section A: Application Creation and Initial Screenshot](#section-a-application-creation-and-initial-screenshot)
3. [Section B: Identify the Controller File](#section-b-identify-the-controller-file)
4. [Section C: Identify the View File](#section-c-identify-the-view-file)
5. [Section D: Identify the Model File (if any)](#section-d-identify-the-model-file-if-any)
6. [Section E: Form Validation](#section-e-form-validation)
7. [Section F: Static Username and Password Check](#section-f-static-username-and-password-check)
8. [Section G: Account Locking After 5 Invalid Password Attempts](#section-g-account-locking-after-5-invalid-password-attempts)
9. [Section H: Implement Failed Attempt Counter](#section-h-implement-failed-attempt-counter)
10. [Section I: GitHub and Documentation](#section-i-github-and-documentation)

## Introduction

This document provides an overview of the JavaFX Login Page Application, covering each section of the test instructions. It includes screenshots, code snippets, and explanations of the implemented features.

## Section A: Application Creation and Initial Screenshot

- The JavaFX login page application was launched with input fields for **Username**, **Password**, and a **Login** button.
- The application displays the user's name, student ID, and the title "Login Page".
- ![Application Screenshot](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/7.png)

## Section B: Identify the Controller File

- The controller file manages the logic of the login process.
- A screenshot of the controller file is shown below.
- ![Controller File Screenshot](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/4.png)

## Section C: Identify the View File

- The view file is responsible for the visual layout of the login page.
- A screenshot of the view file is provided below.
- ![View File Screenshot](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/3.png)

## Section E: Form Validation

- The form validation checks for empty **Username** or **Password** fields when attempting to log in.
- If either field is empty, the message "Please Provide Username or Password" is displayed.
- ![Validation Message Screenshot](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/6.png)
- Relevant Java code:
  ```java
  if (username.isEmpty() || password.isEmpty()) {
      messageLabel.setText("Please Provide Username or Password");
  }
  ```

## Section F: Static Username and Password Check

- Upon a successful login, the message "Success!!!" is displayed. For incorrect credentials, "Sorry, Invalid Username or Password" is shown.
- Successful login screenshot:
  ![Successful Login](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/10.png)
- Failed login screenshot:
  ![Failed Login](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/8.png)
- Relevant Java code:
  ```java
  if (username.equals("YOUR_FIRST_NAME") && password.equals("456")) {
      messageLabel.setText("Success!!!");
  } else {
      messageLabel.setText("Sorry, Invalid Username or Password");
  }
  ```

## Section G: Account Locking After 5 Invalid Password Attempts

- After five consecutive incorrect password attempts, the account is locked, displaying "Sorry, Your Account is Locked!!!".
- Screenshot showing the account locking message:
  ![Account Locked](https://github.com/khadkaankit85/Assets/blob/master/JavafxFormValidation/8.png)
- Relevant Java code:
  ```java
  if (attempts >= 5) {
      messageLabel.setText("Sorry, Your Account is Locked!!!");
  }
  ```

```

## Section I: GitHub and Documentation
- The JavaFX project is uploaded to a GitHub repository.
- This documentation, along with screenshots and code examples, is provided in the repository.
- [GitHub Repository](https://github.com/khadkaankit85/Desktop-App-For-Validation)
```
