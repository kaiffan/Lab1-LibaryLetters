package Dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NumberDict extends Dictionary{
    private final String fileName;

    public NumberDict() {
        fileName = "NumberDict.txt";
    }

    public void WriteKeyMeaningToDictNumber(String key, String meaning) throws IOException {
        super.WriteKeyMeaningToDict(key, meaning, this.fileName);
    }

    @Override
    public boolean checkWriteToDict(String key) {
        return true;
    }
}
