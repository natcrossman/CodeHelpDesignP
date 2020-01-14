import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandDP {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CommandStore store = CommandStore.getInstance();
	        while(true) {
	   
	        	 System.out.print("Choose a Command to Run:\n"
		        		+ "1. Buy Apple Stock\n"
		        		+ "2. Buy Samsung Stock\n"
		        		+ "3. Sell Apple Stock\n"
		        		+ "4. Sell Samsung Stock\n"
		        		+ "5. Undo last command\n"
		        		+ "6. Redo last command\n"
		        		+ "==> ");
	        	 String choice = br.readLine();
	        	 System.out.print("How many shares?\n"
			        		+ "==> ");
	        	 String amount = br.readLine();
	        	 switch(choice) {
	        	 case "1":
	        		 store.runCommand(new BuyCommand("Apple",Integer.parseInt(amount)));
	        		 break;
	        	 case "2":
	        		 store.runCommand(new BuyCommand("Samsung",Integer.parseInt(amount)));
	        		 break;
	        	 case "3":
	        		 store.runCommand(new SellCommand("Apple",Integer.parseInt(amount)));
	        		 break;
	        	 case "4":
	        		 store.runCommand(new SellCommand("Samsung",Integer.parseInt(amount)));
	        		 break;
	        	 case "5":
	        		 store.undo();
	        		 break;
	        	 case "6":
	        		 if(!store.redo()) {
	        			 System.out.println("Nothing to redo!");
	        		 }
	        		 break;
	        	 }
		     
	        }

	    }
	    
	}
