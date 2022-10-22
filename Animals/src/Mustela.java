import java.util.Scanner;

public class Mustela{

    Scanner sc = new Scanner(System.in);

    public String kind;
    public String color;

    public Mustela(String color){
        color = color;
    }

    public Mustela() {
        kind = "weasel";
        color = "brown";
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    int choose;
    void  sayGoodbye(){
        System.out.println("<=====================================================================================================>");
        System.out.println("to know current fur color - enter 5:");
        System.out.println("To choose the color you want to dye the fur - enter 6");
        System.out.println("We can keep the current color of the fur at this point in time and finish abusing the animal - enter 7");
        System.out.println("<=====================================================================================================>");
        int number = sc.nextInt();
        if (number == 6) {
            System.out.println("Enter:'1' if you want to change the color to brown");
            System.out.println("Enter:'2' if you want to change the color to blue");
            System.out.println("Enter:'3' if you want to change the color to white");
            System.out.println("Enter:'4' if you want to cut the fur bare");
            choose = sc.nextInt();
            changeColor();
        } else if(number == 7){
            System.out.println("From now on, we will no longer trust you with a paint brush and a razor.Good day !");
            System.out.println("<======================================================================================>");
            System.out.println("Heeey! Hello man! We are cool cat brothers - let us introduce ourselves.");
        }else if(number == 5){
            System.out.println("Now fur color is:"+color);
            sayGoodbye();
        }
    }
    void  sayHello() {
        System.out.println("Hello there ! I'm - " + kind + "." + " I am a small animal with a typical marten appearance! I have a long body, neck and tail, but short legs.");
        System.out.println("And my fur changes twice a year... well, it depends on the season. In winter it is white, and in summer I am two-colored - my upper body is brown-red, and my belly is yellowish-white.");
        System.out.println("Now i'm " + color + "." + "But soon I will change the color of my fur");
        System.out.println("If u wont, u can help me, but gently and carefully");
        System.out.println("<======================================================================================>");
        sayGoodbye();
    }
    void changeColor(){
        if (choose == 1) {
            System.out.println("Yor change fur color to brown(summer style)");
            color = "brown";
            sayGoodbye();
        } else if (choose == 2) {
            System.out.println("Yor change fur color to blue(interesting style)");
            color = "blue";
            sayGoodbye();
        } else if (choose == 3) {
            System.out.println("Yor change fur color to white(winter style)");
            color = "white";
            sayGoodbye();
        } else if (choose == 4) {
            System.out.println("Yor cut down all fur(sadist style)");
            color = "bold";
            sayGoodbye();
        }
    }
}
