package org.arvinw.example20;

public class User {

    private String name;

    private ChatRoom chatRoom;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void login(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
        this.chatRoom.register(this);
    }

    public void talk(String msg){
        chatRoom.sendMsg(this,msg);
    }

    public void listen(User fromWhom,String msg){
        System.out.print("【" + this.name + "的对话框】");
        System.out.println(fromWhom.getName() + "说：" + msg);
    }

}
