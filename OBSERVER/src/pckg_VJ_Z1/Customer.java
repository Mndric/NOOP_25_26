package pckg_VJ_Z1;

public class Customer implements CustObserverInt{
    private String userName;
    private int userId;
    private int userCnt;

    public Customer(String userName, int userId, int userCnt) {
        this.userName = userName;
        this.userId = ++userCnt;
        this.userCnt = 0;
    }

    @Override
    public void update(Item item, String message) {
        userCnt++;
        System.out.println("Notification for Customer " + userName + ", ID: " + (userId) + message);
        System.out.println("Item details: " + item.toString());
        System.out.println("Total notifications received: " + userCnt);
        System.out.println("=============================");
    }

    @Override
    public String toString() {
        return "Customer: " + userName + ", Id: " + userId + ", Notifications: " + userCnt;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserCnt() {
        return userCnt;
    }
}
