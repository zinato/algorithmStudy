package com.zinato.programmers;

public class Practice {
    public static void main(String[] args) {

        Practice p = new Practice();
        System.out.println(p.solution("01012345678"));


    }

    enum Case {

        ONE(1),
        TWO(2),
        THREE(3),
        OTHERS(-1);
        final int caseNumber;
        Case(int caseNumber) {
            this.caseNumber = caseNumber;
        }

        int getValue() {
            return caseNumber;
        }
    }

    public int solution(String phone_number) {
        //유형 1 = 010-XXX-XXXX
        //유형 2 = 010XXXXXXX
        //유형 3 = +82-10-XXXX-XXXX
        final String caseOneRegEx = "^010-([\\d]{3,4})-([\\d]{4})+$";
        final String caseTwoRegEx = "^010([\\d]{3,4})([\\d]{4})+$";
        final String caseThreeRegEx = "^+82-10-([\\d]{3,4})-([\\d]{4})+$";

        if (phone_number.matches(caseOneRegEx)) {
            return Case.ONE.getValue();
        } else if (phone_number.matches(caseTwoRegEx)) {
            return Case.TWO.getValue();
        } else if (phone_number.matches(caseThreeRegEx)) {
          return Case.THREE.getValue();
        } else {
            return Case.OTHERS.getValue();
        }
    }
}

//https://programmers.co.kr/tryouts/102536/result
