
public class Part {
	
////////////////////////////////////////////////////////////////////////////////////////

		private int partID;
		private String partDescription;
		private double partSellPrice;
		public static final String DEFAULT_DESCRIPTION = "no part description";
		public static final double DEFAULT_SELL_PRICE = 0;
		
////////////////////////////////////////////////////////////////////////////////////////
		
		// The constructor with one parameter for the part ID must use 
		// 'this' to call the overloaded constructor (the one with three parameters).
		// Part (ID : int) 
		
		 public Part(int ID) {
			 
			// this.Part(int ID, String desc, double sellprice);
			 
		 }
		 
////////////////////////////////////////////////////////////////////////////////////////
		
		 
		// Part (ID : int, desc : String, sellPrice : double)
		public Part(int ID, String desc, double sellprice) {
			if (desc == null)
			{
				System.out.print(DEFAULT_DESCRIPTION);
			}
			
		
			//Edit the part selling price to make sure it is greater than or equal to zero. 
			// If the part selling price is invalid use the default sell price (DEFAULT_SELL_PRICE).
			
			if ( sellprice < 0) {
				sellprice = DEFAULT_SELL_PRICE;
			}
			
			//The constructor with one parameter for the part ID must use 'this' to call the overloaded constructor
			//(the one with three parameters). Use the default constants for description and sell price for the
			//missing values. Implement the DRY principle by calling the set methods from 
			//the overloaded constructor (the one with three parameters).
			
			
			
		}
		
		
////////////////////////////////////////////////////////////////////////////////////////
}


		 /*
		  
		  The UML class diagram for the classes is provided below.

Class diagrams for Chapter 11 project.Preview the documentView in a new window
These are all service classes. In addition you will need to create an application class named ManageParts. The detail requirements for each class are provided below.

Download the MangeParts.zipView in a new window file and unzip it. Import the project into Eclipse. You will find partially completed versions of the Part, PurchasedPart, and ManufacturedPart classes. Modify these classes as described below.
The following requirements are for the Part class.

Create the two constructors described in the UML class diagram. These constructors must edit the description to ensure it is not null or empty (zero length). If either condition occurs use the default value (DEFAULT_DESCRIPTION). Edit the part selling price to make sure it is greater than or equal to zero. If the part selling price is invalid use the default sell price (DEFAULT_SELL_PRICE).

The constructor with one parameter for the part ID must use 'this' to call the overloaded constructor (the one with three parameters). Use the default constants for description and sell price for the missing values. Implement the DRY principle by calling the set methods from the overloaded constructor (the one with three parameters).

Create a toString method that will return a String object containing the value of each data member. Use the @Override annotation. Display the class of the object using the getClass method.

Create get and set methods for each of the 3 private data variables. The part ID must be greater than or equal to zero. The sell price must be greater than or equal to zero. The part description cannot be null and must have a length greater than zero. Do not update the private variables if the new values are not valid.

Create a public method named getTotalCost that returns 0.

Do not create additional data members or methods.

The following requirements are for the PurchasedPart class.

Make this class a subclass of the Part class.

Create the three constructors described in the UML class diagram. The first two constructors should use 'this' to call the third constructor (the constructor with six parameters). Use a combination of arguments and default values for the necessary arguments. The third constructor should use "super" to call the superclass constructor passing the appropriate arguments. Create edits to ensure the purchase price and the handling cost cannot be negative. Use the DEFAULT_PURCHASE_PRICE and DEFAULT_HANDLING_COST constants if the parameter values are invalid. Use the DEFAULT_VENDOR_NAME constant if a vendor name is not provided (it is null or has a length of zero). Use the public default constants from the Part class as needed. Implement the DRY principle by calling the set methods from the overloaded constructor (the one with three parameters).
Create a toString method that will return a String object that contains the value of each data member. Use the @Override annotation. Display the class of the object using the getClass method. Call the toString method in the superclass to display the Part data.
Create get and set methods for each of the 3 private data variables. The handling cost must be greater than or equal to zero. The purchase price must be greater than or equal to zero. The vendor cannot be null and must have a length greater than zero. Do not update the private variables if the new values are not valid.
Create a public method named getTotalCost that returns the total cost from the super class plus the handling cost plus the purchase price. Use the @Override annotation to insure this method overrides the method of the same name in the parent class.
Do not create additional data members or methods.
The following requirements are for the ManufacturedPart class.
Make this class a subclass of the Part class.
Create the three constructors described in the UML class diagram. The first two constructors should use 'this' to call the third constructor (the constructor with five parameters). Use a combination of arguments and default values for the necessary arguments. The third constructor should use "super" to call the superclass constructor passing the appropriate arguments.  Create edits to ensure the labor cost cannot be negative. Create edits to ensure the material cost cannot be negative. Use the default values if the data is invalid (DEFAULT_LABOR_COST and DEFAULT_MATERIAL_COST. Use the public default constants from the Part class as needed.
Create a toString method that returns a String object containing the value of each data member. Use the @Override annotation.Display the class of the object using the getClass method. Call the toString method in the superclass to display the Part data.
Create a public method named getTotalCost that returns the total cost from the super class plus the material cost plus the labor cost. Use the @Override annotation to insure this method overrides the method of the same name in the parent class.
Do not create additional data members or methods.
The following requirements apply to the client application that will use the classes described above. Create a public ManageParts class. This class will have the main method.
Create an ArrayList in the main method in ManageParts.  Make the ArrayList template type be Part. This will enable you to store objects of any subtype of Part.
Create a main method in the ManageParts  class. Display the menu below when the application starts. Redisplay the menu if an invalid value (not 1 through 5) is entered and continue the application.
Create Purchased Part
Create Manufactured Part
List a part
List all parts
Exit
Use a Scanner object for all user input. Use System.out for all output.
Create a PurchasedPart object if the user enters menu option 1. Get the data for the object from the user using a Scanner object. Prompt the user to enter each piece of data (id, description, sell price, purchase price, vendor, and handling cost). Use this data to create the object. Store the object in the ArrayList.
Create a ManufacturedPart object if the user enters menu option 2. Get the data for the object from the user using a Scanner object. Prompt the user to enter each piece of data (id, description, sell price, labor cost, and material cost). Use this data to create the object. Store the object in the ArrayList.
Part ID number must be unique in the ArrayList. Edit to make sure you are not creating a part object (PurchasedPart,  ManufacturedPart , or SubcontractedPart) with an ID that already exists. Display an error message and ask the user to reenter the ID if the original ID already exists for an object in the ArrayList.
Display the data for one object in the ArrayList if the user enters menu option 3. Prompt the user to enter a part ID. Display an error message if an object with that ID does not exist in the ArrayList. Make sure you can handle the case where the ArrayList is empty. Display the object using the toString method if a matching object is found. Also display the cost by calling the getTotalCost method. Do NOT include the getTotalCost as part of the toString method. You must call getTotalCost separately from toString. See sample output.
Display all objects in the ArrayList if the user enters menu option 4. Format the output exactly as shown in the sample output. Display the object using the toString method. Also display the cost by calling the getTotalCost method. Do NOT include the getTotalCost as part of the toString method. You must call getTotalCost separately from toString. Format the part cost as currency whenever it is displayed. Make sure you can handle the case where the ArrayList is empty.
End the application if the user enters menu option 5. Display an ending message "Thanks for using the parts manager!".
Do NOT use the instanceof operator in this assignment. It is not needed.
Watch this video (Links to an external site.) (4:23 min, .mp4) to see how the application should work.
Add a comment to each source code file for your name and the date.
This assignment is designed based on the material covered to this point in the text book and online notes. Use only features and code covered to this point in the book, online notes, or Discussions. Failure to follow this rule may result in a zero for your assignment. WhyView in a new window?
You can resubmit your assignment any time up to the deadline. Projects cannot be submitted late. Please zip ALL your project files and attach the .zip file to the assignment drop box.
		  */
		 
		 


