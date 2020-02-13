import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 1000: ");
        int number = scanner.nextInt();
        if (number<10 && number > 0){
            System.out.println(hangDonVi(number));
        }
        else if (number>=10 && number < 20){
            System.out.println(hangChuc1(number));
        }
        else if (number>=20 && number < 100){
            System.out.println(hangChuc2(number));
        }
        else if (number >= 100 && number < 110){
            System.out.println(hangTram1(number));
        }
        else if (number>=110 && number < 120){
            System.out.println(hangTram2(number));
        }
        else if (number>=120 && number<1000)
            System.out.println(hangTram3(number));
    }
    public static String hangDonVi(int number) {
        switch (number) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        }

        return "";
    }

    public static String hangChuc1(int number){
        if (number==10)
            return "ten";
        switch (number%10){
            case 1:
                return "Eleven";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fifteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Nineteen";
        }
        return "";
    }

    public static String hangChuc2(int number){
            int donVi = number % 10;
            int chuc = (int) Math.floor(number/10);

        switch (number){
            case 20:
                return "Twenty ";
            case 30:
                return "Thirty ";
            case 40:
                return "Fourty ";
            case 50:
                return "Fifty ";
            case 60:
                return "Sixty ";
            case 70:
                return "Seventy ";
            case 80:
                return "Eighty ";
            case 90:
                return "Ninety ";

        }

            switch (chuc){
                case 2:
                    return "Twenty " + hangDonVi(donVi);
                case 3:
                    return "Thirty " + hangDonVi(donVi);
                case 4:
                    return "Fourty " + hangDonVi(donVi);
                case 5:
                    return "Fifty " + hangDonVi(donVi);
                case 6:
                    return "Sixty " + hangDonVi(donVi);
                case 7:
                    return "Seventy " + hangDonVi(donVi);
                case 8:
                    return "Eighty " + hangDonVi(donVi);
                case 9:
                    return "Ninety " + hangDonVi(donVi);
            }

        return "";
    }

    public static String hangTram1(int number) {
        int chuc = number%100;
        int tram = (int) Math.floor(number/100);
        if (number==100) {
            return "One hundred ";
        }
            switch (tram) {
                case 1:
                    return "One hundred and " + hangDonVi(chuc);
                case 2:
                    return "Two hundred and " + hangDonVi(chuc);
                case 3:
                    return "Three hundred and " + hangDonVi(chuc);
                case 4:
                    return "Four hundred and " + hangDonVi(chuc);
                case 5:
                    return "Five hundred and " + hangDonVi(chuc);
                case 6:
                    return "Six hundred and " + hangDonVi(chuc);
                case 7:
                    return "Seven hundred and " + hangDonVi(chuc);
                case 8:
                    return "Eight hundred and " + hangDonVi(chuc);
                case 9:
                    return "Nine hundred and " + hangDonVi(chuc);
            }
        return "";
    }

    public static String hangTram2(int number){
        int chuc = number%100;
        int tram = (int) Math.floor(number/100);
            switch (tram) {
                case 1:
                    return "One hundred and " + hangChuc1(chuc);
                case 2:
                    return "Two hundred and " + hangChuc1(chuc);
                case 3:
                    return "Three hundred and " + hangChuc1(chuc);
                case 4:
                    return "Four hundred and " + hangChuc1(chuc);
                case 5:
                    return "Five hundred and " + hangChuc1(chuc);
                case 6:
                    return "Six hundred and " + hangChuc1(chuc);
                case 7:
                    return "Seven hundred and " + hangChuc1(chuc);
                case 8:
                    return "Eight hundred and " + hangChuc1(chuc);
                case 9:
                    return "Nine hundred and " + hangChuc1(chuc);
            }
        return "";
    }

    public static String hangTram3(int number){
        int chuc = number%100;
        int tram = (int) Math.floor(number/100);

        switch (number){
            case 200:
                return "Two hundred ";
            case 300:
                return "Three hundred ";
            case 400:
                return "Four hundred ";
            case 500:
                return "Five hundred ";
            case 600:
                return "Six hundred ";
            case 700:
                return "Seven hundred ";
            case 800:
                return "Eight hundred ";
            case 900:
                return "Nine hundred ";
        }

        switch (tram) {
            case 1:
                return "One hundred and " + hangChuc2(chuc);
            case 2:
                return "Two hundred and " + hangChuc2(chuc);
            case 3:
                return "Three hundred and " + hangChuc2(chuc);
            case 4:
                return "Four hundred and " + hangChuc2(chuc);
            case 5:
                return "Five hundred and " + hangChuc2(chuc);
            case 6:
                return "Six hundred and " + hangChuc2(chuc);
            case 7:
                return "Seven hundred and " + hangChuc2(chuc);
            case 8:
                return "Eight hundred and " + hangChuc2(chuc);
            case 9:
                return "Nine hundred and " + hangChuc2(chuc);
        }
        return "";
    }
}






