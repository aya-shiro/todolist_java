  class Element {
    public static int count = 0;
    public int createId;
    public String elementName;
    public String about;
    public double height;
    public double width;

    public void printData() {
      System.out.println("これは" + createId + "つ目の" + elementName + "です");
    }
  }