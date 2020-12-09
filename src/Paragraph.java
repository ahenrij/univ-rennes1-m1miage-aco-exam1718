import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Paragraph implements SectionElement {

    private Collection<Line> lines = new ArrayList<>();

    public Paragraph() {

    }

    public void addLine(Line l) {
        lines.add(l);
    }

    public Collection<Line> getLines() {
        return Collections.unmodifiableCollection(lines);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
