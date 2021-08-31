package Lesson1;
import java.util.Random;

public class Course {
    private String[] pas;
    final Random random = new Random();

    public Course(String[] pas) {
        this.pas = pas;
    };

    public void doIt(Team t) {
        for (int i = 0; i < pas.length; i++) {
            for (int j = 0; j < t.members.length; j++) {
                 if (random.nextBoolean()) {
                    System.out.println("Участник " + t.members[j].name + " " + t.members[j].secondName + " из команды " + t.name + " прошёл " + pas[i]);
                }
            }
        }

    }
}
