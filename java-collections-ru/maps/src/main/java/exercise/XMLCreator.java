package exercise;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class XMLCreator {


    public static void main(String argv[]) {

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("suite");
            doc.appendChild(rootElement);

            // idTag element
            Element idTag = doc.createElement("id");
            rootElement.appendChild(idTag);
            idTag.appendChild(doc.createTextNode("S1"));

            // nameTag element
            Element nameTag = doc.createElement("name");
            rootElement.appendChild(nameTag);
            nameTag.appendChild(doc.createTextNode("Master"));

            //sectionsTag element
            Element sectionsElementTag = doc.createElement("sections");
            rootElement.appendChild(sectionsElementTag);

            //sectionTag element
            Element sectionTag = doc.createElement("section");
            sectionsElementTag.appendChild(sectionTag);

            //sectionNameTag element
            Element sectionNameTag = doc.createElement("name");
            sectionTag.appendChild(sectionNameTag);
            sectionNameTag.appendChild(doc.createTextNode("Имя секции"));

            //casesTag element
            Element casesTag = doc.createElement("cases");
            sectionTag.appendChild(casesTag);

            for (int i = 0; i<3; i++) {
                //caseTag element
                Element caseTag = doc.createElement("case");
                casesTag.appendChild(caseTag);

                //titleTag element
                Element titleTag = doc.createElement("title");
                caseTag.appendChild(titleTag);
                titleTag.appendChild(doc.createTextNode("Название кейса"));

                //templateTag element
                Element templateTag = doc.createElement("template");
                caseTag.appendChild(templateTag);
                templateTag.appendChild(doc.createTextNode("Test Case (Text)"));

                //typeTag element
                Element typeTag = doc.createElement("type");
                caseTag.appendChild(typeTag);
                typeTag.appendChild(doc.createTextNode("Functional"));

                //priorityTag
                Element priorityTag = doc.createElement("priority");
                caseTag.appendChild(priorityTag);
                priorityTag.appendChild(doc.createTextNode("High"));

                //customTag
                Element customTag = doc.createElement("custom");
                caseTag.appendChild(customTag);

                //bfrTag element
                Element bfrTag = doc.createElement("bfr");
                customTag.appendChild(bfrTag);
                bfrTag.appendChild(doc.createTextNode("BFR-4352, BFR-4679, BFR-5598, BFR-6696"));

                //pgTag element
                Element pgTag = doc.createElement("pg");
                customTag.appendChild(pgTag);

                //pgValueTag element
                Element pgValueTag = doc.createElement("value");
                pgTag.appendChild(pgValueTag);
                pgValueTag.appendChild(doc.createTextNode("nabeer"));

            }


            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\test4.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
