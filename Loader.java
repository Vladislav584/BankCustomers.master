import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        Client individual = new Individual();
        Client entity = new Entity();
        Client entrepreneur = new Entrepreneur();

        String command = "Введите номер команды:\n1-Внести на счет\n2-Снять со счета\n3-Запрос баланса\n4-Выход\n";
        String put = "Введите сумму, которую хотите внести.";
        String withdraw = "Введите сумму, которую хотите снять.";
        String outputBalance = "Баланс Вашего счета : ";
        String regex = "\\d+";
        String format = "Необходимо ввести сумму!";

        for (; ; ) {
            System.out.println("Выберите тип клиента:\n1-Физическое лицо\n2-Юридическое лицо\n3-Индивидуальный " +
                    "предприниматель\n");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("1")) {

                for (; ; ) {

                    System.out.println(command);

                    String input2 = scanner.nextLine();

                    if (input2.equals("1")) {
                        System.out.println(put);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            individual.putMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }

                    if (input2.equals("2")) {
                        System.out.println(withdraw);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            individual.withdrawMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }

                    if (input2.equals("3")) {
                        System.out.println(outputBalance + individual.getBalance());
                        System.out.println();
                    }
                    if (input2.equals("4")) {
                        break;
                    }
                }
            }

            if (input.equals("2")) {

                for (; ; ) {

                    System.out.println(command);

                    String input2 = scanner.nextLine();

                    if (input2.equals("1")) {
                        System.out.println(put);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            entity.putMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }
                    if (input2.equals("2")) {
                        System.out.println(withdraw);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            entity.withdrawMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }
                    if (input2.equals("3")) {
                        System.out.println(outputBalance + entity.getBalance());
                        System.out.println();
                    }
                    if (input2.equals("4")) {
                        break;
                    }
                }
            }

            if (input.equals("3")) {

                for (; ; ) {

                    System.out.println(command);

                    String input2 = scanner.nextLine();

                    if (input2.equals("1")) {
                        System.out.println(put);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            entrepreneur.putMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }
                    if (input2.equals("2")) {
                        System.out.println(withdraw);
                        String moneyAmount = scanner.nextLine();
                        if (String.valueOf(moneyAmount).matches(regex)) {
                            entrepreneur.withdrawMoney(Long.parseLong(moneyAmount));
                        } else System.out.println(format);
                        System.out.println();
                    }
                    if (input2.equals("3")) {
                        System.out.println(outputBalance + entrepreneur.getBalance());
                        System.out.println();
                    }
                    if (input2.equals("4")) {
                        break;
                    }
                }
            }
        }
    }
}
