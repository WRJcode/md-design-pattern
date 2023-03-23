package org.arvinw.example19_4;

public class Client {

    /**
     *
     * @param args
     * 备忘录模式：备忘录模式（Memento Pattern）是一种行为型设计模式，它允许将一个
     * 对象的状态捕获并存储到一个备忘录对象中，以便在需要的时候可以将对象恢复到原来的状态。备忘录模式通常用于实现撤销操作，它可以使得系统更容易实现回滚操作。
     */

    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("《AI的觉醒》"));

        editor.append("第一章 混沌初开");

        editor.append("\n 正文2000字");

        editor.append("\n第二章荒漠之花\n 正文3000字");

        editor.delete();

        editor.undo();
    }
}
