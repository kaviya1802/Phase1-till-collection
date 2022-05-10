package com.simplilearn.loops;

import java.util.Scanner;

public class AccountUser {

	public static void main(String[] args) {
		// TODO Accout user Iterator
		int[] account_id = {1196443, 1196442, 1196441, 1196440};
		String bank = "HDFC bank";
		Scanner input = new Scanner(System.in);
		System.out.println("******WELCOME TO HDFC BANK ACCOUNT FINDER******");
		System.out.println("Please enter the account ID :: ");
		int id = input.nextInt();
		findAccount(account_id, id);
	}
	public static void findAccount(int[] account, int id) {
		boolean found = false;
		for (int i = 0 ; i<account.length; i++) {
			if(id == account[i]) {
				System.out.println("The Account is found !!!");
				found = true;
			}
		}if(!found) {
			System.out.println("OOPS!!!The Account not exists!!!!");
		}
		
	}

}
