package com.zinato.leet_code.pratice;

import java.util.LinkedList;

public class BrowserHistory {

    private LinkedList<String> list = new LinkedList<>();
    private int index = 0;

    //문제분석

    /**
     *  browser : url 방문 history
     *  1 -> 2 -> 3
     *
     *  LinkedList 활용
     *
     *
     * @param homepage
     */

    public BrowserHistory(String homepage) {
        list.add(homepage);
    }

    public void visit(String url) {
        index++;
        list.add(index, url);
        //그 전꺼 전부 삭제
        while(index < list.size() - 1) {
            list.removeLast();
        }

    }

    public String back(int steps) {
        if (index - steps < 0) {
            index = 0;
            return list.getFirst();
        }
        index -= steps;
        return list.get(steps);

    }

    public String forward(int steps) {
        //step과 index를 합친 것이 list 전체 사이즈 보다 크면 제일 마지막 값 getLast();
        // 아니면 return list.get(steps);
        if (index + steps > list.size() - 1) {
            index = list.size() - 1;
            return list.getLast();
        }
        index += steps;
        return list.get(steps);



    }

    /**
     * Your BrowserHistory object will be instantiated and called as such:
     * BrowserHistory obj = new BrowserHistory(homepage);
     * obj.visit(url);
     * String param_2 = obj.back(steps);
     * String param_3 = obj.forward(steps);
     */
}