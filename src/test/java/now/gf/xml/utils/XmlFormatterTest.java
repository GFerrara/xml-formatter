package now.gf.xml.utils;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.stream.XMLStreamException;

import now.gf.xml.utils.XmlFormatter;

import org.junit.Assert;
import org.junit.Test;

public class XmlFormatterTest {
	
	@Test
	public void doFormatting() throws XMLStreamException, IOException {
		Reader in = new StringReader("<root><!-- this is for testing --><level1 a=\"1\" b=\"2\"><level2>value 1</level2><level2>value 2</level2></level1></root>");
		Writer out = new StringWriter();
		XmlFormatter xmlFormatter = new XmlFormatter();
		xmlFormatter.format(in, out);
		Assert.assertNotSame("", out.toString());
		// show output
		System.out.println(out.toString());
	}
}
