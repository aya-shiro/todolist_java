import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("現在のTodoリスト");
    TodoList todo = null;

    System.out.print("追加するTodo：");
    String title = scanner.next();
    System.out.print(title + "の期限：");
    int limit = scanner.nextInt();

    // titleがis.Empty[ではない"!"] = タイトルが入力され、かつlimitがあるとき
    if (!title.isEmpty() && limit > 0) {
      todo = new TodoList(title, limit);
      System.out.println(title + "を追加しました。期限は" + limit + "までです");
    } else {
      System.out.println("入力が無効です。Todoの追加はスキップされます。");
    }

    System.out.println("----------------");

    System.out.println("更新後のTodoリスト");
    if (todo != null) {
      todo.printData();
    } else {
      System.out.println("Todoリストは更新されていません");
    }
  }
}