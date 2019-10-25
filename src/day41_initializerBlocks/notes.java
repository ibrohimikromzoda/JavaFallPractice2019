package day41_initializerBlocks;

public class notes {
	
	/*
	 
	 10/22/2019
Topics: initializer blocks:
            1. static initializer block
            2. instance initializer block
            3. constructor vs instance initializer block
            4. static import
Thursday: Encapsulation
package: day41_initializerBlocks
static member: 1. static variable
               2. static methods
               3. static initializer block
               4. inner class (nested class)
static variable: declared in the class, outside any method, WITH static keyword ( class variables )
            shared by the class and all the objects of the class
            
static method: a mtheod that can be called using class name
            static method belongs to the class
static initializer block: used for initializing static variables
            static{
                 statments;
            }
        static initializer block is executed as soon as the class is loaded or being called, only executed 1 time
        static block' execution DOES NOT depend on the object
        we can have multiple static blocks in java, first come first serve
        there is no object instances in any static, so therefore static does not accept none static
        in order to call none static in a static feature, we need to call it through object
instance initializer block: used for initializing instance variables, belongs to object
                {
                    statements;
                }
            instance block's execution depends on the creation of object
            when the object is created, instance block runs first, then the constructor
            instance variables: declared in the class, outside any methods (object)each objects has
             its own copy of instance variables static block VS instance block VS constructor:static block : 
              executed as soon as the class is loaded, first to executed and only executed once instance block:
               execution depends on the creation of object, runs before the constructor constructor:
                execution depends on the creation of object. runs after the instance block
                Thursday:  static import, Encapsulation
	 
	 
	 */

}
