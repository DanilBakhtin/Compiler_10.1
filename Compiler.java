package Main;

/**
 * Абстрактный класс Компилятор
 */
public abstract class Compiler {

    /**
     * Исходный код
     */
    private String startCode;
    /**
     * Машинный код
     */
    private String machineCode;


    /**
     * Абстрактные методы класса
     */
    //пуск программы
    public abstract void run(String file);

    //лекцический анализ
    public abstract void lexicalAnalysis();

    //синтаксический анализ(парсинг)
    public abstract void syntacticAnalysis();

    //семантический анализ
    public abstract void semanticAnalysis();

    //Машинный код
    public abstract void machineCode();

    //Сообщения об ошибках
    public abstract void errorsMessage();

}
