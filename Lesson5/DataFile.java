package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFile {
//1. Реализовать сохранение данных в csv файл;
//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
//Структура csv файла:
//| Строка заголовок с набором столбцов |
//| Набор строк с целочисленными значениями |
//| * Разделитель между столбцами - символ точка с запятой (;) |

    public static void main(String[] args) {
        File file5 = new File("/home/nina/IdeaProjects/java_core/src/Lesson5/datafile.csv");
        List<String> lines = new ArrayList<>();


        try (BufferedReader in = new BufferedReader(new FileReader(file5))) {
            while (in.ready()) {
                lines.add(in.readLine());
            }
            int dataWidth = lines.get(0).split(";").length;
            int dataHeight = lines.size()-1;

            int[][] data = new int[dataHeight][dataWidth];
            for (int i=1; i <= dataHeight; i++) {
                String[] point = lines.get(i).split(";");
                for (int j = 0; j < dataWidth; j++) {
                    data[i-1][j] = Integer.parseInt(point[j]);
                }
            }
            AppData appData = new AppData(lines.get(0).split(";"), data);

            appData.printData();
            }
         catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static class AppData {
        private String[] header;
        private int[][] data;

        public AppData(String[] header, int[][] data) {
            this.header = header;
            this.data = data;
        }

        public void printData() {

            for(int i=0;i < this.header.length*10;i++) System.out.print("-");
            System.out.println();
            for(int i=0;i < this.header.length;i++)
            {
                System.out.printf("| %-8s",this.header[i]);
            }
            System.out.println("|");
            for(int i=0;i < this.header.length*10;i++) System.out.print("-");
            System.out.println("|");

            for(int i=0;i < this.data.length;i++){
                for(int j=0;j< this.data[i].length;j++){
                    System.out.printf("| %-8d",this.data[i][j]);
                }
                System.out.println("|");
            }
            for(int i=0;i < this.header.length*10;i++) System.out.print("-");
        }

   }
}
