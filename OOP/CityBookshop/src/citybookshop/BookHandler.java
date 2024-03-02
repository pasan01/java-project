/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citybookshop;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class BookHandler {
    
    Books books = new Books();
    ArrayList<Books> bookList;
    ArrayList<String> categoryList;
    
    public void addBooksCategories(String bookcategory){
        books.addNewBookCategory(bookcategory);
    }
    
    public double viewPrice(String bookName){
        double bookPrice = 0;
        bookList = books.getBookList();
        
        for(Books book: bookList){
            if(book.getBookName().equalsIgnoreCase(bookName)){
                bookPrice = book.getPrice();
            }
        }
        
        return bookPrice;
    }
    
    public String searchBookCategory(String categoryName){
        categoryList = books.getCategoryList();
        String response = "Category Not Available";
        
        for(String category: categoryList){
            if(category.equalsIgnoreCase(categoryName)){
                response = "Category " + category + " is available";
                break;
            }
        }
        
        return response;
    }
    
    public ArrayList<Books> viewAllTheBookDetails(){
        bookList = books.getBookList();
        
        return bookList;
    }
    
    public int searchForStock(String bookName){
        bookList = books.getBookList();
        int stock = 0;
        
        for(Books book : bookList){
            if(book.getBookName().equalsIgnoreCase(bookName)){
                stock = book.getAvailableStock();
                break;
            }
        }
        
        return stock;
    }
    
    public void addNewBook(Books books){
        books.addNewBook(books);
    }
}
