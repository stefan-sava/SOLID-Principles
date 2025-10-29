package DfromSOLID;

public class UserService {

    private MySqlDatabase database;

    public UserService(){
        this.database = new MySqlDatabase();
    }

    public void processUser(){
        database.connect();
        System.out.println("Processing user...");
    }
}
