package BuilderPattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String gender;
    private String nationality;
    private int age;
    private String phone;

    public Customer(String firstName, String lastName, String gender, String nationality, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String gender;
        private String nationality;
        private int age;
        private String phone;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Customer build() {
            return new Customer(firstName, lastName, gender, nationality, age, phone);
        }
    }
}
