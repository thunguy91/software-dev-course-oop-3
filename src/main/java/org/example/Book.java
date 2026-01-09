package org.example;

public class Book extends LibraryItem{
    protected int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }

    public void readBook(){
        System.out.println("Reading " + title + " by " + author + "... \nDone!");
    }
}
