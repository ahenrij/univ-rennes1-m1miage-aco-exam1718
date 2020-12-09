import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Title implements Visitable {

    private Collection<Line> lines = new ArrayList<>();

    public Title() {

    }

    public void addLine(Line l) {
        Objects.requireNonNull(l);
        lines.add(l);
    }

    public Collection<Line> getLines() {
        return Collections.unmodifiableCollection(lines);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTitle(this);
    }
}
