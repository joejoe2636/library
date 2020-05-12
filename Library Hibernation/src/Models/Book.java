package Models;
// Generated May 9, 2020 2:34:12 PM by Hibernate Tools 4.3.1


import java.util.Date;


public class Book  implements java.io.Serializable {


     private String bookId;
     private String title;
     private String publishinghouse;
     private Date dateofpublication;
     private String author;
     private Integer pages;
     private String bookcategory;

    public Book() {
    }

	
    public Book(String bookId) {
        this.bookId = bookId;
    }
    public Book(String bookId, String title, String publishinghouse, Date dateofpublication, String author, Integer pages, String bookcategory) {
       this.bookId = bookId;
       this.title = title;
       this.publishinghouse = publishinghouse;
       this.dateofpublication = dateofpublication;
       this.author = author;
       this.pages = pages;
       this.bookcategory = bookcategory;
    }
   
    public String getBookId() {
        return this.bookId;
    }
    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishinghouse() {
        return this.publishinghouse;
    }
    
    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }
    public Date getDateofpublication() {
        return this.dateofpublication;
    }
    
    public void setDateofpublication(Date dateofpublication) {
        this.dateofpublication = dateofpublication;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPages() {
        return this.pages;
    }
    
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public String getBookcategory() {
        return this.bookcategory;
    }
    
    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }




}


