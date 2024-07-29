# Strings

Whats is a String?
------------------
      --> String is basically an object that represents a sequence of character value.
      eg. char[]ch={'j','a','v','a'};    is same as      String str="java";

How to create a string object?
------------------------------
    1) By string literal
    --------------------
            String str="Abhishek";
            
    2) by new keyword
    ------------------
            String str=new String("Abhihsek");

Difference Between String literal method V/S new keyword method
----------------------------------------------------------------
--> When a string is declared and initialized in literal method then the value is stored in STRING CONSTANT POOL inside heap memory.
When a string is declared and initialized by using new keyword  then the value is stored inside heap memory but not inside STRING CONSTANT POOL.

--> (literal method)If multiple variable has the same values then all those variables will pointing towards that one string.
(using new keyword) If multiple variable has the same values then the same values are stored multiple times.

--> (literal method) No duplicacy.
(using new keyword) high chances of duplicacy.

--> (Literal method) is more optimized.
(using new keyword) is less optimized.



