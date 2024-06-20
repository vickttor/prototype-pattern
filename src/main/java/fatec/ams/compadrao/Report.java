package fatec.ams.compadrao;

public class Report extends Document {
    private String author;

    public Report(String title, String content, String author) {
        super(title, content);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Report clone() {
        Report clone = (Report) super.clone();
        clone.setAuthor(this.author);
        return clone;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
