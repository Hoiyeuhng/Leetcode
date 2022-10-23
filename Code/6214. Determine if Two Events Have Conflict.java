class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int h1Start = (event1[0].charAt(0) - '0') * 10 + (event1[0].charAt(1) - '0');
        int h1End = (event1[1].charAt(0) - '0') * 10 + (event1[1].charAt(1) - '0');
        int m1Start = (event1[0].charAt(3) - '0') * 10 + (event1[0].charAt(4) - '0');
        int m1End = (event1[1].charAt(3) - '0') * 10 + (event1[1].charAt(4) - '0');
        int e1Start = h1Start * 60 + m1Start;
        int e1End = h1End * 60 + m1End;

        int h2Start = (event2[0].charAt(0) - '0') * 10 + (event2[0].charAt(1) - '0');
        int h2End = (event2[1].charAt(0) - '0') * 10 + (event2[1].charAt(1) - '0');
        int m2Start = (event2[0].charAt(3) - '0') * 10 + (event2[0].charAt(4) - '0');
        int m2End = (event2[1].charAt(3) - '0') * 10 + (event2[1].charAt(4) - '0');
        int e2Start = h2Start * 60 + m2Start;
        int e2End = h2End * 60 + m2End;
        if (e1Start <= e2Start) {
            if (e1End >= e2Start) {
                return true;
            } 
        } else {
            if (e2End >= e1Start) {
                return true;
            }
        }
        return false;

    }
}