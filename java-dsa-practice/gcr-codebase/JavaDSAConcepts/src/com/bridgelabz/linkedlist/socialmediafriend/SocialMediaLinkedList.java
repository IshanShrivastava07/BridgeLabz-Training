package com.bridgelabz.linkedlist.socialmediafriend;

public class SocialMediaLinkedList {

    private UserNode head;

    // Add user
    public void addUser(int id, String name, int age) {
        UserNode user = new UserNode(id, name, age);
        user.next = head;
        head = user;
    }

    // Find user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public void addFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) return;

        u1.friends = addFriend(u1.friends, userId2);
        u2.friends = addFriend(u2.friends, userId1);
    }

    private FriendNode addFriend(FriendNode head, int friendId) {
        FriendNode node = new FriendNode(friendId);
        node.next = head;
        return node;
    }

    // Remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) return;

        u1.friends = removeFriend(u1.friends, userId2);
        u2.friends = removeFriend(u2.friends, userId1);
    }

    private FriendNode removeFriend(FriendNode head, int friendId) {
        if (head == null) return null;

        if (head.friendId == friendId)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != friendId)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;
        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Search by name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Search by ID
    public void searchById(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            printUser(user);
        else
            System.out.println("User not found");
    }

    // Count friends
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void printUser(UserNode u) {
        System.out.println(u.userId + " | " + u.name + " | Age: " + u.age);
    }
}
