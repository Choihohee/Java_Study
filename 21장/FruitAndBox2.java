class Apple {
  public String toString(){
    return "I am an apple";
  }
}

class Orange {
  public String toString(){
    return "I am an Orange";
  }
}

class Box { //무엇이든 담을 수 있는 상자
  private object ob;
  public void set(Object o) {
    ob = o;
  }
  public Object get() {
    return ob;
  }
}

class FruitAndBox2 {
  public static void main(String[] args) {
    Box aBox = new Box(); //상자 생성
    Box oBox = new Box(); //상자 생성
    
    aBox.set(new Apple());  //상자에 사과를 담는다.
    oBox.set(new Orange());  //상자에 오렌지를 담는다.
    
    System.out.println(ap);
    System.out.println(op);
  }
}
    
