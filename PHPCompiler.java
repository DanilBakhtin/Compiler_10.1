package Main;

/**
 * Компилятор PHP
 */
public class PHPCompiler extends Compiler{

    @Override
    public void run(String file) {

        System.out.println("Загружен файл: " + file);
        lexicalAnalysis();
        syntacticAnalysis();
        semanticAnalysis();
        errorsMessage();
        machineCode();

    }

    /**
     * Реализация абстрактных методов методов
     */
    @Override
    public void lexicalAnalysis() {
        System.out.println("Выполняется лексический анализ...");
    }

    @Override
    public void syntacticAnalysis() {
        System.out.println("Выполняется синтаксический анализ анализ...");
    }

    @Override
    public void semanticAnalysis() {
        System.out.println("Выполняется семантический анализ...");
    }

    @Override
    public void machineCode() {
        System.out.println("Выполняется преобразование в машинный код...");
    }

    @Override
    public void errorsMessage(){
        System.out.println("Обнаружено 0 ошибок...");
    }
}
