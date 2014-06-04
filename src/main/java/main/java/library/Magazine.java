package main.java.library;

public class Magazine extends Publication {

    private int issueno;

    public Magazine(String title, int max, int issueno) {
        super(title, max);
        this.issueno = issueno;
    }
    public int getIssueno() {
        return this.issueno;
    }
    public void setIssueno(int issue) {
        this.issueno = issue;
    }
}
