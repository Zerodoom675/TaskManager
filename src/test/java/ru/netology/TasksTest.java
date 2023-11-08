package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void isThisTaskSuitableForTheSearchQuerySimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQuerySimpleTask2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Зайти к брату");
        Assertions.assertFalse(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryEpic2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryEpic3() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Капуста");
        Assertions.assertFalse(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryMeeting2() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isThisTaskSuitableForTheSearchQueryMeeting3() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Во вторник после обеда");
        Assertions.assertFalse(actual);
    }

}
