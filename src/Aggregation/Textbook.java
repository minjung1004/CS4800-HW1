package Aggregation;

public class Textbook {
    private String txtbookTitle;
    private String txtbookAuthor;
    private String txtbookPublisher;

    public Textbook(String txtbookTitle, String txtbookAuthor, String txtbookPublisher){
        this.txtbookTitle = txtbookTitle;
        this.txtbookAuthor = txtbookAuthor;
        this.txtbookPublisher = txtbookPublisher;
    }

    public String getTxtbookTitle(){
        return txtbookTitle;
    }

    public String getTxtbookAuthor(){
        return txtbookAuthor;
    }

    public String getTxtbookPublisher(){
        return txtbookPublisher;
    }
}
