package web.models;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public class Visitor {
    private Long visitor_id;
    private String visitor_name;
    private String visitor_second_name;

    public Visitor(Long visitor_id, String visitor_name, String visitor_second_name) {
        this.visitor_id = visitor_id;
        this.visitor_name = visitor_name;
        this.visitor_second_name = visitor_second_name;
    }

    public Long getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(Long visitor_id) {
        this.visitor_id = visitor_id;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getVisitor_second_name() {
        return visitor_second_name;
    }

    public void setVisitor_second_name(String visitor_second_name) {
        this.visitor_second_name = visitor_second_name;
    }
}
