public class Book
{
        String Name;
        int Page;
                Book (String BookName, int BookPage){

            Name = BookName;
            Page = BookPage;
        }


    public void read (){
            System.out.println(Name+ Page+  " is reading");
        }
    public void finish (){
        System.out.println(Name+ Page+  " finished");
    }
    }

