public interface Visitor {
    
    public void visitDocument(Document d);
    
    public void visitSection(Section s);
    
    public void visitLine(Line l);
    
    public void visitChapter(Chapter c);
    
    public void visitParagraph(Paragraph p);

    public void visitTitle(Title t);
}
