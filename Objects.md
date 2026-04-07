# Operators in Java 

## Arithmatic operator : +, -, *, /, %
## Relational Operator : , >= , <, <=
## Logical Operator : && ||
## Equality Operator : == , != 
## Assignemnt Operator : =, =+, -=, *=, /=, %=
## increment/decrement operator : ++, --
## Binary Operator : ! , ::
## Ternary Operator : _?_ : __
## Bitwis Operator : 

- The output for java operators : Relational Operator, Logical Operator, Equality Operator (Boolean : true or false)

# Increment are of two types : 

- # Pre - Increment 

- int i = 1;
  int j = ++i; 

  system.out.println(i); // 2
  system.out.println(j); // 2

  First Incremment and then Assign 

  - # Post - Increment 

  - int i = 1; 
    int j = j++;

    system.out.println(i); // 1
    system.out.println(j); // 2

    First Assign and then increment 

# CASES :

 - int i = 5++; 
   system.out.println(i)

   we will get compile time error, we can't apply increment operator for literal values 

 - int i = 5; 
   int j = (j++)++;

   we will get compile time error, we can't apply increment/decrement to the nests

 - final int i = 1;
         int j = i ++;
    system.out.println(i)
    system.out.println(j)

    we will get compile time error, we cant apply increment/decrement to the final variable.