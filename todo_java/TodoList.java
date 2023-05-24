class TodoList {
  private String title;
  private int limit;
  private boolean status;

  TodoList(String title, int limit) {
    this.title = title;
    this.limit = limit;
  }

  public void printData() {
    System.out.println(this.title);
    System.out.println("期限：" + this.limit);
  }
}
