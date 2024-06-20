package fatec.ams.compadrao;

public class Contract extends Document {
    private String client;

    public Contract(String title, String content, String client) {
        super(title, content);
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public Contract clone() {
        Contract clone = (Contract) super.clone();
        clone.setClient(this.client);
        return clone;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}
