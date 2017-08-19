package DemoProject;

abstract class AbstractClassExample {
	private String abstractClassExamplName;
	private String abstractClassExampleSection;
	private int abstractClassExamplePercent;
	
	public AbstractClassExample(String name, String section, int percent) {
		System.out.println("Constructing an AbstractClassExample");
		abstractClassExamplName=name;
		abstractClassExampleSection=section;
		abstractClassExamplePercent=percent;
	}
	public String getAbstractClassExampleName() {
		return abstractClassExamplName;
	}
	public String getAbstractClassExampleSection() {
		return abstractClassExampleSection;
	}
	public int getAbstractClassExamplePercent() {
		return abstractClassExamplePercent;
	}
	public void setAbstractClassExampleName(String name) {
		abstractClassExamplName=name;
	}
	public void setAbstractClassExampleSection(String section) {
		abstractClassExampleSection=section;
	}
	public void setAbstractClassExamplePercent(int percent) {
		abstractClassExamplePercent=percent;
	}
	public abstract int Hello();
}
class AbstractDemo{
	public static void main(String[] args) {
		AbstractClassExample obj1= new AbstractClassExample("Amit","C",75);
		System.out.println("Hello");
		obj1.getAbstractClassExampleName();
	}
}
