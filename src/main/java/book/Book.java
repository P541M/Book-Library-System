package book;

public class Book{

    //Private so that this class can only access these variables
    //CANNOT BE CHANGED ANYWHERE ELSE
    private String titleOfBook;
    private String nameOfAuthor;
    private boolean borrowedOrNot;

    //Setter for the name
    public void setTitle(String bookTitle){
        titleOfBook = bookTitle.trim(); //Uses trim to clean up
    }

    //Setter for the author
    public void setAuthor(String authorName){
        nameOfAuthor = authorName.trim(); //Uses trim to clean up
    }

    //Setter for availability
    public void setBorrowed(boolean borrowedValue){
        borrowedOrNot = borrowedValue; //Sets the value of its availability
    }

    //Getter for the name
    public String getTitle(){
        return titleOfBook;
    }

    //Getter for the author
    public String getAuthor(){
        return nameOfAuthor;
    }

    //Getter for the availability
    public boolean isBorrowed(){
        return borrowedOrNot;
    }

    /* returns the title of the book if it is available and 
    * sets the state of the book to borrowed.
    * Returns the empty string if the book is not available.*/
    public String borrow(){
        if(!borrowedOrNot){ //Checks if false. negates
            borrowedOrNot = true;
            return titleOfBook;
        }else{
            return ("");
        }
    }

    /* returns true if the book state is borrowed, sets the book state
    * to available. Returns false if the book was already available.*/
    public boolean giveBack(){
        if(borrowedOrNot){ //Checks if its true
            borrowedOrNot = false;
            return true;
        }else{
            return false;
        }
    }

    /* returns a string consisting of the title of the book
    * followed by a colon and a space followed by the name of the author.*/
    public String toString(){
        return titleOfBook + ": " + nameOfAuthor; //Simply returns the text back
    }
}