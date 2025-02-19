public class Person1 {
    private int birth=2000;
    public int getBirth(){
        return birth; //等同于return this.birth
    }
    public void setAge(int birth){
        this.birth=birth;
    }


    public int getAge() {
        return calcAge(2024);
    }

    private int calcAge(int currYears) {
        return currYears - this.birth;
    }
}
