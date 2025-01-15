class GetSet {

	private String name;
	public String getName() { return name; }
	public void setName(String N)
	{
		this.name = N;
	}
}

class JUET {

	public static void main(String[] args)
	{
		GetSet obj = new GetSet();
		obj.setName("Student");
		System.out.println(obj.getName());
	}
}
