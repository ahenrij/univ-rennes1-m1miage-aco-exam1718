import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Section implements SectionElement {

    private Title title;
    private Collection<SectionElement> elements = new ArrayList<>();

    public Section(Title title) {
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }

    public void addElement(SectionElement el) {
        elements.add(el);
    }

    public Collection<SectionElement> getElements() {
        return Collections.unmodifiableCollection(elements);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
