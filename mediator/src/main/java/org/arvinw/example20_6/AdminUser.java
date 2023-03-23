package org.arvinw.example20_6;

public class AdminUser extends User{

    protected AdminUser(String name) {
        super(name);
    }

    public void kick(User user){
        System.out.println("管理员踢人啦！");
        user.logout();
        System.out.println(user.getName() + "被踢出群聊");
    }
}
