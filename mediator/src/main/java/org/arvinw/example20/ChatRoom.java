package org.arvinw.example20;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private String name;

    public ChatRoom(String name){
        this.name = name;
    }

    List<User> users = new ArrayList<>();

    public void register(User user){
        this.users.add(user);
        System.out.print("系统消息:欢迎【");
        System.out.print(user.getName());
        System.out.println("】加入聊天室" + this.name + "】");
    }

    public void sendMsg(User fromWhom,String msg){
        users.stream().forEach(toWhom -> toWhom.listen(fromWhom,msg));
    }
}
