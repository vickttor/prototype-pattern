package fatec.ams.sempadrao;

public class Contract {
    private String title;
    private String content;
    private String client;

    public Contract(String title, String content, String client) {
        this.title = title;
        this.content = content;
        this.client = client;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}

