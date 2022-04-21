package ql_thuvien;

public class Book extends Document{
    private String authorName;
    private int pageNumber;

    public Book() {
    }

    public Book(String productName, int releaseNumber, String authorName, int pageNumber) {
        super(productName, releaseNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public Book(int documentID, String productName, int releaseNumber, String authorName, int pageNumber) {
        super(documentID, productName, releaseNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"Book{" +
                "authorName='" + authorName + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
