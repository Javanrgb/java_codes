import java.util.List;//Importing the useful Library for the creation of Lists
public class list_of_items {
    public static void main(String[] args) {
     List<String> items = List.of("9","0","B","B","6","B");//Creating a list of items and initializing the list with values
        items.forEach(item->{//Conditional statement to check some condition
           if(item.equals("B")){
               System.out.println("Thi is a B");

           }else{
               System.out.println("This is not  a B");
           }//end of the else loop
        });//end of the iteration when checking for the condition, this case the presence of B
    }//End of the main function
}//End of the created class
