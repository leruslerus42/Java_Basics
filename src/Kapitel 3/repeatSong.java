import java.util.Scanner;




public class repeatSong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean songOnRepeat = true;

        while (songOnRepeat)
        {
            System.out.println("Playing current song");
            System.out.println("Would you like tot ake this song off of repeat? If so, answer yes.");
            String userInput = input.next();

            if (userInput.equals("yes")){
                songOnRepeat = false;
            }
        }
        System.out.println("Playing next Song");





    }
}


//  My first solution
//public class repeatSong {
//    public static void main(String[] args){
//        System.out.println("Is current song on repeat?");
//        Scanner input = new Scanner(System.in);
//        boolean songOnRepeat = input.nextBoolean();
//
//        while (songOnRepeat == true)
//        {
//            System.out.println("Playing same some again");
//            System.out.println("Do you want to stay in repeat modus?");
//            songOnRepeat = input.nextBoolean();
//        }
//        System.out.println("Playing next Song");
//
//
//
//
//
//    }
//}
