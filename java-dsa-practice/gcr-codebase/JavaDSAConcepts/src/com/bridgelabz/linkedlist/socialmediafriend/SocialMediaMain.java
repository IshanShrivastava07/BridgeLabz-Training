package com.bridgelabz.linkedlist.socialmediafriend;

public class SocialMediaMain {
	public static void main(String[] args) {

        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        sm.addUser(1, "Amit", 22);
        sm.addUser(2, "Neha", 21);
        sm.addUser(3, "Rahul", 23);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);

        sm.searchByName("Neha");
        sm.countFriends();

        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
    }
}
