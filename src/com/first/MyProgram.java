package com.first;

import java.io.File;
import java.nio.file.Path;

class MyProgram {

    public static void main(String... args) {
        File d;
        Path p;
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

    }

}

interface RobotConnectionManager {
    RobotConnection getConnection();
}

interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}


class RobotConnectionException extends RuntimeException implements RobotConnectionManager {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}

//        int numCommand = sc.nextInt();
//        QueueMFC queueMFC = new QueueMFC();
//        while (numCommand-- > 0) {
//            Command cmd = new Command(sc.nextLine());
//            queueMFC.showResultText(cmd);
//        }
//
//        String line;
//        String name;
//        String into = "";
//        ArrayList<String> list = new ArrayList<>();
//
//        while (sc.hasNextLine()) {
//            line = sc.nextLine();
//
//            if (line.contains("Добавить ")) {
//                name = line.replaceAll("Добавить ", "");
//                list.add(name);
//                System.out.println(name + " в очереди");
//            }
//
//            else if (line.contains("Следующий!")) {
//                if (list.size() > 0) {
//                    name = list.remove(0);
//                    System.out.println(name + " в обработке");
//                    into = name;
//                } else System.out.println("Отлично, попью чаёк!");
//            }
//
//            else if (line.contains("Стоит ли оно того? ")) {
//                if (list.size() < 5) list.add(line.replaceAll("Стоит ли оно того\\? ", ""));
//                else System.out.println("Слабак!");
//            }
//
//            else if (line.contains("Посмотреть очередь")) {
//                if (list.size() > 0) System.out.println(String.join(" ", list));
//                else System.out.println("*прокатилось перекати-поле*");
//            }
//
//            else if (line.contains("занимала за ")) {
//                String[] names = line.replaceAll("занимала за ", "").split(" ");
//                int inx = list.indexOf(names[1]);
//                if (inx > -1 || names[1].equals(into)) list.add(inx + 1, names[0]);
//                else {
//                    System.out.println(names[0] + ", не надо тут ля-ля");
//                    list.add(names[0]);
//                }
//            }
//        }
//    }
//}
//
//class QueueMFC {
//    private final String[] keyWords = {"Добавить ","Следующий!","Стоит ли оно того\\? ","Посмотреть очередь","занимала за "};
//    String newPersonName;
//    String indoorPersonName;
//
//    public QueueMFC(String commandText) {
//
//        for (int j = 0; j < keyWords.length; j++) {
//            if (commandText.contains(keyWords[j])) {
//                newPersonName = commandText.replaceAll(keyWords[j], "");
//                commandExecution(j, newPersonName);
//            }
//        }
//    }
//
//
//    public void showResultText(Command cmd) {
//
//        System.out.println(resutText);
//    }
//}
//
//class Command {
//
//class QueueMF {
//    String newPersonName;
//    String indoorPersonName;
//    String[] keyWords = {"Добавить ","Следующий!","Стоит ли оно того\\? ","Посмотреть очередь","занимала за "};
//    String[] outTexts = {" в очереди"," в обработке","Отлично, попью чаёк!","Слабак!","*прокатилось перекати-поле*",", не надо тут ля-ля"};
//    ArrayList<String> queueList;
//
//
//    void commandProcess(String line) {
//        queueList = new ArrayList<>();
//
//            for (int j = 0; j < keyWords.length; j++) {
//                if (line.contains(keyWords[j])) {
//                    newPersonName = line.replaceAll(keyWords[j], "");
//                    commandExecution(j, newPersonName);
//                }
//            }
//
//
//    }
//
//    void commandExecution (int id, String newPersonName) {
//        switch (id) {
//            case 0: queueList.add(newPersonName);
//                    break;
//            case 1: newPersonName = queueList.remove(0);
//                    indoorPersonName = newPersonName;
//                    break;
//            case 2: if (queueList.size() < 5) queueList.add(newPersonName);
//                    else id++;
//                    break;
//            case 3:
//            case 4:
//        }
//        System.out.println(newPersonName + outTexts[id]);
//    }
//
//}

/*

15
Добавить Игорь
Добавить Антон
Добавить Катя
Лиза занимала за Игорь
Посмотреть очередь
Стоит ли оно того? Вася
Следующий!
Валя занимала за Игорь
Следующий!
Следующий!
Посмотреть очередь
Следующий!
Следующий!
Следующий!
Посмотреть очередь

Игорь в очереди
Антон в очереди
Катя в очереди
Игорь Лиза Антон Катя
Игорь в обработке
Лиза в обработке
Валя, не надо тут ля-ля
Антон в обработке
Катя в обработке
Вася Валя
Вася в обработке
Валя в обработке
Отлично, попью чаёк

"*прокатилось перекати-поле*"

*/