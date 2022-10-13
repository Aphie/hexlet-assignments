package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    public String tagName;
    public Map<String, String> attribute;

    public Tag(String tagName, Map<String, String> attribute) {
        this.tagName = tagName;
        this.attribute = attribute;
    }

    public String tagString() {
        List<String> attributeList = new ArrayList<>();
        for (String key: this.attribute.keySet()) {
            attributeList.add(key + "=\"" + this.attribute.get(key) + "\"");
        }

        List<String> tagContentList = new ArrayList<>();
        tagContentList.add(this.tagName);
        for (int i = 0; i < attributeList.size(); i++) {
            tagContentList.add(attributeList.get(i));
        }

        return "<" + String.join(" ", tagContentList) + ">";
    }
}
// END
