package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{

    public SingleTag(String tagName, Map<String, String> attribute) {
        super(tagName, attribute);
    }

    public String toString() {
        return this.tagString();
    }
}
// END
