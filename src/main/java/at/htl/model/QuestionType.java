package at.htl.model;

import java.util.HashMap;
import java.util.Map;

public class QuestionType {
    Long id;
    String name;

    Map<Long, String> map = new HashMap<>();

    public QuestionType(Long id, String name) {
        this.id = id;
        this.name = name;
        setMap(id, name);
    }

    public void setMap(Long id, String name) {
        map.put(id, name);
    }

    public Map<Long, String> getMap() {
        return map;
    }
}
