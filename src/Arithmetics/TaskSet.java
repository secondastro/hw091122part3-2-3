package Arithmetics;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskSet {
    private final Set<Task> taskSet = new HashSet<>(15);

    public TaskSet() {
        Random random = new Random();
        while (taskSet.size() < 15) {
            int value1 = random.nextInt(10);
            int value2 = random.nextInt(10);
            if (value1 < 2) {
                value1 = 2;
            }
            if (value2 < 2) {
                value2 = 2;
            }
            taskSet.add(new Task(value1, value2));
        }

    }

    @Override
    public String toString() {
        return taskSet.toString();
    }
}
