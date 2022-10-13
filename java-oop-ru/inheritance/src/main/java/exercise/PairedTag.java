package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    String tagBody;
    List<Tag> children;

    public PairedTag(String tagName, Map<String, String> attribute, String tagBody, List<Tag> children) {
        super(tagName, attribute);
        this.tagBody = tagBody;
        this.children = children;
    }

    public String toString() {
        String innerTags = "";
        for (int i = 0; i < this.children.size(); i++) {
            innerTags+= this.children.get(i).tagString();
        }
        return this.tagString() + this.tagBody + innerTags + "</" + this.tagName + ">";
    }


}
// END
