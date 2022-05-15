package com.example.marshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbCarMain {

  public static void main(String[] args) {
    JAXBContext jaxbContext = null;

    try{
      jaxbContext = JAXBContext.newInstance(Car.class);

      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

      //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

      Car car = new Car();
      car.setId(1);
      car.setName("Verna");
      car.setPrice(12.00);
      car.setColor("Black");

      jaxbMarshaller.marshal(car, new File("miet_02/jaxb-demo/src/main/resources/car.xml"));
    } catch(JAXBException exception) {
      exception.printStackTrace();
    }
  }

}
