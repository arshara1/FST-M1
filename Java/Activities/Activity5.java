package activities;

//Abstract class
abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String s);

    //Concrete method
    String getTitle(){
        return title;
    }
}
class Mybook extends Book{
    //Define Abstract method
    public void setTitle(String s) {
        title = s;
    }
}
public class Activity5 {
 public static void main (String []args)
 {
     //Initialize title of the book
      String title = "Hover Car Racer";
      //Create object for Mybook
     Book newNovel  = new Mybook();
     //Set title
     newNovel.setTitle(title);
     //Print title
     System.out.println("Tile of the book: " + newNovel.getTitle());
 }

}
