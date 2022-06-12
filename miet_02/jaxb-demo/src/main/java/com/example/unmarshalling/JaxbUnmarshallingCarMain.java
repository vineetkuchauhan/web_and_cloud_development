package com.example.unmarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshallingCarMain {

  public static void main(String[] args) {
    JAXBContext jaxbContext = null;

    try {
      jaxbContext = JAXBContext.newInstance(Car.class);

      File file = new File("miet_02/jaxb-demo/src/main/resources/car.xml");

      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

      Car car = (Car) unmarshaller.unmarshal(file);

      System.out.println(car);

    } catch (JAXBException e){
      e.printStackTrace();
    }
  }

}
