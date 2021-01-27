package javapractiseuc1;


public class MyLinkedList<K> {
	   public INode<K> head;
	   public INode<K> tail;
		
		public MyLinkedList() {
			this.head = null ;
			this.tail = null ; 		
		}
		
		public void add(INode<K> newNode) {
			if (this.tail == null) {
				this.tail = newNode ;
			}
			
			if (this.head == null) {
				this.head = newNode ;
			}else {
				INode<K> tempNode = this.head;
				this.head = newNode ;
				this.head.setNext(tempNode);
			}
			
			
		}
		
		public void append(INode<K> newNode) {
			if (this.head == null) {
				this.head = newNode ;
			}
			if (this.tail == null) {
				this.tail = newNode ;
			}else {
				INode<K> tempNode = this.tail;
				this.tail = newNode ;
				tempNode.setNext(newNode);
			}
			
		}
		
		public void insert(INode myNode, INode newNode) {
			this.head.setNext(myNode);
			myNode.setNext(newNode);
			
			
		}
		
		public INode<K> search(K key) {
			INode<K> tempNode = head ;
			while (tempNode != null && tempNode.getNext() != null) {
				if (tempNode.getKey().equals(key)) {
					return tempNode ;
				}
				tempNode = tempNode.getNext() ;
			}
			return null ;
		}
		
		public INode pop() {
			INode  tempNode = this.head;
			this.head = head.getNext();			
			return tempNode;
		}
		
		public INode popLast() {
			INode tempNode = head;
			while (!tempNode.getNext().equals(tail)){
				tempNode = tempNode.getNext();
			}
			this.tail = tempNode;
			tempNode = tail.getNext();
			tempNode = null;
			return tempNode ;
		}
		
		public void printMyNodes() {
	       System.out.println("My Nodes: " + head);
		}
		
		public String toString() {
			return "MyLinkedListNodes{" + head + '}' ;
		}
	}
