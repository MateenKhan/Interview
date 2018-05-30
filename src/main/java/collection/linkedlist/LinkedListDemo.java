package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<asdf> list = new LinkedList<>();
		list.add(new asdf("a1"));
		list.add(new asdf("a2"));
		list.add(new asdf("a3"));
		System.out.println(list.size());
	}

}
class asdf{
	
	private String name;
	asdf(String name){
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}