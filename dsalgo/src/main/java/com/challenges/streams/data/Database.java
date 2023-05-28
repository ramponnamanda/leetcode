package com.challenges.streams.data;


public class Database {
    private Map<Integer, Product> products = new HashMap<>();
    private Map<String, Category> categories = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();
    private List<Person> persons = new ArrayList<>();

    private static Database INSTANCE = new Database();

    private Database() {
        initData();
    }

    private void initData() {
        categories.put("Books", new Category(1, "Books"));
        categories.put("Food", new Category(2, "Food"));
        categories.put("Electronics", new Category(3, "Electronics"));
        categories.put("Automobile", new Category(4, "Automobile"));
        categories.put("Fashion", new Category(5, "Fashion"));

        products.put(1, new Product(1, "The Algorithms"), new BigDecimal("9.99"), categories.get("Books"));
        products.put(2, new Product(2, "System Design"), new BigDecimal("12.99"), categories.get("Books"));
        products.put(3, new Product(3, "Building Microservices"), new BigDecimal("24.99"), categories.get("Books"));
        products.put(4, new Product(4, "Design Data Intensive Apps"), new BigDecimal("24.99"), categories.get("Books"));

        products.put(5, new Product(5, "Urad Dal one KG"), new BigDecimal("2.99"), categories.get("Food"));
        products.put(6, new Product(6, "Onions one KG"), new BigDecimal("1.99"), categories.get("Food"));
        products.put(7, new Product(7, "Milk one liter"), new BigDecimal("1.99"), categories.get("Food"));
        products.put(8, new Product(8, "Paneer one KG"), new BigDecimal("4.99"), categories.get("Food"));

        products.put(9, new Product(9, "Mobile"), new BigDecimal("199.99"), categories.get("Electronics"));
        products.put(10, new Product(10, "Mac Book"), new BigDecimal("999.99"), categories.get("Electronics"));

        products.put(11, new Product(11, "Electric Bike"), new BigDecimal("1999.99"), categories.get("Automobile"));
        products.put(12, new Product(12, "Electric Car"), new BigDecimal("19999.99"), categories.get("Automobile"));

        products.put(13, new Product(13, "Shirt"), new BigDecimal("19.99"), categories.get("Fashion"));
        products.put(14, new Product(14, "Jeans"), new BigDecimal("29.99"), categories.get("Fashion"));
        
    }

    public static Database getSingleton() {
        return INSTANCE;
    }

    public List<Person> getPersons() {
        return this.persons;
    }

}