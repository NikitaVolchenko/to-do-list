package InputAndOutput;

import Case.*;

import java.io.*;

public class ReadAndWriteFromFile {
    public ListOfCases read(String fileName) {
        ListOfCases cases = new ListOfCases();
        try (Reader in = new FileReader(fileName)) {
            int value = in.read();
            while (value != -1) {
                Case case1 = new Case();
                StringBuilder buff = new StringBuilder();
                while (value != '.') {
                    buff.append((char) value);
                    value = in.read();
                }
                case1.setName(buff.toString().replace("\n", "").replace("\r", ""));
                buff = new StringBuilder();
                value = in.read();
                while (value != '.') {
                    buff.append((char) value);
                    value = in.read();
                }
                case1.setDescription(buff.toString().replace("\n", "").replace("\r", ""));
                buff = new StringBuilder();
                value = in.read();
                while (value != '.') {
                    buff.append((char) value);
                    value = in.read();
                }
                case1.setImportance(Importance.UNKNOWN.getByString(buff.toString().replace("\n", "").replace("\r", "")));
                buff = new StringBuilder();
                value = in.read();
                while (value != '.') {
                    buff.append((char) value);
                    value = in.read();
                }
                case1.setStatus(Status.NOT_DONE.getByString(buff.toString().replace("\n", "").replace("\r", "")));
                value = in.read();
                cases.addCase(case1);
                while (value == '\n' || value == '\r') {
                    value = in.read();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cases;
    }

    public void write(String fileName, ListOfCases cases) {
        try (Writer out = new FileWriter(fileName)) {
            for (int i = 0; i < cases.size(); i++) {
                out.write(cases.getToDoList().get(i).getName() + "." + '\n');
                out.write(cases.getToDoList().get(i).getDescription() + "." + '\n');
                out.write(Importance.UNKNOWN.getByImportance(cases.getToDoList().get(i).getImportance()) + "." + '\n');
                out.write(Status.NOT_DONE.getByStatus(cases.getToDoList().get(i).getStatus()) + "." + '\n' + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
