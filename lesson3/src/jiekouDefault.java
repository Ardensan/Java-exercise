//接口可以定义无数个default方法。default方法子类可实现也可不实现
public class jiekouDefault {
    interface playDemo{
        void play();
        default void playOne(){
            System.out.println("play-One");
        }
    }
    class shixian implements playDemo{
        @Override
        public void play() {
            System.out.println("shixianle");
        }
    }
    public static void main(String[] args) {
        jiekouDefault a=new jiekouDefault();
        playDemo ap=a.new shixian();
        ap.play();
        ap.playOne();
    }
}
