
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        var listQuarter = new ArrayList<Quarter>();
        do {
            System.out.println("1: Them Ho Dan");
            System.out.println("2: Hien Thi Ho Dan");
            System.out.println("3: Hien Thi So nguoi 80 Tuoi ");
            System.out.println("0: Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    var add = ceart(input);
                    listQuarter.add(add);
                    System.out.println("Them Thanh Cong");
                    break;
                case 2:
                    show(listQuarter);
                    break;
                case 3:
                    if (listQuarter.size() > 0) {
                        cucalatorAge(listQuarter);
                    } else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
            }
        } while (true);
    }

    private static void cucalatorAge(ArrayList<Quarter> listQuarter) {
        for (Quarter index : listQuarter) {
            if (index.getPerson().getDateOfBirth() >= 80) {
                System.out.println("Mừng Thọ Ông " + index.getPerson().getFullNameString() +
                        " " + index.getPerson().getDateOfBirth());
            }
        }
    }

    private static void show(ArrayList<Quarter> listQuarter) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",
                "Họ Và Tên", "Ngày Sinh", "Nghề NGhiệp", "Số Nhà", "Số Người");
        for (Quarter index : listQuarter) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", index.getPerson().getFullNameString(),
                    index.getPerson().getDateOfBirth(), index.getPerson().getOccupation(),
                    index.getHouseNumber(), index.getPopulation());
        }
    }

    private static Quarter ceart(Scanner input) {
        System.out.println("Nhập Tên");
        var name = input.nextLine();
        System.out.println("Nhập Tuổi");
        var dateOfBirth = Integer.parseInt(input.nextLine());
        System.out.println("Nhập Nghề Ngiệp");
        var occupation = input.nextLine();
        System.out.println("Nhập Số Nhà");
        var hoseNumber = input.nextLine();
        System.out.println("Nhập Số Người");
        var population = input.nextInt();
        Person person = new Person(name, dateOfBirth, occupation);
        return new Quarter(hoseNumber, population, person);
    }
}
