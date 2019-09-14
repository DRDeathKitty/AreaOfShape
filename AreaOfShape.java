// Name: Skyler Stark
// Date: 9/12/2019
// This program calculates the area of a selected shape selected by the user.

import java.util.Scanner; import javax.swing.JOptionPane; 

class Shapes
{
   public static void main(String []args)
   {
      // Declare variables:
      double check = 1, count = 0, area = 0, length, width, base, height, select = 0, sideLength, radius;
      String str;
      final double pi = 3.14159;
      
      
      // while loop to keep the program running until the user selects 5 to exit the program.
      while (count <= 0)
      {
      
         // ask user to select the shape to calculate the area of.
         // catches any input that isn't numeric and returns a error message.
         try
         {
           str = JOptionPane.showInputDialog(null, "Please select the desired shape by entering the number beside the shape, or press 5 to exit.\n" + "Circle: 1\n"
                                           + "Rectangle: 2\n" + "Square: 3\n" + "Triangle: 4\n" + "Quit: 5\n");
           select = Double.parseDouble(str);
         }
         catch (NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
	      }
         
         
         // if block to calculate the area of a circle.
         // catches any input that isn't numeric and returns a error message.
         if(select == 1)
	         {
            
               // tries the calculations
               try
               {
		            str = JOptionPane.showInputDialog(null, "Please enter the radius of the circle.");
                  radius = Double.parseDouble(str);
                  area = (pi * radius) * (pi * radius);
		            JOptionPane.showMessageDialog(null, "The area of your circle is " + area);
               }
               catch (NumberFormatException e) // If the user inputs anthing that isn't a numeric value the user will recieve an error.
               {
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
	            }
               
            }
            
	   
	      // If statement used to calculate the area of a rectangle.
         // catches any input that isn't numeric and returns a error message.
         else if(select == 2)
	         {
            
               // tries the calculations
               try
               {
		            str = JOptionPane.showInputDialog(null, "Please enter the length of the rectangle.");
                  length = Double.parseDouble(str);
		            str = JOptionPane.showInputDialog(null, "Please enter the width of the rectangle.");
                  width = Double.parseDouble(str);
		            area = length * width;
		            JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area);
               }
               catch (NumberFormatException e) // If the user inputs anthing that isn't a numeric value the user will recieve an error.
               {
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
	            }
               
	         }
	   
	      // If statement used to calculate a squares area when the user enters 3 when selecting a shape.
         // catches any input that isn't numeric and returns a error message.
         else if(select == 3)
	         {
               
               // tries the calculations
               try
               {
		         str = JOptionPane.showInputDialog(null, "Please enter the length of the square.");
               sideLength = Double.parseDouble(str);
		         area = sideLength * sideLength;
		         JOptionPane.showMessageDialog(null, "the area of your square is " + area);
               }
               catch (NumberFormatException e) // If the user inputs anthing that isn't a numeric value the user will recieve an error.
               {
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
	            }
               
	         }
	   
	      // If statement used to calculate a triangles area when the user enters 5 when selecting a shape.
         // catches any input that isn't numeric and returns a error message.
         else if(select == 4)
	         {
            
               // tries the calculations
               try
               {
		            str = JOptionPane.showInputDialog(null, "Please enter the base of your triangle.");
                  base = Double.parseDouble(str);
		            str = JOptionPane.showInputDialog(null, "Please enter the height of your triangle.");
                  height = Double.parseDouble(str);
		            area = .5 * (base * height);
		            JOptionPane.showMessageDialog(null, "the area of your triangle is " + area);
               }
               catch (NumberFormatException e) // If the user inputs anthing that isn't a numeric value the user will recieve an error.
               {
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
	            }
               
	         }
	   
	      // If statement used to exit program when user enters 5 when selecting a shape.
         else if(select == 5)
	         java.lang.System.exit(0); // Exits program
	      
         
	      // this final else will catch any imput from the user that isn't the required 1-5 used for selecting a shape.
         // redundant error checking just to make sure the user can't break the program.
         else
	         JOptionPane.showMessageDialog(null, "ERROR: Please Enter a valid key.");             
	   

               
      }
      
   System.out.println("Made by Skyler Stark");
   
   }  
   
}
