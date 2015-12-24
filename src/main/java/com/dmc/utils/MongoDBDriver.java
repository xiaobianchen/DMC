package com.dmc.utils;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.mongodb.*;
import com.mongodb.util.JSON;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

/**
 * Created by xiaobianchen on 2015/12/23.
 */
public class MongoDBDriver {

    private static final String EMPTY_DOCUMENT = "{}";
    private MongoClient mongoClient;
    private DB db;

    /**
     * Use Factory method to create MongoDBDriver instance
     */
    private MongoDBDriver() {
    }

    /**
     * Factory method to create a new instance of MongoDBDriver
     *
     * @return A new instance of MongoDBDriver
     */
    public static MongoDBDriver newInstance() {
        return new MongoDBDriver();
    }

    /**
     * Connect to localhost using default port
     *
     * @return Current MongoDBDriver instance
     * @throws UnknownHostException
     */
    public MongoDBDriver connect() throws UnknownHostException {
        this.mongoClient = new MongoClient();
        return this;
    }

    /**
     * Connect to a list of mongo instances
     *
     * @param seeds addresses of replica members
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(List<ServerAddress> seeds) {
        this.mongoClient = new MongoClient(seeds);
        return this;
    }

    /**
     * Connect to a list of mongo instances with provided credentials
     *
     * @param seeds       addresses of replica members
     * @param credentials credentials for authentication
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(List<ServerAddress> seeds, List<MongoCredential> credentials) {
        this.mongoClient = new MongoClient(seeds, credentials);
        return this;
    }

    /**
     * Connect to a list of mongo instances with provided credentials and specific client options
     *
     * @param seeds       addresses of replica members
     * @param credentials credentials for authentication
     * @param options     client side options
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(List<ServerAddress> seeds, List<MongoCredential> credentials, MongoClientOptions options) {
        this.mongoClient = new MongoClient(seeds, credentials, options);
        return this;
    }

    /**
     * Connect to a list of mongo instances with specific client options
     *
     * @param seeds   addresses of replica members
     * @param options client side options
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(List<ServerAddress> seeds, MongoClientOptions options) {
        this.mongoClient = new MongoClient(seeds, options);
        return this;
    }

    /**
     * Connect to a mongo instance which is described as a URI
     *
     * @param uri mango instance URI
     * @return Current MongoDBDriver instance
     * @throws UnknownHostException
     */
    public MongoDBDriver connect(MongoClientURI uri) throws UnknownHostException {
        this.mongoClient = new MongoClient(uri);
        return this;
    }

    /**
     * Connect to a mongo instance
     *
     * @param address mongo instance server address
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(ServerAddress address) {
        this.mongoClient = new MongoClient(address);
        return this;
    }

    /**
     * Connect to a mongo instance with provided credentials
     *
     * @param address     mongo instance server address
     * @param credentials credentials for authentication
     * @return current MongoDBDriver instance
     */
    public MongoDBDriver connect(ServerAddress address, List<MongoCredential> credentials) {
        this.mongoClient = new MongoClient(address, credentials);
        return this;
    }

    /**
     * Connect to a mongo instance with provided credentials and specific client options
     *
     * @param address     mongo instance server address
     * @param credentials credentials for authentication
     * @param options     client side options
     * @return Current MongoDBDriver instance
     */
    public MongoDBDriver connect(ServerAddress address, List<MongoCredential> credentials, MongoClientOptions options) {
        this.mongoClient = new MongoClient(address, credentials, options);
        return this;
    }

    /**
     * Connect to a mongo instance with specific client options
     *
     * @param address mongo instance server address
     * @param options client side options
     * @return current MongoDBDriver instance
     */
    public MongoDBDriver connect(ServerAddress address, MongoClientOptions options) {
        this.mongoClient = new MongoClient(address, options);
        return this;
    }

    /**
     * Connect to a mongo instance
     *
     * @param host host of mongo instance
     * @return current MongoDBDriver instance
     * @throws UnknownHostException
     */
    public MongoDBDriver connect(String host) throws UnknownHostException {
        this.mongoClient = new MongoClient(host);
        return this;
    }

