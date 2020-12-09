import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Document implements Visitable {

    private Collection<Chapter> chapters = new ArrayList<>();

    public Document() {

    }

    public void addChapter(Chapter chapter) {
        Objects.requireNonNull(chapter);
        chapters.add(chapter);
    }

    public Collection<Chapter> getChapters() {
        return Collections.unmodifiableCollection(chapters);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDocument(this);
    }
}
