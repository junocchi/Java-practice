# Java Assignment: DateTime Function

## Problem Statement

Using the Java Date/Time API, apply the following functionality in the relevant method placeholders.

1. `getTodaysDate()`: Implement the existing method so that it returns today's date.
2. `getLaterDatebyDays(LocalDate date, int x)`: Implement the existing method so that the method returns the date corresponding to `x` days after the input date.
    * For example, if the date 30 June 2023 is input, and x = 5, the method should return 5 July 2023.
3. `getPreviousDatebyWeeks(LocalDate date, int x)`: Implement the existing method so that the method will return the date corresponding to `x` weeks before the input date.
    * For example, if the input date is 30 June 2023 and x = 5, the method should return 26 May 2023.
5. `getTimeDifference(LocalDate date1, LocalDate date2)`: Implement the existing method so that it returns the time difference between two input dates in years, months, and days. 
    * The method must return the response in a String format like: "Year-20:Months-5:Days-1"


## Instructions

Update only the existing **DateTimeFunctions.java** class in the starter code provided. Do not change the code in any other file provided.

Update the class as necessary to implement the code, adding new code only inside the comment blocks provided.

For each of the methods listed above, replace the existing `return null;` statement with the appropriate code, adding all code inside the comment blocks provided.

Focus on one method at a time. After committing the code and verifying that the test for that method passes, start work on the next method.

Submit the URL for your repository to the Engage assignment only after the code passes all tests.

## Steps to Solve the Problem

### Step 1: Verify the Setup Requirements

- Java version 11 installed with the JAVA_HOME path variable
- An IDE with required plugins for Java
- Git
- A GitHub account

### Step 2: Access GitHub Classroom and the Repository

1. Your instructor will provide a link for the assessment in GitHub Classroom.
2. Open the link and authorize access using your GitHub account.
3. Clone the repository to a local folder.
   - Instructions for working with GitHub repositories are provided in the Git and GitHub section of the course.
4. Open the project folder in your selected IDE.

### Step 3: Solve the Problem

Read the problem statement carefully to be sure you understand what the code is expected to do.

- You are encouraged to sketch out a flowchart, use pseudocode, or create class diagrams to plan out the code.

Open the indicated .java file on your computer. Make changes only to that file.

The .java file includes comments to indicate where you should add your code.

- All new code must be added inside the placeholders provided.
- Do not delete the placeholder comments.
- Do not change any existing code elsewhere in the project.
- Do not alter existing class names, interface names, method signatures, or attribute names.
- Use Java naming conventions for the code you create.

The placeholders for your code will look like:

```
//YOUR CODE STARTS HERE

//YOUR CODE ENDS HERE
```

All new code should be added **inside** these placeholders.

### Step 4: Submit Your Work

1. Code solutions to the problem statements and run the code in the local IDE to check it as you work.
2. Incrementally commit the changes to the repository, labeling each commit numerically (Commit1, Commit2, etc.).
   - The number of commits can be as high as necessary; commit as frequently as you wish.
3. Each commit will be tested automatically against the relevant test cases. Open the repository in GitHub to view the test results.
   - A checkmark indicates that a test passed.
   - An X indicates that the test failed.
4. If any test fails, return to the local code to make corrections or add more code, then recommit the changes.
5. When the code passes all tests, commit one more time, labeling the last commit as "final commit."
   - You may need to make a minor edit to the code, such as adding a comment, so that Git knows the code is different.
6. Copy the URL for the GitHub repository and submit it to the assessment page in Engage.
7. Your instructor may also ask you to submit a pull request on the repository.`
