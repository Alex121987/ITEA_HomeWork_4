package HW_4_Task1;

public class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(content);
    }
}
