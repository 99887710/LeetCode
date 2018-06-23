package BuilderPattern;


public class CustomerDemo {

    public static void main(String[] args) {

    Customer customer = new Customer.Builder()
                .setFirstName("jeff")
                .setLastName("wu")
                .setGender("M")
                .setNationality("Taiwan")
                .setPhone("123456")
                .build();

        System.out.println(customer.toString());
    }
}
