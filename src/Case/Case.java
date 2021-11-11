package Case;

import java.util.Scanner;

public class Case {
    private String name;
    private String description;
    private String importance;
    private boolean status;

    public Case() {
    }

    public Case(String name, String description, String importance, boolean status) {
        this.name = name;
        this.description = description;
        this.importance = importance;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Case.Case{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", importance='" + importance + '\'' +
                '}';
    }

    public Case makeCaseFromConsole() {
        System.out.println("Введите название дела: ");
        Scanner in = new Scanner(System.in);
        String str = "";
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        name = str;
        System.out.println("Введите описание дела: ");
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        description = str;
        System.out.println("Введите важность дела: ");
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        importance = str;
        System.out.println("Введите статус выполнения дела - true/false: ");
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        status = str.equals("true");
        return this;
    }
}
