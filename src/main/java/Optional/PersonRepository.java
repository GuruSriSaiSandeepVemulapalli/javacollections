package Optional;

public class PersonRepository {

    public String searchNameById(String id) {
        return id == null ? null : "Name";
    }
}
