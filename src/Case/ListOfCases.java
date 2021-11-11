package Case;

import java.util.ArrayList;
import java.util.List;

public class ListOfCases {
    private List<Case> toDoList = new ArrayList<>();

    public ListOfCases() {
    }

    public ListOfCases(ListOfCases listOfCases) {
        this.toDoList = listOfCases.toDoList;
    }

    public void addCase(Case case1) {
        toDoList.add(case1);
    }

    public void deleteCase(int i) {
        if (i >= 0 && i < toDoList.size()) {
            toDoList.remove(i);
        }
    }

    public void markAsCompleted(int i) {
        if (i > 0 && i < toDoList.size()) {
            toDoList.get(i).setStatus(true);
        }
    }

    public void showListOfAllCases() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Индекс: " + i);
            System.out.println("Дело: " + toDoList.get(i).getName());
            System.out.println("Описание: " + toDoList.get(i).getDescription());
            System.out.println("Важность: " + toDoList.get(i).getImportance());
            System.out.println("Сатус: " + toDoList.get(i).isStatus());
        }
    }

    public void showListOfCompletedCases() {
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).isStatus()) {
                System.out.println("Индекс: " + i);
                System.out.println("Дело: " + toDoList.get(i).getName());
                System.out.println("Описание: " + toDoList.get(i).getDescription());
                System.out.println("Важность: " + toDoList.get(i).getImportance());
                System.out.println("Сатус: " + toDoList.get(i).isStatus());
            }
        }
    }

    public int size() {
        return toDoList.size();
    }

    public List<Case> getToDoList() {
        return toDoList;
    }
}