    /**
     * Connect to a mongo instance with specific client options
     *
     * @param host    host of mongo instance
     * @param options client side options
     * @return Current MongoDBDriver instance
     * @throws UnknownHostException
     */
    public MongoDBDriver connect(String host, MongoClientOptions options) throws UnknownHostException {
        this.mongoClient = new MongoClient(host, options);
        return this;
    }

    /**
     * Use the specific database
     *
     * @param db database name
     */
    public MongoDBDriver use(String db) {
        Preconditions.checkNotNull(this.mongoClient);
        this.db = mongoClient.getDB(db);
        return this;
    }

    /**
     * Get all connections in database
     *
     * @return all connections in database
     */
    public Set<String> getCollections() {
        return this.db.getCollectionNames();
    }

    /**
     * Get a collection with a given name
     *
     * @param name name of the collection
     * @return db collection
     */
    public DBCollection getCollection(String name) {
        return this.db.getCollection(name);
    }

    /**
     * Find one document from the given collection
     *
     * @param collection collection name
     * @return a json document string
     */
    public String findOne(String collection) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.findOne().toString();
    }

    /**
     * Find one document by criteria
     *
     * @param collection collection to query
     * @param criteria   query criteria
     * @return a json document string matches criteria
     */
    public String findOne(String collection, String criteria) {
        DBCollection dbCollection = getCollection(collection);
        DBObject query = (DBObject) JSON.parse(criteria);
        DBObject dbObject = dbCollection.findOne(query);
        return dbObject.toString();
    }

    /**
     * Find one document by criteria
     *
     * @param collection collection to query
     * @param criteria   query criteria
     * @return a DBObject matches criteria
     */
    public DBObject findOne(String collection, DBObject criteria) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.findOne(criteria);
    }

    /**
     * Find all documents by criteria
     *
     * @param collection collection to query
     * @param criteria   query criteria
     * @return a list of json document matches query criteria
     */
    public List<String> find(String collection, String criteria) {
        List<String> result = Lists.newArrayList();
        DBCollection dbCollection = getCollection(collection);
        DBObject dbObject = (DBObject) JSON.parse(criteria);
        DBCursor cursor = dbCollection.find(dbObject);
        try {
            while (cursor.hasNext()) {
                DBObject object = cursor.next();
                result.add(object.toString());
            }
        } finally {
            cursor.close();
        }
        return result;
    }

    /**
     * Find all document by criteria
     *
     * @param collection collection to query
     * @param criteria   query criteria
     * @return a list of DBObject matches criteria
     */
    public List<DBObject> find(String collection, DBObject criteria) {
        List<DBObject> result = Lists.newArrayList();
        DBCollection dbCollection = getCollection(collection);
        DBCursor cursor = dbCollection.find(criteria);
        try {
            while (cursor.hasNext()) {
                DBObject object = cursor.next();
                result.add(object);
            }
        } finally {
            cursor.close();
        }
        return result;
    }

    /**
     * Drop the entire collection from db, including index
     *
     * @param collection collection to be dropped
     */
    public void drop(String collection) {
        DBCollection dbCollection = getCollection(collection);
        dbCollection.drop();
    }

    /**
     * Remove all documents from collection, but keep the index
     *
     * @param collection collection from which documents to be removed
     * @return db write result
     */
    public String removeAll(String collection) {
        DBCollection dbCollection = getCollection(collection);
        WriteResult result = dbCollection.remove((DBObject) JSON.parse(EMPTY_DOCUMENT));
        return result.toString();
    }

    /**
     * Remove documents from collection match specific criteria
     *
     * @param collection collection to remove documents from
     * @param criteria   json document represents query criteria
     * @return Result string return by db
     */
    public String remove(String collection, String criteria) {
        DBCollection dbCollection = getCollection(collection);
        DBObject dbObject = (DBObject) JSON.parse(criteria);
        WriteResult result = dbCollection.remove(dbObject);
        return result.toString();
    }

    /**
     * Remove documents from collection match specific criteria
     *
     * @param collection collection from which documents to be removed
     * @param criteria   DBObject represents query criteria
     * @return WriterResult
     */
    public WriteResult remove(String collection, DBObject criteria) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.remove(criteria);
    }

    /**
     * Insert a document into collection
     *
     * @param collection   collection to insert into
     * @param jsonDocument document to insert
     * @return mongodb write result
     */
    public String insert(String collection, String jsonDocument) {
        DBCollection dbCollection = getCollection(collection);
        DBObject dbObject = (DBObject) JSON.parse(jsonDocument);
        WriteResult result = dbCollection.insert(dbObject);
        return result.toString();
    }

    /**
     * Insert a dbObject into collection
     *
     * @param collection collection to insert into
     * @param dbObject   dbObject to insert
     * @return write result
     */
    public WriteResult insert(String collection, DBObject dbObject) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.insert(dbObject);
    }

    /**
     * Insert a few dbObjects into collection
     *
     * @param collection collection to insert into
     * @param dbObjects  dbObjects to insert
     * @return write result
     */
    public WriteResult insert(String collection, List<DBObject> dbObjects) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.insert(dbObjects);
    }

    /**
     * Insert a few dbObjects into collection
     *
     * @param collection   collection to insert into
     * @param dbObject     dbObject to insert
     * @param writeConcern write concern
     * @return write result
     */
    public WriteResult insert(String collection, DBObject dbObject, WriteConcern writeConcern) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.insert(dbObject, writeConcern);
    }

    /**
     * Insert a few dbObjects into collection
     *
     * @param collection   collection to insert into
     * @param dbObject     dbObjects to insert
     * @param writeConcern write concern
     * @return write result
     */
    public WriteResult insert(String collection, List<DBObject> dbObject, WriteConcern writeConcern) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.insert(dbObject, writeConcern);
    }

    /**
     * Update the document matches criteria to a new document
     *
     * @param collection collection to update
     * @param criteria   criteria to match the documents to be updated
     * @param newValue   new document value
     * @return write result
     */
    public WriteResult update(String collection, DBObject criteria, DBObject newValue) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.update(criteria, newValue);
    }

    /**
     * Update multiple documents matches specific criteria to a new document
     *
     * @param collection collection to update
     * @param criteria   criteria to match the documents to be updated
     * @param newValue   new document value
     * @return write result
     */
    public WriteResult updateMulti(String collection, DBObject criteria, DBObject newValue) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.updateMulti(criteria, newValue);
    }

    /**
     * Update the document matches criteria to a new document
     *
     * @param collection  collection to update
     * @param criteria    criteria to match the document to be updated
     * @param newDocument new document value
     * @return write result
     */
    public String update(String collection, String criteria, String newDocument) {
        DBCollection dbCollection = getCollection(collection);
        DBObject criteriaObject = (DBObject) JSON.parse(criteria);
        DBObject newObject = (DBObject) JSON.parse(newDocument);
        WriteResult result = dbCollection.update(criteriaObject, newObject);
        return result.toString();
    }

    /**
     * Update multiple documents matches specific criteria to a new document
     *
     * @param collection  collection to update
     * @param criteria    criteria to match the document to be updated
     * @param newDocument new document value
     * @return write result
     */
    public String updateMulti(String collection, String criteria, String newDocument) {
        DBCollection dbCollection = getCollection(collection);
        DBObject criteriaObject = (DBObject) JSON.parse(criteria);
        DBObject newObject = (DBObject) JSON.parse(newDocument);
        WriteResult result = dbCollection.updateMulti(criteriaObject, newObject);
        return result.toString();
    }

    /**
     * Get count of the document
     *
     * @param collection collection to query
     * @return count of the document
     */
    public long count(String collection) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.count();
    }

    /**
     * Get count of the document matches specific criteria
     *
     * @param collection collection to query
     * @param query query criteria
     * @return count of the document
     */
    public long count(String collection, DBObject query) {
        DBCollection dbCollection = getCollection(collection);
        return dbCollection.count(query);
    }
    private static final String MONGO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
}
