package Basics;
import basicsPlus.accessModifiers;
public class outsideAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accessModifiers accMod1 = new accessModifiers();
		accMod1.var3++;
		accMod1.fuction3();
		
		
		OutsideAccessExt accModExt1 = new OutsideAccessExt();
		accModExt1.var3++;
		accModExt1.fuction3();
		accModExt1.newExtFunction();
	}

}
