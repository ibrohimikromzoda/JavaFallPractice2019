package day27_CustomMethods;

public class VoidMethods {

	/*
	 
	 Methods: 
    grouping a series of statements together to perform a specific tasks
    methods can make our codes reusuable (don't need to repeat the same set of statements)
Method declaration:
    
    access-modifir specifier  return type  name(){ }
     public         static     void    methodname() { }
during the java course we will learn:
    access-modfiers: public, protected, default, private
    specifiers: static, abstract, final
    return-type: void and any other data types(int, double...)
for now we will only use public and static for the access modifiers and specifiers
return Type:
    1. void methods: the methods does not return any value
    
    methods with parameters :
    sometime method need specific information to perform its tasks, then we need to 
    declare the method with parameters.
    
    ex: 
    int arr = {4,3,2,1};
    Arrays.sort(arr);
    array is the argument, and soret method functionality is to sort the given array
    
   
    
calling methods: we call the methods by their method name
method with arguments :
access-modifier  specifier   return-type  name (parameters) 

	 * declaration of method : access-modifier specifier return-type methdodname() {
	 * statements; }
	 */
	/*
	 * declaration of method: access-modifier specifier return-type methodname() {
	 * statements; }
	 * 
	 */

	public static void main(String[] args) {

		myFirstMethod();
		// method is grouping a series of statements
		// benefits : reusable, can avoid repeating the same set of statements

		even1To100();

	}

	public static void even1To100() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

	public static void myFirstMethod() {

//  public static void main(String[]) {  }  
		// methods must be decleared within the class

		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Khurshed");

	}

}
