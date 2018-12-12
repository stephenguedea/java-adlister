import java.util.List;

public interface Tools {
    //DAO'S BLUEPRINT
    List<Tool> all(); // get all the tool records
    void insert(Tool tool); // persist new product to the database
}
