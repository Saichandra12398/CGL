import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitConwaysgameoflife {
	@Test
	public void conwaytestone() {
		Conwaysgameoflife game=new Conwaysgameoflife();
		Assertions.assertEquals("_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "", game.check());
	}
}
	


