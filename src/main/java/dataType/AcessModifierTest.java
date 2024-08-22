package dataType;

import accessModifire.TypesOfAccessModifire;

public class AcessModifierTest {
	//* from different package only public method has access

	public static void main(String[] args) {
		TypesOfAccessModifire toam3= new TypesOfAccessModifire ();
		toam3.livingroom();
	}

}
