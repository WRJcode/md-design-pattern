package org.arvinw.example20_6;

public class PrivateChatRoom extends ChatRoom{

    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    public synchronized void register(User user){
        if (users.size() == 2){
            System.out.println("系统消息:聊天室已满," + user.getName() + "无法进入。");
            return;
        }
        super.register(user);
        System.out.print("系统消息，欢迎【");
        System.out.print(user.getName());
        System.out.println("】加入2人聊天室【" + name + "】" );
    }


    @Override
    public void deregister(User user){
        super.deregister(user);
        System.out.println("系统消息：" + user.getName() + "离开聊天室。");
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        users.forEach(user -> user.listen(from,to,msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {

        return from.getName() + "说：" + msg;
    }
}
