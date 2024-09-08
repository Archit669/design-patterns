public class User {
    private final String name;
    private final String id;

    // Private constructor to enforce object creation through the builder
    private User(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
    }

    // Static method to create a new builder instance
    public static Builder builder() {
        return new Builder();
    }

    // Static inner Builder class
    public static class Builder {
        private String name;
        private String id;

        // Constructor
        public Builder() {}

        // Setter method for the name field
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        // Setter method for the id field
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        // Method to build the User instance
        public User build() {
            return new User(this);
        }
    }

    // Getters for the fields
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
