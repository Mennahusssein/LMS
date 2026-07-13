package Model;
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int copies;
    //private static int counterId=1;

    public Book(String title, String author, String category){
        //this.bookId=counterId++;
        setTitle(title);
        setAuthor(author);
        setCategory(category);
        setCopies(1);
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public void setTitle(String title){
        if(title==null || title.isBlank()){
            throw new IllegalArgumentException("invalid title");
        }
        this.title=title;
    }
    public void setAuthor(String author){
        if(author==null || author.isBlank()){
            throw new IllegalArgumentException("invalid author name");
        }
        this.author=author;
    }
    public void setCategory(String category){
        if(category==null || category.isBlank()){
            throw new IllegalArgumentException("invalid category");
        }
        this.category=category;
    }
    public void setCopies(int copies){
        if(copies<=0){
            throw new IllegalArgumentException("copies must be a positive integer");
        }
        this.copies=copies;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }
    public int getCopies(){
        return copies;
}}
