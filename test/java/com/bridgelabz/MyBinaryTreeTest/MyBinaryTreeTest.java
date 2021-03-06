package com.bridgelabz.MyBinaryTreeTest;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	@Test
	public void givenNumber_WhenAddedToBST_SHouldReturnSize13() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(11);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		myBinaryTree.add(95);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(13, size);
	}
	@Test
	public void givenNumber_WhenSearchedToBST_SHouldReturnTrue() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(11);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		myBinaryTree.add(95);
		boolean result = myBinaryTree.search(63);
		Assert.assertEquals(true, result);
	}
}
