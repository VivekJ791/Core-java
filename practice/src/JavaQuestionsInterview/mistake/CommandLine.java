package JavaQuestionsInterview.mistake;

public class CommandLine {
    public static void main(String[] args) {
        for(int i=0;i<= args.length-1;i++){
            System.out.println(args[i]);
            Runnable bruh = () -> {
                System.out.println("bruh");
            };
        }
    }
}
