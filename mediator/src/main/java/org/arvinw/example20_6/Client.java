package org.arvinw.example20_6;

public class Client {
    /**
     *
     * @param args
     * 中介模式：中介模式是指一个实体被抽象出来，作为客户端和服务器之间的中间层
     * 此案例中聊天室被抽象出来，内含用户
     */
    public static void main(String[] args) {
        PrivateChatRoom privateChatRoom = new PrivateChatRoom("private room");

        AdminUser admin = new AdminUser("admin");
        admin.login(privateChatRoom);
        User zs = new User("张三");
        User ls = new User("李四");

        zs.login(privateChatRoom);
        ls.login(privateChatRoom);

        admin.talk(zs,"你好，管理员，李四在吗。");
        admin.talk(ls,"李四并不在。");

        admin.kick(zs);

    }
}
