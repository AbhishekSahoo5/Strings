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

Java StringBuffer Class
------------------------
      -->Java StringBuffer class is used to create mutable(modifiable) String objects. The StringBuffer class in java is the same as String class except it is mutable i.e. it can be changed.
      --> Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

      
Constructor of StringBuffer Class
----------------------------------
      1) StringBuffer() :- It creates an empty String Buffer with the initial capacity of 16.
      2) StringBuffer(String str) :- It creates a String buffer with the specified string.
      3) StringBuffer(int capacity) :- It creates an empty String buffer with the specified capacity as length.


Difference Between String V/S StringBuffer V/S StringBuilder 
--------------------------------------------------------------
      1) Storage
      -----------
            String:- In heap area and String Constant Pool.
            StringBuffer:- In heap area.
            StringBuilder:- In heap area.

      2) Object creation
      -------------------
            String:- creates Immutable objects
            StringBuffer:-  creates mutable objects
            StringBuilder:-  creates mutable objects

      3) Memory Allocation
      ---------------------
            String :- If we change the value of a string a lot of times. it will allocate more memory.
            StringBuffer :- Consumes less memory
            StringBuilder :- Consumes less memory

      4) Thread Safe
      ---------------
            String:- Not thread safe(non-synchronized methods)
            StringBuffer:- all methods are synchronized and thus it is thread-safe.
            StringBuilder:-  Not thread safe(non-synchronized methods)
            
            


