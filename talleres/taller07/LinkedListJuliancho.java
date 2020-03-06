public class LinkedListJuliancho{
  private Node first;
  private int size;

  public LinkedListJuliancho(){
    this.first = null;
    this.size=0;
  }
  private Node getNode(int index) throws IndexOutOfBoundsException { 
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
  }

  public int size(){
    return size;
  }

  public void insert(char data, int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            Node nuevo = new Node(data);
            nuevo.next =first;
            first = nuevo;
            size++;
        } else if(index != 0){
            Node temp = getNode(index - 1);
            Node nuevo = new Node(data);
            nuevo.next = temp.next;
            temp.next = nuevo;
            size++;
        }else 
        {
            throw new IndexOutOfBoundsException();
        }
  }

  public void eliminar(int index)throws IndexOutOfBoundsException {
        try {
            if (index == 0) {
                Node temp = first;
                first = temp.next;
                size--;
            } else if (index == size - 1) {
                Node temp = getNode(size - 2);
                temp.next = null;
                size--;
            } else {
                Node temp = getNode(index - 1);
                temp.next = temp.next.next;
                size--;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }

    }

 public boolean contains(char data) throws IndexOutOfBoundsException {
        try {
            for (int i = 0; i < size; i++) {
                if (getNode(i).data == data) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }
        return false;
    }
}

