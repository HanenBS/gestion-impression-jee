package iit.jee.gestionimpressionjee.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {
    private static final String DATABASE_URI = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "your_database_name";

    public static MongoDatabase connect() {
        MongoClient mongoClient = MongoClients.create(DATABASE_URI);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
