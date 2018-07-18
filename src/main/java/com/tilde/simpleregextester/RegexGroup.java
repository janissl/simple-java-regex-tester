package com.tilde.simpleregextester;

/**
 * Created by janis.slapins on 5/20/2017.
 */
public class RegexGroup {
    private int start;
    private int end;
    private String val;

    RegexGroup(int start, int end, String rx) {
        this.start = start;
        this.end = end;
        this.val = rx.substring(start, end + 1);
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getLength() {
        return end - start;
    }

    public String toString() {
        return val;
    }

    static int compareMC(RegexGroup first, RegexGroup second) {
        return first.getStart() - second.getStart();
    }
}
