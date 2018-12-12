package day02;

public class WhileLoop {

    public static void main(String[] args) {
        
        int number;
        String day;

        Scanner scanner = new Scanner(System.in);


        while (number != 2){
            number = scanner.nextInt();

            switch (number){
                case 1: day = "Pondelok";       //if (number == 1){
                    break;                      //  day = "Pondelok";
                                                //} else if(number == 2){
                case 2: day = "Utorok";         //  day = "Utorok";
                    break;                      //}
                                                //
                case 3: day = "Streda";         // else if (number == 3) day = "Streda";
                    break;

                case 4: day = "Stvrtok";         // else if (number == 4) day = "Stvrtok";
                    break;

                case 5: day = "Piatok";         // else if (number == 5) day = "Piatok";
                    break;

                default: day = "Nespravny vstup"; // else day = "Nespravny vstup";
                    break;
            }
            System.out.println(day);
        }

    }
}
