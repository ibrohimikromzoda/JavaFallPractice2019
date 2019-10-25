package day34_Constructors;

public class notes {
	
	/*
	 Topics:  
         1. ArrayList Methods (Remaining)
         2. Constructors
Package: day34_constructors
Warm up:
    1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)
remaining methods of arrayList:
            indexOf(object) : returns the index number of the object from the arrayList, retuns int 
            lastIndexOf(Object): returns the last index number of the object from the arraylist, returns int
            Arrays.asList(Object Array):  used for converting object arrays to List interface
                we will learn List Interface in future
            addAll(Interface): used for storing multiple objects to ArrayList
            removeAll(Interface): remoevs all the matching objects
sorting the array:
        Arrays.sort(VariableName);  sorts in ascending order
        Arrays class is presented in "java.util" package
sorting the arrayList:
        Collections.sort(VariableName);  sorts in ascending order
        Collections class is presented in "java.util" package
regular methods:
        access-modifier specifier return-type  methodname(parameter){
        }
Constructor: it's a very special method, used for creating the object of the class
        3 types of methods:
                        1. void methods
                        2. return methods
                        3. constructor (special)
            Evry single class MUST have a constructor, if we didn't give the constructor, then the compiler will give the deafult (no-arg) constructor
            constructor methods can be overload
            if we want to have more than one constructor we MUST overload the constructor 
decleration of constructor:
        default constructor : constructor without argument
                access-modifier  className(){
                        statemnets;
                }
        constructor with argument:
            access-modifier  className ( parameter ){
                    statements;
            }
        constructor cannot have return-type and specifier.
        constructor' name MUST be same with the class name
        constructor' execution depends on the creation of the object
constructor calls:
        only a constructor can call another constructor
create an object from a class:
        className  referenceName =  new   existingConstructorMethod
        when we create object from a class, we MUST use existing constructor
	 */

}
