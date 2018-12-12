import java.util.ArrayList;
import java.util.List;

public class ListTools implements Tools {
    private List<Tool> tools = new ArrayList();

    // When an instance of this class is created, we'll populate the
    // tools array list with data, "Faking" the records

    public ListTools() {
        insert(new Tool("hammer", 9.99));
        insert(new Tool("screwdriver", 7.99));
        insert(new Tool("drill", 19.99));
    }

    // Persist a new record. We'll simulate this by adding the passed object
    // to our internal array list of products
    public void insert(Tool tool){
        this.tools.add(tool);
    }

    public List<Tool> all() {
        return this.tools;
    }
}
