package ch01;
class Apple{    //사과
    public String toString(){
        return "I am an apple";
    }
}
class Orange{    //오렌지
    public String toString(){
        return "I am an Orange";
    }
}
class AppleBox{    //사과 담는 상자
    private Apple ap;

    public void set(Apple a){
        ap = a;
    }
    public Apple get(){
        return ap;
    }
}
class OrangeBox{    //오렌지 담는 상자
    private Orange or;

    public void set(Orange o){
        or = o;
    }
    public Orange get(){
        return or;
    }
}
public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox aBox = new AppleBox(); //사과 생성
        OrangeBox oBox = new OrangeBox();   //오렌지 생성

        aBox.set(new Apple());  //사과를 사과 상자에 담는다.
        oBox.set(new Orange()); //오렌지를 오렌지 상자에 담는다.

        Apple ap = aBox.get();  //상자에서 사과를 꺼낸다.
        Orange or = oBox.get(); //상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(or);
    }
}


