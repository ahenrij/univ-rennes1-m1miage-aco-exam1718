import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Chapter implements Visitable {

    private Collection<Section> sections = new ArrayList<>();
    private Title title;

    public Chapter(Title title) {
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }

    public void addSection(Section section) {
        Objects.requireNonNull(section);
        sections.add(section);
    }

    public Collection<Section> getSections() {
        return Collections.unmodifiableCollection(sections);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitChapter(this);
    }
}
