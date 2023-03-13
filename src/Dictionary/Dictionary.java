package Dictionary;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Dictionary {
    /*Паттерн "Шаблонный метод"*/
    public String appendRecordToDict(String key, String meaning, String fileName, boolean checkWriteToDict) {
        if (checkWriteToDict) {
            try(FileWriter fw = new FileWriter(fileName, true)) {
                fw.write(key + "-" + meaning);
                fw.write('\n');
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            return "Ключ и значение успешно записаны в словарь!";
        }
        return "Вы ввели некорректный ключ";
    }

    public void WriteKeyMeaningToDict(String key, String meaning, String fileName) throws IOException {
        if (checkWriteToDict(key)) {
            WriteKeyMeaningToFile(key, meaning, fileName);
            return;
        }
        throw new IOException("Input key is invalid");
    }

    public void WriteKeyMeaningToFile(String key, String meaning, String fileName){
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(key + "-" + meaning);
                fileWriter.write('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public abstract boolean checkWriteToDict(String key);
}
