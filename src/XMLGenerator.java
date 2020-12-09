import java.io.PrintStream;

public class XMLGenerator implements Visitor {

    private PrintStream out;
    private int depth = 0;

    public XMLGenerator(PrintStream out) {
        this.out = out;
    }
    
    @Override
    public void visitDocument(Document d) {
        out.println("<document>");
        for (Chapter c: d.getChapters()) {
            c.accept(this);
        }
        out.println("</document>");
    }

    @Override
    public void visitSection(Section s) {
        depth++;
        out.println("<H" + depth + ">");
        s.getTitle().accept(this);
        for (SectionElement e: s.getElements()) {
            e.accept(this);
        }
        out.println("</H" + depth + ">");
        depth--;
    }

    @Override
    public void visitLine(Line l) {
        out.print(l.getContent());
    }

    @Override
    public void visitChapter(Chapter c) {
        out.println("<chapter>");
        c.getTitle().accept(this);
        for (Section s: c.getSections()) {
            s.accept(this);
        }
        out.println("</chapter>");
     }

    @Override
    public void visitParagraph(Paragraph p) {
        out.print("<p>");
        for (Line l: p.getLines()) {
            l.accept(this);
        }
        out.println("</p>");
    }

    @Override
    public void visitTitle(Title t) {
        out.print("<title>");
        for (Line l: t.getLines()) {
            l.accept(this);
        }
        out.println("</title>");
    }
}
