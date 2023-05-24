import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    TodoList list = new TodoList("タイトル", 27);
    System.out.println("現在のTodoリスト");
    list.printData();
    System.out.println("----------------");
    System.out.print("追加するTodo：");
    String title = scanner.next();
    System.out.print(title + "の期限：");
    int limit = scanner.nextInt();

    System.out.println(title + "を追加しました。期限は" + limit + "までです");

    System.out.println("更新後のTodoリスト");
    list.printData();
  }
}