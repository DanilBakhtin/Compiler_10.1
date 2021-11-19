package Main;

public class Main {

    public static void main(String[] args) {

        ProgrammingLanguage pl = new ProgrammingLanguage();

        Compiler compiler = pl.choiceLanguage();

        compiler.run("code.txt");

        System.out.println("\nПрограмма выполнена!");

    }
}
