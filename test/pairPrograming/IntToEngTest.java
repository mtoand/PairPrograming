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
	
	@Test
	public void translateEngで100をone_hundredと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで800をeight_hudredと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "eight hundred";
		String actual = ite.translateEng(800);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで152をone_hundred_fifty_twoと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "one hundred fifty two";
		String actual = ite.translateEng(152);
		assertThat(actual,is(expected));		
	}
	@Test
	public void translateEngで1000をone_thousand英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで1234をone_thousand_two_hundred_thirty_fourと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "one thousand two hundred thirty four";
		String actual = ite.translateEng(1234);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで10000をten_thousand英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "ten thousand";
		String actual = ite.translateEng(10000);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで19999をnineteen_thousand_nine_hundred_ninty_nine英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "nineteen thousand nine hundred ninety nine";
		String actual = ite.translateEng(19999);
		assertThat(actual,is(expected));		
	}
	
	@Test
	public void translateEngで20000をtwenty_thousandと英訳する() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected = "twenty thousand";
		String actual = ite.translateEng(20000);
		assertThat(actual,is(expected));		
	}
}
