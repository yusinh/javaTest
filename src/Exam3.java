public class Exam3 {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다

        a붉은오리 .날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}
abstract class 날개아이템 {
    abstract void 사용();
}
class 청둥날개 extends 날개아이템 {
    void 사용() {
        System.out.println("청둥오리가 날개로 천천히 날아갑니다.");
    }
}
class 불사조날개 extends 날개아이템 {
    void 사용() {
        System.out.println("흰오리가 불사조 날개로 불타오르며 날아갑니다.");
    }
}
class 로켓날개 extends 날개아이템 {
    void 사용() {
        System.out.println("붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다");
    }
}

class 오리 {
    날개아이템 a날개 = new 청둥날개();
    void 날다() {
        a날개.사용();
    }
}
class 청둥오리 extends 오리 {
    청둥오리() {
        System.out.println("청둥오리가 만들어집니다.");
    }
}

class 흰오리 extends 오리 {
    흰오리() {
        System.out.println("흰오리가 만들어집니다.");
        a날개 = new 불사조날개();
    }
}

class 붉은오리 extends 오리 {
    붉은오리() {
        System.out.println("붉은오리가 만들어집니다");
        a날개 = new 로켓날개();
    }
}