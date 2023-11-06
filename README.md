# java

program 01
THIS PROGRAM IS A SIMPLE CALCULATOR THAT PERFORMS BASIC ARITHMETIC OPERATIONS LIKE ADDITION, SUBTRACTION, MULTIPLICATION, AND DIVISION:
Here’s how it works:
The program asks the user to enter two integers.
Then, it asks the user to enter an operator (+, -, *, /) to perform the desired operation.
Based on the operator entered by the user, the program uses a switch statement to perform the corresponding operation.
If the operator is ‘+’, it adds the two numbers and displays the result.
If the operator is ‘-‘, it subtracts the second number from the first number and displays the result.
If the operator is ‘*’, it multiplies the two numbers and displays the result.
If the operator is ‘/’, it divides the first number by the second number and displays the result. However, if the second number is zero, it displays an error message since division by zero is not allowed.
If the operator is not one of the supported operations, it displays an error message.
Finally, the program thanks the user for using the calculator and closes.

Comments in the code are used to provide explanations and make the code more readable. They start with double slashes (//) and are ignored by the program when it runs.

program 02

THIS PROGRAM IS WRITTEN IN JAVA AND IT CALCULATES STATISTICS FOR A GROUP OF STUDENTS BASED ON THEIR NAMES AND SCORES. 


We start by declaring and initializing a string variable called "studentData". This variable will hold the data of all the students, along with their scores.

 Next, we split the "studentData" string into an array of individual student records. Each record contains the name of the student and their corresponding score.
 
We create two arrays: one to store the student names and another to store their scores. These arrays will help us organize and manipulate the data.

We populate the arrays with data from the split records. We extract the student name and score from each record and store them in the respective arrays.
 
We calculate the total number of students by getting the length of the studentNames array.
 
We calculate the average score of all the students by summing up all the scores and dividing it by the total number of students.

We find the highest score among all the students and also keep track of the name of the student who achieved it. 

Similarly, we find the lowest score among all the students and keep track of the name of the student who achieved it. 

Finally, we display the calculated statistics, such as the total number of students, average score, highest score, and the names of the students who achieved the highest and lowest scores.

