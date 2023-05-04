//Design patterns are solutions to general problems that software developers faced during software development.
//advantages-It solves recurring problems,saves time,reuseability of code,makes code easy to understand and debug.
//three categories - creational, structural, and behavioral design patterns
//creational design pattern-It is concerned with the way of creating objects. 
//These design patterns are used when a decision must be made at the time of instantiation of a class
package DesignPatterns;
//Builder is a creational design pattern, which allows constructing complex objects step by step.

public class BuilderPattern {
    public static void main(String[] args) {
        Employee employee = Employee.Builder.newInstance() //It is used to create and initialize a new instance of this constructor class.
        .setName("Sweta")
        .setLocation("Bangalore")
        .build();
        System.out.println(employee);
    }
}

final class Employee {
 
    // final instance fields
    private final String name;
    private final String location;
 
    public Employee(Builder builder)
    {
        this.name = builder.name;
        this.location = builder.location;
    }
 
    // Static class Builder
    public static class Builder {
 
        /// instance fields
        private String name;
        private String location;
 
        public static Builder newInstance()
        {
            return new Builder();
        }
 
        private Builder() {}
 
        // Setter methods
        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }
        public Builder setLocation(String location)
        {
            this.location = location;
            return this;
        }
 
        // build method to deal with outer class
        // to return outer instance
        public Employee build()
        {
            return new Employee(this);
        }
    }
 
    @Override
    public String toString()
    {
        return  " name = " + this.name +", location = " + this.location;
    }
}