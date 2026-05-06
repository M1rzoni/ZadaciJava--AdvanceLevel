public class Main {
    static void main() {

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.withdrawFunds(100.0);
//        bankAccount.depositFunds(250);
//        bankAccount.withdrawFunds(50);

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("add= " + simpleCalculator.getAdditionResult());
        System.out.println("substract= " + simpleCalculator.getSubstractionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + simpleCalculator.getDivisionResult());

    }


}
