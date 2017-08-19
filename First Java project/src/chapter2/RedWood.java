package chapter2;
//Question 9
public class RedWood extends Tree{
	public static void main(String[] args) {
		new Redwood().go();
	}
	void go() {
		go2(new Tree(), new Redwood());
		  go2((Redwood) new Tree(), new Redwood());
	}
	void go2(Tree t1, RedWood r1) {
		RedWood r2 = (RedWood)t1;
		Tree t2 = (Tree)r1;
	}
}
class Tree{
	
}
