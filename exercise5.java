

/*
 My name is Bibata Rabba and this is my own work.
 */
import java.io.File;
import java.util.Scanner;
public class exercise5 {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\rabba\\Documents\\GCU BIO.docx");
	Scanner input = new Scanner(file);
        //main method of the 2d array
        char[][] mainarray = new char[20][45];
        int wordnumber = 40*25;
        //new 1d char array to store input
        char[] filechars = new char[wordnumber];
        //counts the words that go into filechars from input
        int totalcount = 0;
        int index = 0;
        String outputstring ="";
        //reads input from the file and build a new string as the characters are extracted to the 1d array. counts all the words
        while(input.hasNext()){
            String acceptedword = input.next();
            //check the begining, accepted or functionning word 
            if(totalcount == 0){
                for (int i =0; i < acceptedword.length(); i++){
                    filechars[totalcount]=acceptedword.charAt(i);
                    totalcount++;
                }
            }
            // we need to add _ for space
            else if (totalcount+acceptedword.length() < (wordnumber-1)){
                filechars[totalcount]='_';
                totalcount++;
                for (int i =0; i < acceptedword.length(); i++){
                    filechars[totalcount]=acceptedword.charAt(i);
                    totalcount++;
                }   
            }
            else{
                int remainder= (wordnumber-1) - (totalcount+acceptedword.length());
                for(int i=0; i< remainder; i++){
                    filechars[totalcount]=acceptedword.charAt(i);
totalcount++;
 }
                
            }
        }
        // add @ to rest of the file if there is space
        if(totalcount<wordnumber){
            while(totalcount<wordnumber-1){
                filechars[totalcount]='@';
                totalcount++;
            }
        }
        //testing input
        //for(int i=0; i <inputfilechars.length; i++){
        //System.out.println(inputfilechars[i]);
    
             for(int row =0; row < mainarray.length; row++){
                  for(int column =0; column < mainarray[row].length; column++){
                       if (index < filechars.length) {
					mainarray[row][column] = filechars[index];
					index++;
                        }

                    }
             }
             //test to make sure array looks correct
             //for(int row =0; row < mainarray.length; row++){
                  //for(int column =0; column < mainarray[row].length; column++){
                      //System.out.print(mainarray[row][column]);
//}
 //System.out.println();  
            // }     
             //outputs a string counting from column to row
        for (int column = 0; column <45; column++){
            for(int row =0; row < 20; row++){
                if(mainarray[row][column]== '@'){
                    //do nothing                    
                }
                else if(mainarray[row][column]== '_'){
                    outputstring += " ";
                    //add a space
                }
                else{
                    outputstring += mainarray[row][column];
                }
            }
}
 System.out.print(outputstring);
    }
        
    }
                
        
    
    

