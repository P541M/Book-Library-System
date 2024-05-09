package book;

public class Runner{
    public static void main(String[] args){

        //Instances of book class
        Book myBookOne = new Book();
        Book myBookTwo = new Book();

        myBookOne.setTitle("The Midnight Library"); //Sets the name
        myBookOne.setAuthor("Matt Haig"); //Sets the author
        myBookOne.setBorrowed(false); //Available for borrow

        myBookTwo.setTitle("Holy Bible");
        myBookTwo.setAuthor("40+ Authors");
        myBookTwo.setBorrowed(true);

        System.out.println("Title of book: " + myBookOne.getTitle()); //Gets the name
        System.out.println("Author of book: " + myBookOne.getAuthor()); //Gets the author
        System.out.println("Borrowed: " + myBookOne.isBorrowed() + "\n"); //Available for borrow

        System.out.println("Title of book: " + myBookTwo.getTitle());
        System.out.println("Author of book: " + myBookTwo.getAuthor());
        System.out.println("Borrowed: " + myBookTwo.isBorrowed() + "\n");

        String borrowedBook = myBookOne.borrow(); //Testing the borrow method
        if(!borrowedBook.isEmpty()){ //Checks if not empty
            System.out.println("Borrowed: " + borrowedBook);
        }else{
            System.out.println(myBookOne.toString() + " is not available.");
        }

        borrowedBook = myBookOne.borrow(); //Testing the borrow method once more to check if it worked.
        if(!borrowedBook.isEmpty()){ //Checks if not empty
            System.out.println("Borrowed: " + borrowedBook);
        }else{
            System.out.println(myBookOne.toString() + " is not available.");
        }

        boolean returnedOne = myBookOne.giveBack(); //Testing the giveBack method
        if(returnedOne){
            System.out.println(myBookOne.toString() + " has been returned.");
        }else{
            System.out.println(myBookOne.toString() + " is available.");
        }

        returnedOne = myBookOne.giveBack(); //Testing the giveBack method once more to check if it worked.
        if(returnedOne){
            System.out.println(myBookOne.toString() + " has been returned.");
        }else{
            System.out.println(myBookOne.toString() + " is available.");
        }

        System.out.print("\n");

        boolean returnedTwo = myBookOne.giveBack(); //Testing the giveBack method for the book that was borrowed
        returnedTwo = myBookTwo.giveBack();
        if(returnedTwo){
            System.out.println(myBookTwo.toString() + " has been returned.");
        }else{
            System.out.println(myBookTwo.toString() + " is available.");
        }

        System.out.print("\n");
        System.out.println(myBookOne.toString() + ": " + myBookOne.isBorrowed()); //Should be false
        System.out.println(myBookTwo.toString() + ": " + myBookTwo.isBorrowed()); //Should be false

        //Prints the book(s) information
        System.out.println("\nmyBookOne: \n" + myBookOne.toString());
        System.out.println("\nmyBookTwo: \n" + myBookTwo.toString());
    }
}