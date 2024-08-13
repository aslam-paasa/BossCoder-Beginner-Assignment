package _10_Recursion_Basic;

import java.util.Scanner;

public class _12_TowerOfHanoi {


    /**  
     *      |
     *   +--|--+
     *   |  |  |   1   |          |
     *  +---|---+      |          |
     *  |   |   |  2   |          |
     * +----|----+     |          |
     * |    |    | 3   |          |
     * +----+----------+----------+-----+
     *      A          B          C
     * 
     * We have to print the instructions that are required to move
     * discs from A to B, by following the rules:
     * 1. One at a time
     * 2. Can't place smaller on larger disc
     * 
     * 1. Expectation: function toh(3, A, B, C)
     * => Print all required instructions following which we can move
     *    3 dics from A to B using C.
     * 
     * 2. Faith: function toh(2, A, B, C)
     * => This will print all instructions following which we can move
     *    two discs from A to B using C, by following the rules.
     * 
     * 3. EwF: 
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
        toh(n, t1id, t2id, t3id);
    } 

    /**
     * 1. Expectation => toh(3, A, B, C) => It is supposed to print
     *    valid (rule-following) instructions to move 3 discs from
     *    A to B using C.
     * 2. Faith1 => toh(2, A, C, B) => It will print valid instructions
     *    to move 2 discs from A to C using B.
     * 3. Faith2 => toh(2, C, B, A) => It will print valid instructions
     *    to move 2 discs from C to B using A.
    */
    public static void toh(int n, int t1id, int t2id, int t3id) {
        if(n == 0) {
            return;
        }
        toh(n-1, t1id, t3id, t2id); // t1 has only 1 disc now, t2 is empty, t3 has two discs
        System.out.println(n + "[" + t1id + "->" + t2id + "]"); // t1 is empty, t2 has 3rd disc, t3 has top two discs
        toh(n-1, t3id, t2id, t1id); // t1 is empty, t2 has all discs, t3 is empty
    }
}
