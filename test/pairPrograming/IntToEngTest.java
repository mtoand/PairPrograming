package pairPrograming;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEngで0をzeroと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで１をoneと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで11をelevenと英訳する(){
		IntToEng ite = new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void translateEngで20をtwentyと英訳する(){
		IntToEng ite = new IntToEng();
		String expected = "twenty ";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
	}

	@Test
	public void translateEngで32をthirty_twoと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "thirty two";
		String actual = ite.translateEng(32);
		assertThat(actual,is(expected));		
	}
}
