package com.example.jaxbwith11;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXmlMain {

  public static void main(String[] args) throws JAXBException {
    Customer customer = new Customer();
    customer.setName("Jared");

    Address address = new Address();
    address.setStreet("123 Any Street");
    address.setCity("Any Town");

    customer.setAddress(address);

    PhoneNumber workPhoneNumber = new PhoneNumber();
    workPhoneNumber.setType("Work");
    workPhoneNumber.setValue("1234567890");

    PhoneNumber cellPhoneNumber = new PhoneNumber();
    cellPhoneNumber.setValue("Cell");
    cellPhoneNumber.setValue("9876543210");

    JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
    Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

    //JAXBElement<Customer> jaxbElement = new JAXBElement<Customer>(new QName(null, "customer"), Customer.class, customer);
    //marshaller.marshal(jaxbElement, System.out);

    marshaller.marshal(customer, new File("miet_02/jaxb-demo/src/main/resources/customer.xml"));
  }

}
