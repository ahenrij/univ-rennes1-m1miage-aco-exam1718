public class Line implements Visitable {

    private String content;

    public Line(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLine(this);
    }
}
