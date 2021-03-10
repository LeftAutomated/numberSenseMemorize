package UIL;
import java.util.*;

public class memorize {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Start [0] ... Exit [1] : ");
        int proceed = sc.nextInt();
        while(proceed == 0){
            System.out.print("\nHelp [0] ... Practice [1] : ");
            int inHelp = sc.nextInt();
            boolean isHelp = (inHelp == 0) ? true : false;
            System.out.print("\n1 | 2 | 3 | 4 | 5 : ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    sqr(isHelp);
                    break;
                case 2:
                    cube(isHelp);
                    break;
                case 3:
                    sqrRoot(isHelp);
                    break;
                case 4:
                    frac(isHelp);
                    break;
                case 5:
                    rom(isHelp);
                    break;
                default:
                    break;
            }
            System.out.print("\nContinue [0] ... Exit [1] : ");
            proceed = sc.nextInt();
        }
    }

    // [1] First 35 squares
    public static void sqr(boolean help){
        if(help){
            System.out.println("_ _ _ _ _ _ _\n");
            for(int i = 1; i <= 35; i++){
                if(i < 10)
                    System.out.println(" " + i + " ^ 2 = " + (i*i));
                else
                    System.out.println(i + " ^ 2 = " + (i*i));
            }
            System.out.println("_ _ _ _ _ _ _");
        }
        else{

        }
    }

    // [2] First 15 cubes
    public static void cube(boolean help){
        if(help){
            System.out.println("_ _ _ _ _ _ _\n");
            for(int i = 1; i <= 15; i++){
                if(i < 10)
                    System.out.println(" " + i + " ^ 3 = " + (i*i*i));
                else
                    System.out.println(i + " ^ 3 = " + (i*i*i));
            }
            System.out.println("_ _ _ _ _ _ _");
        }
        else{
            
        }
    }

    // [3] First 10 square roots to 3 decimals
    public static void sqrRoot(boolean help){
        if(help){
            System.out.println("_ _ _ _ _ _ _\n");
            for(int i = 1; i <= 10; i++){
                if(i < 10)
                    System.out.printf("sqrt of  %d = %.3f \n", i, Math.sqrt(i));
                else
                System.out.printf("sqrt of %d = %.3f \n", i, Math.sqrt(i));
            }
            System.out.println("_ _ _ _ _ _ _");
        }
        else{
            
        }
    }

    // [4] 1/2 to 1/12 and 1/16
    public static void frac(boolean help){
        if(help){
            System.out.println("_ _ _ _ _ _ _");
            for(int i = 2; i <= 12; i++){
                if(i < 10)
                    System.out.printf(" 1/%d = %.2d%% = %.4d", i, (100/(1.0*i)), (1/(1.0*i)));
                else
                    System.out.printf("1/%d = %.2d%% = %.4d", i, (100/(1.0*i)), (1/(1.0*i)));
            }
            System.out.println("1/16 = 6.25% = .0625");
            System.out.println("_ _ _ _ _ _ _");
        }
        else{
            
        }
    }

    // [5] Roman Numerals
    public static void rom(boolean help){
        if(help){

        }
        else{
            
        }
    }

}
