class Calculate{
void Cal(String num1,String num2,int base){
		int a = Integer.parseInt(num1,base);
		int b = Integer.parseInt(num2,base);
		int c = a+b;
		System.out.print("Addition of "+num1+" and "+num2+" is ");
		System.out.print(base!=16?base==2?Integer.toBinaryString(c):Integer.toOctalString(c):Integer.toHexString(c));
		System.out.println("\nAnswer in decimal is "+c);
}
}


class AdditionOfAll
{

	public static void main(String[] args)
	{
		Calculate o = new Calculate();
		o.Cal(args[0],args[1],Integer.parseInt(args[2]));
	}
}