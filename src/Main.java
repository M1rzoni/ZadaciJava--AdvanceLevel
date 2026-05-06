public class Main {
    static void main() {

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.withdrawFunds(100.0);
//        bankAccount.depositFunds(250);
//        bankAccount.withdrawFunds(50);

//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//
//        simpleCalculator.setFirstNumber(5.0);
//        simpleCalculator.setSecondNumber(4);
//
//        System.out.println("add= " + simpleCalculator.getAdditionResult());
//        System.out.println("substract= " + simpleCalculator.getSubstractionResult());
//        simpleCalculator.setFirstNumber(5.25);
//        simpleCalculator.setSecondNumber(0);
//        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
//        System.out.println("divide= " + simpleCalculator.getDivisionResult());


//        Person person = new Person();
//        person.setFirstName("");
//        person.setSecondName("");
//        person.setAge(10);
//
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen=" + person.isTeen());
//
//        person.setFirstName("John");
//        person.setAge(18);
//
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen=" + person.isTeen());
//
//        person.setSecondName("Smith");
//        System.out.println("fullName= " + person.getFullName());


        Customer customer = new Customer("Mirza", 1000, "mirza@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());




    }


}
