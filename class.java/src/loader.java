//all classes are loaded dynamically and in recursive way
public void loader() throws ClassNotFoundException {

    System.out.println("Classloader of class:"
        + PrintclassLoader.class.getclassLoader());

    System.out.println("Classloader of Logging:"
        + Logging.class.getclassLoader());

    System.out.println("Classloader of ArrayList:"
        + ArrayList.class.getclassLoader());
}