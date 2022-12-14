package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Project {

    public static void main(String[] args) throws FileNotFoundException {

        int sum = 0;
        int x, y;
        try {
            x = 6;
            y = 0;
            sum = x / y;
        } catch (Exception e) {
            System.out.println("can not dividing in 0");
        }

        int count = 11;
        Integer I = count;
        String s = I.toString();
        System.out.println("the number of models is :" + s.length());

        int r = 5;
        good g = new good();
        System.out.println("the rate of shop:");
        g.rate();

        System.out.println("if you want models for Apple press 1 \n Samsung press 2 \n but if you want to make your custome phone press 3 ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1) {
            r = 0;
        } else if (n == 2) {
            r = 1;
        } else if (n == 3) {
            r = 2;
        } else {
            System.out.println("this choise is not avalible");

        }

        switch (r) {
            case 0:
                File appleFile = new File("C:\\\\Users\\M.user\\Desktop\\models for apple .txt");
                Apple.scan(appleFile);
//
                for (Apple a : Apple.appleList) {
                    System.out.println(a.model + "\n" + a.ram + "\n" + a.storage
                            + "\n" + a.batterySize + "\n" + a.cpuSpeed + "\n" + a.screenSize
                            + "\n" + a.glassType + "\n" + a.year + "\n" + a.color + "\n" + a.price);

                }
                File s1File = new File("C:\\\\Users\\M.user\\Desktop\\output.txt");
                Apple.write(s1File);
                break;
            case 1:
                File samsungFile = new File("C:\\\\Users\\M.user\\Desktop\\models for samsung.txt");
                Samsung.scan(samsungFile);

                for (Samsung a : Samsung.samsungList) {
                    System.out.println(a.model + "\n" + a.ram + "\n" + a.storage
                            + "\n" + a.batterySize + "\n" + a.cpuSpeed + "\n" + a.screenSize
                            + "\n" + a.glassType + "\n" + a.year + "\n" + a.color + "\n" + a.price);

                }
                File s2File = new File("C:\\\\Users\\M.user\\Desktop\\output.txt");
                Samsung.write(s2File);
                break;

            case 2:
                System.out.println("If you want IOS os write 1 \nbut If you want android write 2   ");
                Scanner os = new Scanner(System.in);
                int a = os.nextInt();

                if (a == 1) {
                    Apple cc1 = new Apple(0, 0, 0, 0, null, null, null, 0, null, 0);
                    System.out.println("WriteIOS phone features\n note <<Cost for 1 ram is 1000$>>");
                    System.out.println("Ram      avilable rams from 4 to 32");
                    Scanner ram = new Scanner(System.in);
                    int c1 = ram.nextInt();
                    if (c1 < 4) {
                        System.out.println("this ram is not avilable");
                    } else if (c1 > 32) {
                        System.out.println("this ram is not avilable");
                    } else {
                        System.out.println("Storage ");
                        Scanner sorage = new Scanner(System.in);
                        int c2 = sorage.nextInt();
                        System.out.println("Battary size");
                        Scanner battare = new Scanner(System.in);
                        int c3 = battare.nextInt();
                        System.out.println("Cpu speed");
                        Scanner cpu = new Scanner(System.in);
                        double c4 = cpu.nextDouble();
                        System.out.println("Screen size      example<1295*125>");
                        Scanner screen = new Scanner(System.in);
                        String c5 = screen.nextLine();
                        System.out.println("Glass type");
                        Scanner glass = new Scanner(System.in);
                        String c6 = glass.nextLine();
                        System.out.println("Name of your model");
                        Scanner model = new Scanner(System.in);
                        String c7 = model.nextLine();
                        System.out.println("Color");
                        Scanner color = new Scanner(System.in);
                        String c8 = color.nextLine();
                        costumeA cc2 = new costumeA(0, 0, 0, 0, null, null, null, 0, null, 0);
                        cc2.setcostumeA(c1, c2, c3, c4, c5, c6, c7, c8);
                        System.out.println(cc2.costumeAInfo());
                    }
                } else if (a == 2) {
                    Samsung cc1 = new Samsung(0, 0, 0, 0, null, null, null, 0, null, 0);
                    System.out.println("Write ANDROID phone features\n note <<Cost for 1 ram is 1000$>>");
                    System.out.println("Ram      avilable rams from 4 to 32");
                    Scanner ram = new Scanner(System.in);
                    int c1 = ram.nextInt();
                    if (c1 < 4) {
                        System.out.println("this ram is not avilable");
                    } else if (c1 > 32) {
                        System.out.println("this ram is not avilable");
                    } else {
                        System.out.println("Storage ");
                        Scanner sorage = new Scanner(System.in);
                        int c2 = sorage.nextInt();
                        System.out.println("Battary size");
                        Scanner battare = new Scanner(System.in);
                        int c3 = battare.nextInt();
                        System.out.println("Cpu speed");
                        Scanner cpu = new Scanner(System.in);
                        double c4 = cpu.nextDouble();
                        System.out.println("Screen size      example<1295*125>");
                        Scanner screen = new Scanner(System.in);
                        String c5 = screen.nextLine();
                        System.out.println("Glass type");
                        Scanner glass = new Scanner(System.in);
                        String c6 = glass.nextLine();
                        System.out.println("Name of your model");
                        Scanner model = new Scanner(System.in);
                        String c7 = model.nextLine();
                        System.out.println("Color");
                        Scanner color = new Scanner(System.in);
                        String c8 = color.nextLine();
                        costumeS cc2 = new costumeS(0, 0, 0, 0, null, null, null, 0, null, 0);
                        cc2.setcostumeS(c1, c2, c3, c4, c5, c6, c7, c8);
                        System.out.println(cc2.costumeSInfo());

                    }
                } else {
                    System.out.println("Sorry you must choose");
                }

                break;

        }
    }
}
