package ConsoleApp;

import java.io.IOException;
import java.util.Scanner;
import Dictionary.NumberDict;
import Dictionary.SymbolsDict;

public class Console {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        NumberDict numberDict = new NumberDict();
        SymbolsDict symbolsDict = new SymbolsDict();

        System.out.println("Введите ключ для занесения в словарь: ");
        String key = scanner.nextLine();

        System.out.println("Введите значение для этого ключа: ");
        String meaning = scanner.nextLine();

        numberDict.WriteKeyMeaningToDictNumber(key, meaning);
        symbolsDict.WriteKeyMeaningToDictSymbols(key, meaning);
    }
}
