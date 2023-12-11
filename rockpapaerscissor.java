package game;
import java.util.Scanner;
import java.util.Random;
public class rockpapaerscissor {
	    public static void main(String[] args) {
	           
	      int userinput, computerinput, rock=0, paper=1, scissor=2; 
	      Scanner input = new Scanner (System.in);  
	      Random rnd = new Random();  
	      System.out.println("ROCK - PAPER - SCISSOR GAME");
	      System.out.println("Enter your choice (0=rock, 1=paper, 2=scissor)");
	      userinput = input.nextInt();
	              
	      while (userinput > 2) {
	            System.out.println("give number between 0 and 2");
	            userinput = input.nextInt();
	      }
	       
	       if (userinput == rock)
	       {
	         System.out.println("User chose ROCK");
	       }
	      else if(userinput== paper)
	      {
	       
	          System.out.println("User chose PAPER");
	      }
	      else if(userinput== scissor)
	      {
	          System.out.println("User chose SCISSORS");
	      }
				
	      
	      computerinput = rnd.nextInt(3);
	      
	      
	      if(computerinput == rock)
	      {
	        System.out.println("Computer chose ROCK");
	      }
	     
	      else if(computerinput == paper)
	      {
	          System.out.println("Computer chose PAPER");
	      }
	      else if(computerinput== scissor)
	      {
	          System.out.println("Computer chose SCISSORS");
	      }
	      
	      
	     
	      while (userinput == computerinput) {
	            System.out.println("draw try again");
	            
	            userinput = input.nextInt();
	                          while (userinput > 2) {
	                            System.out.println("give number between 0 and 2");
	                            userinput = input.nextInt();
	                            }
	            computerinput = rnd.nextInt(3);
	                       
	                        if (userinput == rock)
	                            {
	                                System.out.println("User chose ROCK");
	                            }
	                        
	                        else if(userinput== paper)
	                            {
	                                System.out.println("User chose PAPER");
	                            }
	                        else if(userinput==scissor)
	                            {
	                                System.out.println("User chose SCISSORS");
	                            }
				      
	                       
	                        if(computerinput == rock)
	                            {
	                                System.out.println("Computer chose ROCK");
	                            }
	                        
	                        else if(computerinput == paper)
	                        	{
	                                 System.out.println("Computer chose PAPER");
	                        	}
	                        else if( computerinput== scissor)
	                            {
	                                 System.out.println("Computer chose SCISSORS");
	                            }
	                            
	                        }
	      
	
	      if (computerinput==rock)
	        {
	            if (userinput==paper)
	            {  
	                System.out.println("User wins!");
	            }
	            else 
	            {
	                System.out.println("Computer Wins");
	            }
	        }
	      else if (computerinput==paper)
	      {
	        if (userinput==rock)
	            {
	                System.out.println("Computer wins");
	            }
	        else
	            {
	                System.out.println("User Wins!");
	            }
	      }
	      else if (userinput==rock)
	      {
	        System.out.println("User Wins");
	      }
	      else
	      {
	          System.out.println("Computer Wins");
	      } 
	    }
	    
	    
}
