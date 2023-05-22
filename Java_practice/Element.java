class Element {
  public int count = 0;
  public int createId;
  public String elementName;
  public String about;
  public double height;
  public double width;

  Element(int createId, String elementName,
  String abount, double height, double width) {
    this.createId = createId;
    this.elementName = elementName;
    this.about = about;
    this.height = height;
    this.width = width;
  }

  public void printData() {
    System.out.println("これは" + createId + "つ目の" + elementName + "です");
  }
}