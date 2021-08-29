package Lesson1;

public class Team {
public String name;
public Member[] members;
public String sport;

public Team(String name, Member[] members, String sport) {
        this.name = name;
        this.members = members;
        this.sport = sport;
}

public void showTeam() {
        System.out.println("\nСостав команды " + name);
        for (int i = 0; i < members.length; i++) {
                System.out.println("Имя: " + members[i].name + ", Фамилия: " + members[i].secondName + ", Рост: " + members[i].height + ", Возраст: " + members[i].age);
        }

}
}

