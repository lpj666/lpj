package Test05;

public class Test05 {
    public static void main(String[] args) {
        Phone njy=new Phone("诺基亚",100);
        SmartPhone s=new SmartPhone("华为",3000);
        njy.call("蜡笔小新");
        njy.sendMessage("蜡笔小新");
        s.call("樱桃小丸子");
        s.sendMessage("樱桃小丸子");
        s.playGame();
        Pad p=new Pad("iPad",2000);
        p.listenMusic();
        p.playGame();
    }
}
