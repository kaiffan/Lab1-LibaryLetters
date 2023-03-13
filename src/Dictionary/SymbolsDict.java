package Dictionary;

import java.io.FileWriter;
import java.io.IOException;

public class SymbolsDict extends Dictionary{
    private final String fileName;

    public SymbolsDict() {
        fileName = "SymbolsDict.txt";
    }

    public void WriteKeyMeaningToDictSymbols(String key, String meaning) throws IOException {
        super.WriteKeyMeaningToDict(key, meaning, this.fileName);
    }

    @Override
    public boolean checkWriteToDict(String key) {
        return true;
    }
}
