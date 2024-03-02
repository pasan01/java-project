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
public class Books {
    private int bookId;
    private String bookName;
    private String bookCategory;
    private double price;
    private int availableStock;
    public static ArrayList<Books> bookList = new ArrayList<>();
    public static ArrayList<String> categoryList = new ArrayList<>();

    public Books() {
        if(bookList.isEmpty()){
            addDefaultBooks();
        }
    }

    public Books(int bookId, String bookName, String bookCategory, double price, int availableStock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.price = price;
        this.availableStock = availableStock;
    }
      
    private void addDefaultBooks(){
        bookList.add(new Books(1, "Book 1", "Category 1", 100.50, 10));
        bookList.add(new Books(2, "Book 2", "Category 2", 120.50, 12));
        bookList.add(new Books(3, "Book 3", "Category 3", 130.50, 14));
        bookList.add(new Books(4, "Book 4", "Category 4", 140.50, 5));
        bookList.add(new Books(5, "Book 5", "Category 5", 150.50, 20));
        
        categoryList.add("Category 1");
        categoryList.add("Category 2");
        categoryList.add("Category 3");
        categoryList.add("Category 4");
        categoryList.add("Category 5");
    }

    public ArrayList<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<String> categoryList) {
        Books.categoryList = categoryList;
    }
    
    public void addNewBookCategory(String newCategory){
        categoryList.add(newCategory);
    }
    
    public void addNewBook(Books book){
        bookList.add(book);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public ArrayList<Books> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Books> bookList) {
        Books.bookList = bookList;
    }
    
    
}
