class Assignment31{
	public static void main(String args[]){
		String sString= "Wipro";
		Object refObject = sString;
		String sStr = (String)refObject;

		Integer objInteger = new Integer(10);
		refObject = objInteger;
		Integer refInteger = (Integer)refObject;

		sStr =refObject.toString();
		System.out.println(sStr);

	}
}
