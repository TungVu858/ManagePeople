package ql_thuvien;

public class Document {
    private static int temp = 1;
    private int documentID;
    private String productName;
    private int releaseNumber;

    public Document() {
    }

    public Document(String productName, int releaseNumber) {
        this.documentID = temp++;
        this.productName = productName;
        this.releaseNumber = releaseNumber;
    }

    public Document(int documentID, String productName, int releaseNumber) {
        this.documentID = documentID;
        this.productName = productName;
        this.releaseNumber = releaseNumber;
    }

    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentID=" + documentID +
                ", productName='" + productName + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}


