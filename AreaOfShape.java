// Name: Skyler Stark
// Class: CST-180
// Date: 9/15/2019
// This program calculates the area of a selected shape.

import java.util.Scanner; import javax.swing.JOptionPane; import java.lang.Object;

class Shapes
{
   public static void main(String []args)
   {
      // Declare variables:
      double check = 1, count = 0, area = 0, angle, side, length, width, base, height, select = 0, sideLength, radius, radiusOutter;
      String str;
      final double pi = 3.14159;
      
      
      while (count <= 0)
      {
      
         // ask user to select the shape to calculate the area of.
         try
         {
         
           str = JOptionPane.showInputDialog(null, "Please select the desired shape by entering the number beside the shape, or press 0 to exit.\n" + "Circle: 1\n"
                                             + "Rectangle: 2\n" + "Square: 3\n" + "Triangle: 4\n" + "Cube: 5\n" + "Parallelogram: 6\n" + "Kite: 7\n" + "Pentagon: 8\n"
                                             + "Hexagon: 9\n" + "Octagon: 10\n" + "Annulus: 11\n" + "Exit: 0\n");
           select = Double.parseDouble(str);
           
         }
         
         // Catches when the user enters something that isn't a numerical value.
         catch (NumberFormatException e)
         {
         
            JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
            
	      }
         
         
         // if block to calculate the area of a circle.
         if(select == 1)
	         {
               
               // Try statement that will try to perform the operations
               try
               {
               
		            str = JOptionPane.showInputDialog(null, "Please enter the radius of the circle.");
                  radius = Double.parseDouble(str);
                  
                  area = (pi * radius) * (pi * radius);
                  
		            JOptionPane.showMessageDialog(null, "The area of your circle is " + area + " inches squared");
                  
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
            }
            
	   
	      // If statement used to calculate the area of a rectangle.
         else if(select == 2)
	         {
               
               // Try statement that will try to perform the operations
               try
               {
               
		            str = JOptionPane.showInputDialog(null, "Please enter the length of the rectangle.");
                  length = Double.parseDouble(str);
		            str = JOptionPane.showInputDialog(null, "Please enter the width of the rectangle.");
                  width = Double.parseDouble(str);
                  
		            area = length * width;
                  
		            JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area + " inches squared");
                  
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
	         }
	   
	      // If statement used to calculate the area of a square.
         else if(select == 3)
	         {
               
               // Try statement that will try to perform the operations
               try
               {
               
		         str = JOptionPane.showInputDialog(null, "Please enter the length of the square.");
               sideLength = Double.parseDouble(str);
               
		         area = sideLength * sideLength;
               
		         JOptionPane.showMessageDialog(null, "the area of your square is " + area + " inches squared");
               
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
	         }
	   
	      // If statement used to calculate the area of a triangle.
         else if(select == 4)
	         {
               
               // Try statement that will try to perform the operations
               try
               {
               
		            str = JOptionPane.showInputDialog(null, "Please enter the base of your triangle.");
                  base = Double.parseDouble(str);
		            str = JOptionPane.showInputDialog(null, "Please enter the height of your triangle.");
                  height = Double.parseDouble(str);
                  
		            area = .5 * (base * height);
                  
		            JOptionPane.showMessageDialog(null, "the area of your triangle is " + area + " inches squared");
                  
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
	         }
	   
	      // If statement used to calculate athe area of a cube.
         else if(select == 5)
         {
         
            // Try statement that will try to perform the operations
            try
            {
            
               str = JOptionPane.showInputDialog(null, "Please enter the length of your cube.");
               length = Double.parseDouble(str);
               str = JOptionPane.showInputDialog(null, "Please enter the width of your cube.");
               width = Double.parseDouble(str);
               str = JOptionPane.showInputDialog(null, "Please enter the height of your cube.");
               height = Double.parseDouble(str);
               
               area = length * width * height;
               
               JOptionPane.showMessageDialog(null, "the area of your cube is " + area + " inches squared");
               
            }
            
            // Catches when the user enters something that isn't a numerical value.
            catch (NumberFormatException e)
            {
            
               JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
               
	         }
               
         }
         
         // If statement used to calculate the area of a parallelogram.
         else if(select == 6)
         {
         
            // Try statement that will try to perform the operations
            try
            {
            
               // Requests the user to unput what type of parallelogram calculation they want to use.
               str = JOptionPane.showInputDialog(null, "Please select what type of parallelogram you want to calculate.\nBase and height: 1\nSides and an angle between them: 2\nDiagonals and an angle between them: 3");
               select = Double.parseDouble(str);
               
               
               // Calculates the area of a parallelogram with the Base and Height given.
               if(select == 1)
               {
               
                  // Try statement that will try to perform the operations
                  try
                  {
                  
                     str = JOptionPane.showInputDialog(null, "Please enter the base of your parallelogram.");
                     base = Double.parseDouble(str);
                     str = JOptionPane.showInputDialog(null, "Please enter the height of your parallelogram.");
                     height = Double.parseDouble(str);
                     
                     area = base * height;
                     
                     JOptionPane.showMessageDialog(null, "the area of your parallelogram is " + area + " inches squared");
                     
                  }
                  
                  // Catches when the user enters something that isn't a numerical value.
                  catch (NumberFormatException e)
                  {
                  
                     JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                     
	               }
                  
               }
               
               // Calculates the area of a parallelogram with the Sides and an angle between them given.
               else if(select == 2)
               {
               
                  // Try statement that will try to perform the operations
                  try
                  {
                  
                     str = JOptionPane.showInputDialog(null, "Please enter the base of your parallelogram.");
                     base = Double.parseDouble(str);
                     str = JOptionPane.showInputDialog(null, "Please enter the side of your parallelogram.");
                     side = Double.parseDouble(str);
                     str = JOptionPane.showInputDialog(null, "Please enter the angle of your parallelogram.");
                     angle = Double.parseDouble(str);
                     
                     area = side * base * Math.sin(Math.toRadians(angle));
                     
                     JOptionPane.showMessageDialog(null, "the area of your parallelogram is " + area + " inches squared");
                     
                  }
                  
                  // Catches when the user enters something that isn't a numerical value.
                  catch (NumberFormatException e)
                  {
                  
                     JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                     
	               }
               }
                  // Calculates the area of a parallelogram with the Diagonals and an angle between them given. NOT FINISHED YET
               else if(select == 3)
               {
               
                  JOptionPane.showMessageDialog(null, "Sorry, this part of the calculator hasn't been created yet.");
                  
               }
               else
                  JOptionPane.showMessageDialog(null, "Value out of range");
               
            } // 1st parallelogram try statement
            
            // Catches when the user enters something that isn't a numerical value.
            catch (NumberFormatException e)
            {
            
            JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
            
            }
            
         } // 1st parallelogram if statement
         
         // If statement used to calculate the area of a kite.
         else if(select == 7)
         {
         
            // Try statement that will try to perform the operations
            try
            {
               
               str = JOptionPane.showInputDialog(null, "Please select what type of kite you want to calculate.\nDiagonals: 1\nTwo unequal sides and angle between them: 2");
               select = Double.parseDouble(str);
               
               // calculates the area of a kite when given kites diagnals.
               if(select == 1)
               {
               
                  // Try statement that will try to perform the operations
                  try
                  {
                  
                  	str = JOptionPane.showInputDialog(null, "Please enter the width of your kite.");
                  	width = Double.parseDouble(str);
                  	str = JOptionPane.showInputDialog(null, "Please enter the height of your kite.");
                  	height = Double.parseDouble(str);
                                       
                  	area = (width * height) / 2;
                                    
                  	JOptionPane.showMessageDialog(null, "the area of your kite is " + area + " inches squared");
                     
                  }
                  
                  // Catches when the user enters something that isn't a numerical value.
                  catch (NumberFormatException e)
                  {
                  
                  	JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                     
                  }
                  
               } 
               
               // calculates the area of a kite when two non-congruent side lengths and the angle between those two sides are given..
               else if(select == 2)
               {
               
                  // Try statement that will try to perform the operations
                  try
                  {
                  
                  	str = JOptionPane.showInputDialog(null, "Please enter the first side length of your kite.");
                  	length = Double.parseDouble(str);
                  	str = JOptionPane.showInputDialog(null, "Please enter the second side length of your kite.");
                  	sideLength = Double.parseDouble(str);
                     str = JOptionPane.showInputDialog(null, "Please enter the angle of your kite.");
                  	angle = Double.parseDouble(str);
                                       
                  	area = length * sideLength * Math.sin(Math.toRadians(angle));
                                    
                  	JOptionPane.showMessageDialog(null, "the area of your kite is " + area + " inches squared");
                     
                  }
                  
                  // Catches when the user enters something that isn't a numerical value.
                  catch (NumberFormatException e)
                  {
                  
                  	JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                     
                  }
                  
               }
               else
                  JOptionPane.showMessageDialog(null, "Value out of range");
                 
            } 
            
            // Catches when the user enters something that isn't a numerical value.  
            catch (NumberFormatException e)
            {
            
               JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
               
            }
 
         }
         
         // If statement used to calculate the area of a pentagon.
         else if(select == 8)
	         {
               
               // Try statement that will try to perform the operations
               try
               {
               
		            str = JOptionPane.showInputDialog(null, "Please enter the side length of the pentagon.");
                  length = Double.parseDouble(str);
               
		            area = (length * length) * Math.sqrt(25 + 10 * Math.sqrt(5)) / 4;
               
		            JOptionPane.showMessageDialog(null, "the area of your pentagon is " + area + " inches squared");
                  
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
	         }
            
         // If statement used to calculate the area of a hexagon.
         else if(select == 9)
	         {
            
               // Try statement that will try to perform the operations
               try
               {
		            str = JOptionPane.showInputDialog(null, "Please enter the side length of the hexagon.");
                  length = Double.parseDouble(str);
               
		            area = 3 * Math.sqrt(3) / 2 * (length * length);
                        
		            JOptionPane.showMessageDialog(null, "the area of your hexagon is " + area + " inches squared");
                  
               }
               
               // Catches when the user enters something that isn't a numerical value.
               catch (NumberFormatException e)
               {
               
                  JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                  
	            }
               
	         }
            
            // If statement used to calculate the area of a octagon.
            else if(select == 10)
	            {
               
                  // Try statement that will try to perform the operations
                  try
                  {
                  
		               str = JOptionPane.showInputDialog(null, "Please enter the side length of the octagon.");
                     length = Double.parseDouble(str);
                  
		               area = 2 * (1 + Math.sqrt(2)) * length * length;
                           
		               JOptionPane.showMessageDialog(null, "the area of your octagon is " + area + " inches squared");
                     
                  }
                  
                  // Catches when the user enters something that isn't a numerical value.
                  catch (NumberFormatException e)
                  {
                  
                     JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                     
	               }
                  
	            }
               
             // If statement used to calculate the area of a annulus.
             else if(select == 11)
	             {
                
                   // Try statement that will try to perform the operations
                   try
                   {
                   
		               str = JOptionPane.showInputDialog(null, "Please enter the inner radius of the annulus.");
                     radius = Double.parseDouble(str);
                     str = JOptionPane.showInputDialog(null, "Please enter the outter radius of the annulus.");
                     radiusOutter = Double.parseDouble(str);
                   
		               area = pi * ((radiusOutter * radiusOutter) - (radius * radius));
                            
		               JOptionPane.showMessageDialog(null, "the area of your annulus is " + area + " inches squared");
                     
                   }
                   
                   // Catches when the user enters something that isn't a numerical value.
                   catch (NumberFormatException e)
                   {
                   
                      JOptionPane.showMessageDialog(null, "ERROR: Non numeric value entered, please enter a valid numeric value.");
                      
	                }
                  
	            }
                  
         //Exits the program   
         else if(select == 0)
	         java.lang.System.exit(0);
	      
         
	      // this final else will catch any imput from the user that isn't the required 1-5 used for selecting a shape.
         else
	         JOptionPane.showMessageDialog(null, "ERROR: Please Enter a valid key.");

      }
   // Signs the program in console.
   System.out.println("Made by Skyler Stark. AKA DR.DeathKitty");

   }

}
