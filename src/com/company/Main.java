package com.company;

import com.company.Serialization_Deserialization.Human;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main {

    private static String generateXml(Object obj, Class objClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(objClass);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(obj, sw);
        return sw.toString();
    }

    public static void main(String[] args) throws Exception {
        Human human = new Human("David",26);
        System.out.println(generateXml(human,Human.class));
    }
}
