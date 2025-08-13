package lgcns.inspire.inheritance.util;

public enum Division {
    STU("학생"), TEA("강사") ;

    private final String division;
    private Division(String division) {
        this.division = division;
    }

    // 외부에서 접근할 수 있도록 gettter 생성
    public String getDivision() {
        return this.division;
    }
}
