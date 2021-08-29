package Lesson1;

public class Main {
    public static void main(String[] args) {
        // Создаем полосу препятствий
        String[] p = {"Бег", "Стрельба"};
        Course c = new Course(p);

        // Создаем команду
        Member[] list = {new Member("Иван", "Иванов", 180, 20),
                new Member("Петр", "Петров", 185, 21),
                new Member("Мария", "Егорова", 175, 20),
                new Member("Анна", "Сергеева", 177, 22)
        };
        Team team = new Team("Дружба", list, "Лыжи");

        // Просим команду пройти полосу
        c.doIt(team);

        // Показываем результаты
        team.showTeam();


    }
}
