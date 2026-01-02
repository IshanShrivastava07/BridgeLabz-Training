package com.bridgelabz.linkedlist.socialmediafriend;

public class UserNode {
	int userId;
    String name;
    int age;

    FriendNode friends;   // nested linked list of friend IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
    }
}
