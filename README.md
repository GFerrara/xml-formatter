xml-formatter
=============
This is an XML beautifier: it reads a provided XML and indents it. 

*Why do we need such a project when Java already provides a simple way to format XML by mean of XSLT identity transformation?*

Mainly for two reasons.

1. This project provides you with the ability to format also CDATA sections, when they contain XML
2. The project is easly configurable.

For the curious one, the XSLT identity transformation for formatting an XML can be implemented as follow:

```
Source xmlInput = new StreamSource(new StringReader("<root><elem1/><elem2/></root>"));
StreamResult xmlOutput = new StreamResult(new StringWriter());
Transformer transformer = TransformerFactory.newInstance().newTransformer(); 
transformer.setOutputProperty(OutputKeys.INDENT, "yes");
transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
transformer.transform(xmlInput, xmlOutput);
```

Conversely, using xml-formatter, we can do as follow:

```
Reader in = new StringReader("<root><elem1/><elem2/></root>");
Writer out = new StringWriter();
XmlFormatter xmlFormatter = new XmlFormatter(4);
xmlFormatter.format(in, out);
```
