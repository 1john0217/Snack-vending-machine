import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Gamzachip = random.nextInt(51);
        int Candy = random.nextInt(51);
        int bottleOfWater = random.nextInt(51);
        int coffee = random.nextInt(51);
        int chocolate = random.nextInt(51);


        while(true){
            System.out.println("현 남은수량 ==========================================================================");
            System.out.printf("(1) 감자칩(1,500원): %s, (2)캔디(200원): %s, (3)물(1,000원): %s, (4)에너지드링크(2,500원): %s, (5)초콜렛(1,200원): %s", Gamzachip, Candy, bottleOfWater, coffee, chocolate);

            System.out.println("구매하실 번호를 입력하세요");

            int num = scanner.nextInt();

            switch (num){
                case 1 :
                    if(Gamzachip == 0)
                        System.out.println("감자칩은 품절입니다.");

                    if(Gamzachip != 0)
                        System.out.println("구매완료 되었습니다");
                    break;

            }


        }




    }
}