/*class Main {
    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();
        a자동차1.최고속력 = 280;
        a자동차2.최고속력 = 210;

        //System.out.println(a자동차1.최고속력);
    }
}
class 자동차 {
    public int 최고속력;

    void 달리다() {
        int 최고속력 = 280;
        System.out.println("자동차가 최고 속력" + this.최고속력 + "km로 달립니다.");
    }
}*/

class Main {
    public static void main(String[] args) {

        // 구현시작
        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();

        a자동차1.최고속력 = 230;
        a자동차2.최고속력 = 210;
        // 구현끝

        a자동차1.달리다();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        a자동차2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class 자동차 {
    int 최고속력;

    void 달리다() {
        System.out.println("자동차가 최고속력 " + 최고속력 + "km로 달립니다.");
    }
}