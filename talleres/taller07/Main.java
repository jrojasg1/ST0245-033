class Main {
  public static void main(String[] args) {
    LinkedListJuliancho l = new LinkedListJuliancho();

    l.insert('c', 0);
    l.insert('c', 0);
    l.insert('c', 0);
    l.insert('c', 0);
    l.eliminar(0);
    System.out.println(l.contains('c'));
    System.out.println( l.size());
  }
}