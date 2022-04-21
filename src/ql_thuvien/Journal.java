package ql_thuvien;

public class Journal extends Document{
    private int issuseNumber;
    private int releaseMonth;

    public Journal() {
    }

    public Journal(String productName, int releaseNumber, int issuseNumber, int releaseMonth) {
        super(productName, releaseNumber);
        this.issuseNumber = issuseNumber;
        this.releaseMonth = releaseMonth;
    }

    public Journal(int documentID, String productName, int releaseNumber, int issuseNumber, int releaseMonth) {
        super(documentID, productName, releaseNumber);
        this.issuseNumber = issuseNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssuseNumber() {
        return issuseNumber;
    }

    public void setIssuseNumber(int issuseNumber) {
        this.issuseNumber = issuseNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return super.toString()+"Journal{" +
                "issuseNumber=" + issuseNumber +
                ", releaseMonth=" + releaseMonth +
                '}';
    }
}
