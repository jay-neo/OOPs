<h1 align="center">OOPs Java ☕</h1>

## 1.
Write a Java program to create a class Discount containing SalesAmount as data member.
- SalesAmount should be given as input using appropriate input() method/ constructor defined in the class.
- In the class, define 2 methods viz. compute1() and compute2( ), those will compute the discount to be given using if-else construct and ternary operator respectively following the below mentioned conditions:
	- If SalesAmount is less than INR.10000/-, no discount given,
	- If SalesAmount is greater than INR.10000/- and less than INR.20000/-, 3% discount will be given,
	- If SalesAmount is greater than INR.20000/- and less than INR.40000/-, 5% discount will be given,
	- If SalesAmount is greater than INR.40000/-, 10% discount will be given.
- Add display() function to display the calculated discount. 


## 2.
Create a class Arithmetic containing following data members 
a: integer b: float c: char d: double 
and the following member functions
- Arithmetic (int, float, char, double); 
- void add (int, double); 
- void add (float, int, double); 
- void add (float, int, double); 
- Arithmetic add (arithmetic); 
- void display (); 

Declare objects of the class Arithmetic as per requirement and invoke member function. Comment on the performance of all the polymorphic add() functions.


## 3.
Create a class named Student containing S_Name, Roll_No, Batch, Year_of_Adm, Stream as data members. Write different types of constructors creating Student Objects such as 
- Student (String, int); 
- Student (String, int, String); 
- Student (String, int, String, int); 
- Student (String, int, String, int, String);

Assume default value for the data the data members for which values have not been passed. Use showdata() method to display the data members for all objects so created. 


## 4.
Create a class Account containing data members Acc_No, C_Name, Contact_No as data members and a constructor for creating Account Objects and show() method for displaying the data members. Create the following 3 sub-classes, namely, 
- Saving_Ac containing specialized features viz. ROI, Acc_Balance 
- Current_Ac containing specialised features viz. Acc_Balance, Maturity_Balance 
- TD_Ac containing specialized features viz. Principal, Term, ROI, Maturity_Balance 

Define suitable constructors in all of the above classes for creating objects and showdata() methods for displaying the data members. Also, define compute() method for different computations in all classes such as interest calculations etc.


## 5.
Create a class ComputerProfessional containing EName, DutyHour and Prospect(Domain of values are “Excellent”, Good” and “Fair”) as data members, Create 3 different child classes namely Developer,  NetworkAdmin and DataOperator using ComputeProfessional as the super class, Include StudyHour as data member in Developer Class, PracticeHours as data member in NetworkAdmin Class, TypingSpeed as data member in DataOperator Class.

Create two more sub-classes of Developer Class namely JavaProfessional and PythonProssional having ProficiencyLevel(Domain of value are “Beginner”, “Intermediate” and “Pro”) as specialized feature, Use constructors to create the objects for all classes, Develop the appropriate display() methods in all of the classes to show appropriate data members. 


## 6.
Write a Java program to create a class Shape" and 3 other classes named Square, Rectangle and Triangle derived from it, all containing a overridden method cal_area( ) to calculate area of a Square or a Rectangle or a Triangle. Assume suitable data members( 2 int type data members only) and member methods(get( ) and put( )) in all classes. Also validate the inputs. 


## 7.
Convert the following primitive data types into corresponding wrapper objects int, char, float, double. 

Store null values in the int and float variables. 

Store the Wrapper Objects into primitive types.

Considering an array of characters, check whether individual characters are of lowercase, uppercase, a digit or a whitespace character. 


## 8.
Implement Bubble sort/ Insertion sort by taking user input inside an array of integers.
[ Note: Use Object Oriented features only] 


## 9.
Write Multiply two matrices by taking user input in two 2D Arrays of integers. Check whether the dimensions of matrices conform to the rule of Matrix Multiplication.

## 10.
Create an interface named Area containing a final static variable, pi-3.14F and a method named cal_area (float dim1, float dim2).

Create 2 classes named Circle and Rectangle to implement the Area interface (that is, define respective cal_area() method).

Hint: - Use an interface object to refer to Circle object and Rectangle object to display the respective areas)


## 11.
Create a class Student containing Name & Roll_No as data members. Create a sub-class Test_marks containing Marks1, Marks2 as data members. Create an Interface CCA_Score containing CCA_credit data member and show cca_cred() method.
- Create a sub-class Sem_Result that inherits from Test marks and implements CCA_ Score interface.
- Define switable get_data() and put_data() methods in different classes.
- Create objects of Sem_Result class to display all details of 2 students. 


## 12.
Write a java program to import Math Class defined within java.lang system package and use the value of PI defined there for finding the area and perimeter of a circle by accepting radius as input through suitable methods defined in a user defined Class named Math_operations. Declare object of the class Math_operations and invoke the member functions as per requirement 


## 13.
Create a class Student containing Name & Roll No as data members. Create a sub-class Test_marks containing Marksl, Marks2 as data members. Create an Interface CCA_Score containing CCA_credit data member and show cca_cred() method. 

Create a sub-class Sem_Result that inherits from Test marks and implements CCA_ Score interface. Define switable get data() and put data() methods in different classes. Create objects of Sem_Result class to display all details of 2 students.

Design a package to contain the class Student another package to contain the interface CCA_Score. Explain the new design in your result discussion. 


## 14.
Show with a suitable java program that when we import any package, only the objects of public classes contained within the imported package can be created and used directly but the non-public classes contained within the package are hidden and cannot be used. 


## 15.
Write a java program for adding a new class to an existing package. Also, implement two public classes in the Java program using packages. 


## 16.
Write a java program to show the following built-in-exceptions: 
ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException 


## 17.
Create a java Applet to display your name at location (20,50) of a window. 


## 18.
Create and run applet to display the system date on your window.


## 19.
Create a Java Applet that accepts 2 numbers from user and displays their sum. 


## 20.
Create Write a Java program to create 20 threads and print their Ids. [Inherit Thread Class] 


## 21.
Write a Java Program to create 10 threads and print their names implementing Runnable interface. Use sleep() method to control working of threads. Use appropriate exception handling techniques. 
