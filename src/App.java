

public class App {

    public static void main(String[] args) throws Exception {
       
        Visitor visitor = new XMLGenerator(System.out);

        Document d1 = new Document();
        Title chapterTitle = new Title();
        chapterTitle.addLine(new Line("Exemple 1"));
        Chapter c = new Chapter(chapterTitle);


        Title title1 = new Title();
        title1.addLine(new Line("s1"));
        Section s1 = new Section(title1);

        Title title2 = new Title();
        title2.addLine(new Line("s2"));
        Section s2 = new Section(title2);

        Paragraph p1 = new Paragraph();
        p1.addLine(new Line("Ligne 1"));
        s1.addElement(p1);

        Paragraph p2 = new Paragraph();
        p2.addLine(new Line("Ligne 2"));
        s2.addElement(p2);

        c.addSection(s1);
        c.addSection(s2);

        d1.addChapter(c);

        d1.accept(visitor);
    }
}
