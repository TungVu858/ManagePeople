package ql_thuvien;

public class Newspaper extends Document{
    private int releaseDate;

    public Newspaper() {
    }

    public Newspaper(String productName, int releaseNumber, int releaseDate) {
        super(productName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Newspaper(int documentID, String productName, int releaseNumber, int releaseDate) {
        super(documentID, productName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return super.toString()+"Newspaper{" +
                "releaseDate=" + releaseDate +
                '}';
    }
}
